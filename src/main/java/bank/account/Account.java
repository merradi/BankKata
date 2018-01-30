package bank.account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bank.operation.Operation;

public class Account {
	
	private String account_Id;

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
		return account_Id;
	}

	public void setAccountId(String account_Id) {
		this.account_Id = account_Id;
	}

	public Customer getClient() {
		return client;
	}

	public void setClient(Customer client) {
		this.client = client;
	}
}
