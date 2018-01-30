package bank.operation;

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

		public OperationType getOperationType() {
			return operation_Type;
		}

		public void setOperationType(OperationType operation_Type) {
			this.operation_Type = operation_Type;
		}

		public int getOperationAmount() {
			return operation_amount;
		}

		public void setOperationAmount(int operation_amount) {
			this.operation_amount = operation_amount;
		}

		public String getOperationDate() {
			return operation_date;
		}

		public void getOperationDate(String operation_date) {
			this.operation_date = operation_date;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

}
