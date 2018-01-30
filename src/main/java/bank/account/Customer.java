package bank.account;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String client_name;
    private List<Account> accounts = new ArrayList<>();

	public Customer(String client_name) {
		this.client_name = client_name;
	}

	public String getClientName() {
		return client_name;
	}

	public void setClientName(String client_name) {
		this.client_name = client_name;
	}

}
