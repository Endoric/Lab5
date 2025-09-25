public class Savings extends Account{
    private int numberOfDeposits = 0;
    public Savings(double accountBalance){
        super(accountBalance);
    }
    @Override
    public double withdraw(double withdraw){
        super.withdraw(withdraw);
        if (accountBalance < 500){
            System.out.print("Charging an overdraft fee of $10 because you are below $500\n");
            accountBalance -= 10;
        }
        return accountBalance;
    }
    @Override
    public double deposit(double deposit){
        super.deposit(deposit);
        System.out.print("This is deposit " + (++numberOfDeposits) + " to this account");
        if (numberOfDeposits > 5){
            super.withdraw(10);
            System.out.print("\nCharging a fee of $10");
        }
        return accountBalance;
    }
    public double addInterest(){
        double init = accountBalance;
        accountBalance *= 1.015;
        double increase = accountBalance - init;
        System.out.print("\nCustomer has earned $" + increase + " in interest");
        return accountBalance;
    }
    @Override
    public String toString(){
        return "Savings Account #" + (getAccountNumber()) + ", balance $" + accountBalance;
    }
}