package bank.account;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import bank.operation.Operation;
import bank.operation.OperationType;

public class AccountTest {

    @Mock
    private Customer customer;
    private Account account;

    @Before
    public void initialise() {
        account = new Account(customer);
    }

    @Test
    public void should_store_withdrawal() {
        account.addOperation(new Operation(OperationType.DEPOSIT, 100, "", 100));
        assertEquals(1, account.getOperations().size());
    }

}
