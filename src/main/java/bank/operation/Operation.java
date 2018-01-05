package bank.operation;

import java.util.Date;

public class Operation {
	
	  private OperationType operation_Type;
	    private int operation_amount;
	    private String operation_date;
	    private int balance;
	    
		public Operation(OperationType operation_Type, int operation_amount, String operation_date, int balance) {
			this.operation_Type = operation_Type;
			this.operation_amount = operation_amount;
			this.operation_date = operation_date;
			this.setBalance(balance);
		}

		public OperationType getOperation_Type() {
			return operation_Type;
		}

		public void setOperation_Type(OperationType operation_Type) {
			this.operation_Type = operation_Type;
		}

		public int getOperation_amount() {
			return operation_amount;
		}

		public void setOperation_amount(int operation_amount) {
			this.operation_amount = operation_amount;
		}

		public String getOperation_date() {
			return operation_date;
		}

		public void setOperation_date(String operation_date) {
			this.operation_date = operation_date;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

}
