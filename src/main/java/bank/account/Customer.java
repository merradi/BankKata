package bank.account;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String client_name;
    private List<Account> accounts = new ArrayList<>();

	public Customer(String client_name) {
		this.client_name = client_name;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

}
