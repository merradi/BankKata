package bank.feature;

import static org.junit.Assert.assertEquals;

import bank.Bank;
import bank.account.Account;
import bank.account.Customer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunDepositWithdrawsAccountTest {
	
	private Bank bank = new Bank();
	private Account account;
	
	
	
	@Given("^create account for Customer \"([^\"]*)\" with (\\d+) EUR in his account$")
	public void create_account_for_Customer(String name, int balance) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		account = bank.createAccount(new Customer(name), balance);
	}

	@When("^he deposits (\\d+) EUR into his account$")
	public void he_deposits_EUR_into_his_account(int amount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 bank.addDepositOperation(account, amount);
	}
	
	@When("^he withdraws (\\d+) EUR from his account$")
	public void he_withdraws_EUR_from_his_account(int amount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bank.addWithdrawOperation(account, amount);
	}
	 
	@Then("^customer new balance is (\\d+) EUR$")
	public void customer_new_balance_is_EUR(int amount) throws Throwable {
		assertEquals(250, bank.getBalance(account));
	}
	
}
