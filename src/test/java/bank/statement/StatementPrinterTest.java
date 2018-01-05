package bank.statement;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import bank.account.Account;
import bank.account.Customer;
import bank.operation.Operation;
import bank.operation.OperationType;

public class StatementPrinterTest {
	
	StatementPrinter statementPrinter = new StatementPrinter();
	
	@Mock
    private Customer customer;
    private Account account;

    @Before
    public void initialise() {
        account = new Account(customer);
    }
    
    @Test
    public void printStatement() {
        account.addOperation(new Operation(OperationType.DEPOSIT, 100, "", 100));
        assertEquals(100, account.getOperations().get(0).getBalance());
        account.addOperation(new Operation(OperationType.DEPOSIT, 200, "", 100));
        account.addOperation(new Operation(OperationType.DEPOSIT, 300, "", 100));
        assertEquals(3, account.getOperations().size());
        String found = statementPrinter.printOperations(account);
        
		Assert.assertTrue(found.contains("Date"));
		Assert.assertTrue(found.contains("OPERATION"));
		Assert.assertTrue(found.contains("Amount"));
		Assert.assertTrue(found.contains("Balance"));
    }

}
