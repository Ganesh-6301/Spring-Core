package springframe3;

public interface BankAccountRepo {
	
	public double getBalance(long accountID);
	public double updateBalance(long accountID,double newBalance);

}
