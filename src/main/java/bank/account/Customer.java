package bank.account;

public class Customer {

    private String client_name;

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
