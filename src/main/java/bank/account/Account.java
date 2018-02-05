package bank.account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bank.operation.Operation;

public class Account {
	
	private String accountId;

    private Customer client;

    private List<Operation> operations;

    public Account(Customer client) {
    	this.operations = new ArrayList<>();
        this.client = client;
    }

    public Account(Customer client, List<Operation> operations) {
        this.operations = operations;
        this.client = client;
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public List<Operation> getOperations() {
        return Collections.unmodifiableList(this.operations);
    }

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String account_Id) {
		this.accountId = account_Id;
	}

	public Customer getClient() {
		return client;
	}

	public void setClient(Customer client) {
		this.client = client;
	}
}
