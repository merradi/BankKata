package bank.statement;

import bank.account.Account;
import bank.operation.Operation;

public class StatementPrinter {
	
	private static final String HEADER = "| Date | OPERATION | Amount | Balance |";
	
	
	public String printOperations(Account bankAccount) {
		
		StringBuilder result = new StringBuilder();
		result.append(HEADER);
		result.append("\n");
		for (Operation operation : bankAccount.getOperations()) {
			result.append(operation.getOperationDate() + "|" + operation.getOperationType() +
					  "|" + operation.getOperationAmount() + "|" + operation.getBalance());
			result.append("\n");
		}
		
	return result.toString(); 
	}
}
