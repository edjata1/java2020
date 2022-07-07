/**
 * A type of BankAccount where there are charges 
 * for each transaction
 */
public class SavingsAccount extends BankAccount
{
    public static final double TRANSACTION_FEE = 1.00;
    public static final int SAVING_TRANSACTIONS = 3;
    
    private int transactions;
    
    public SavingsAccount(double initialBalance, String id)
    {
        super(initialBalance, id);
        transactions = 0;      
    }
    
    public void deposit(double amount)
    {
        super.deposit(amount);
        transactions++;
    }
    
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        transactions++;
    }
    
    public void endOfMonth()
    {
        int excessTransactions = transactions - SAVING_TRANSACTIONS;
        if (excessTransactions > 0)
        {
            double fee = excessTransactions * TRANSACTION_FEE;
            super.withdraw(fee);
        }
        transactions = 0;
    }
}

