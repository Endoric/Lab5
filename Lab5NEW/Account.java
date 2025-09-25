public class Account{
    private int accountNumber;
    private static int nextNumber = 10001;
    public double accountBalance;
    public Account(){
        accountNumber = nextNumber++;
    }
    public Account(double accountBalance){
        accountNumber = nextNumber++;
        this.accountBalance = accountBalance;
    }
    public double withdraw(double withdraw){
        return accountBalance -= withdraw;
    }
    public double deposit(double deposit){
        return accountBalance += deposit;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String toString(){
        return "Account #" + accountNumber + ", balance $" + accountBalance;
    }
}