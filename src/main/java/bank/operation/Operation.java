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

		public void setOperationType(OperationType operationType) {
			this.operationType = operationType;
		}

		public int getOperationAmount() {
			return operationAmount;
		}

		public void setOperationAmount(int operationAmount) {
			this.operationAmount = operationAmount;
		}

		public String getOperationDate() {
			return operationDate;
		}

		public void getOperationDate(String operationDate) {
			this.operationDate = operationDate;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

}
