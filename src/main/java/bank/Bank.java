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

public class Bank {

    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public Account createAccount(Customer client, int operationAmount) {
    	
    	DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    	Date today = Calendar.getInstance().getTime();        
    	String reportDate = df.format(today);
    	int balance = operationAmount;
    	
        Account account = new Account(client);
        account.addOperation(new Operation(OperationType.DEPOSIT, operationAmount, reportDate, balance));
        accounts.add(account);
        return account;
    }
    
    public void addDepositOperation(Account account, int operationAmount) throws BankOperationException {
    	if (!isPositive(operationAmount)) {
    		throw new BankOperationException("Amount can't be negative");
    	}
    	int balance = account.getOperations().get(account.getOperations().size()-1).getBalance() + operationAmount;
    	
    	account.addOperation(new Operation(OperationType.DEPOSIT, operationAmount, getDate(), balance));
    	
	}

    
    public void addWithdrawOperation(Account account, int operationAmount) {
        if (!isPositive(operationAmount)) {
            throw new IllegalArgumentException("You must withdraw a positive value!");
        }
        int balance = account.getOperations().get(account.getOperations().size()-1).getBalance() - operationAmount;
        account.addOperation(new Operation(OperationType.WITHDRAWAL, operationAmount, getDate(), balance));
    }
    
    public int getBalance(Account account) {
        List<Operation> operations = account.getOperations();
        
        return operations.get(operations.size()-1).getBalance();
    }

    private boolean isPositive(int amount) {
        return amount > 0;
    }
    
    private String getDate() {
    	DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    	Date today = Calendar.getInstance().getTime();        
    	String reportDate = df.format(today);
    	return reportDate;
    	
    }
}
