package bank.operation;

public class Operation {
	
	  private OperationType operationType;
	    private int operationAmount;
	    private String operationDate;
	    private int balance;
	    
		public Operation(OperationType operationType, int operationAmount, String operationDate, int balance) {
			this.operationType = operationType;
			this.operationAmount = operationAmount;
			this.operationDate = operationDate;
			this.setBalance(balance);
		}

		public OperationType getOperationType() {
			return operationType;
		}

		public void setOperationType(OperationType operation_Type) {
			this.operationType = operation_Type;
		}

		public int getOperationAmount() {
			return operationAmount;
		}

		public void setOperationAmount(int operation_amount) {
			this.operationAmount = operation_amount;
		}

		public String getOperationDate() {
			return operationDate;
		}

		public void getOperationDate(String operation_date) {
			this.operationDate = operation_date;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

}
