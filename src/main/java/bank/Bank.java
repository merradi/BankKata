package bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import bank.account.Account;
import bank.account.Customer;
import bank.exception.BankOperationException;
import bank.operation.Operation;
import bank.operation.OperationType;
import bank.utils.DateUtils;

public class Bank{

    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public Account createAccount(Customer client, int operation_amount) {
    	
    	DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    	Date today = Calendar.getInstance().getTime();        
    	String reportDate = df.format(today);
    	int balance = operation_amount;
    	
        Account account = new Account(client);
        account.addOperation(new Operation(OperationType.DEPOSIT, operation_amount, reportDate, balance));
        accounts.add(account);
        return account;
    }
    
    public void addDepositOperation(Account account, int operation_amount) throws BankOperationException {
    	if (!isPositive(operation_amount)) {
    		throw new BankOperationException("Amount can't be negative");
    	}
    	int balance = account.getOperations().get(account.getOperations().size()-1).getBalance() + operation_amount;
    	
    	account.addOperation(new Operation(OperationType.DEPOSIT, operation_amount, DateUtils.getDate(), balance));
    	
	}

    
    public void addWithdrawOperation(Account account, int operation_amount) {
        if (!isPositive(operation_amount)) {
            throw new IllegalArgumentException("You must withdraw a positive value!");
        }
        int balance = account.getOperations().get(account.getOperations().size()-1).getBalance() - operation_amount;
        account.addOperation(new Operation(OperationType.WITHDRAWAL, operation_amount, DateUtils.getDate(), balance));
    }
    
    public int getBalance(Account account) {
        List<Operation> operations = account.getOperations();
        
        return operations.get(operations.size()-1).getBalance();
    }

    private boolean isPositive(int amount) {
        return amount > 0;
    }
    
   
}
