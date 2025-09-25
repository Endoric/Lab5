public class Checking extends Account{
    public Checking(double accountBalance){
        super(accountBalance);
    }
    @Override
    public double withdraw(double withdraw){
        if (accountBalance < withdraw){
            System.out.print("Charging an overdraft fee of $20 because the account is below $0\n");
            accountBalance -= 20;
        }
        super.withdraw(withdraw);
        return accountBalance;
    }
    @Override
    public String toString(){
        return "Checking Account #" + (getAccountNumber()) + ", balance $" + accountBalance;
    }
}