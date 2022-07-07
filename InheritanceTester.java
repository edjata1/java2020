/**
@author Empress Djata 
@version 1.0
*/

public class InheritanceTester{
    public static void main(String[] args){

        //Creating objects and testing
        SavingsAccount tom = new SavingsAccount(5000);
        
        SavingsAccount kim = new SavingsAccount();
        
        tom.withdraw(100);
        tom.withdraw(1000);
        tom.withdraw(200);
        
        //print error message: Insufficient balance
        kim.withdraw(100);
        //print $3700 as balance
        System.out.println(tom);
        tom.withdraw(1000);
        //print new balance of $2690, and fee charged
        System.out.println(tom);
        tom.withdraw(1000);
        //print new balance of $1690
        System.out.println(tom);

    }
}

//Class BankAccount
class BankAccount
{
    private double balance;
    public BankAccount()
    { balance = 0; }

    public BankAccount(double initialBalance)
    { balance = initialBalance; }

    public void deposit(double amount)
    { balance = balance + amount; }

    public void withdraw(double amount)
    { balance = balance - amount; }

    public double getBalance()
    { return balance; }

    @Override
    public String toString() {
        return "BankAccount: Balance = $" + balance;
    }
}

/*
* @SavingsAccount class
* @extends BankAccount
*/
class SavingsAccount extends BankAccount{

    //Member variables for balance and withdraw count checker
    private double balance;
    int countCheck;

    //Constructor 1
    public SavingsAccount()
    {
        balance = 0;
    }

    //Constructor 2 arguments
    public SavingsAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    //Function bank fee - deduct $10 after 3 withdraws
    public void withdrawDeduction()
    {
        balance = balance - 10;
        countCheck = 0;
    }

    //Withdraw function of Bank Account class modified
    @Override
    public void withdraw(double amount)
    {
        if ((balance - amount < 0) || (amount < 0))
        {
            System.out.println("Insufficient Balance");
        }
        else
            {
            balance = balance - amount;
            
            countCheck++;
            
            if (countCheck > 3)
            {
                withdrawDeduction();
            }
        }
    }

    /**
    * @ToString() method
    */
    @Override
    public String toString()
    {
        return "SavingsAccount: Balance = $" + balance;
    }

    /*
    *@return Compares to method
    */
    public int compareTo(SavingsAccount otherAccount)
    {
        if(balance < otherAccount.balance) return -1;
        if(balance == otherAccount.balance) return 0;
        
        return 1;
    }
}
/*
  ----jGRASP exec: java -ea InheritanceTester
 Insufficient Balance
 SavingsAccount: Balance = $3700.0
 SavingsAccount: Balance = $2690.0
 SavingsAccount: Balance = $1690.0
 
  ----jGRASP: operation complete.
*/

