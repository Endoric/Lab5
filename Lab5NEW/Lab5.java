import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checking ch = new Checking(0);
        Savings sv = new Savings(0);
        boolean running = true;
        System.out.println("[Banking System]");
        while(true){
            System.out.print("\n1. Withdraw from Checking\n2. Withdraw from Savings\n3. Deposit to Checking\n4. Deposit to Savings\n5. Balance of Checking\n6. Balance of Savings\n7. Award Interest to Savings\n8. Quit\nSelect option: ");
            int option = sc.nextInt();
            switch(option){ 
                case 1:
                    System.out.print("\nHow much would you like to withdraw from Checking? $");
                    ch.withdraw(sc.nextDouble());
                    System.out.println("Current balance of Checking is $" + (ch.getAccountBalance()));
                    break;
                case 2:
                    System.out.print("\nHow much would you like to withdraw from Savings? $");
                    sv.withdraw(sc.nextDouble());
                    System.out.println("Current balance of Savings is $" + (sv.getAccountBalance()));
                    break;
                case 3:
                    System.out.print("\nHow much would you like to deposit to Checking? $");
                    ch.deposit(sc.nextDouble());
                    System.out.println("\nCurrent balance of Checking is $" + (ch.getAccountBalance())); 
                    break;
                case 4:
                    System.out.print("\nHow much would you like to deposit to Savings? $");
                    sv.deposit(sc.nextDouble());
                    System.out.println("\nCurrent balance of Savings is $" + (sv.getAccountBalance())); 
                    break;
                case 5:
                    System.out.println("\n"+ch.toString());
                    break;
                case 6:
                    System.out.println("\n"+sv.toString());
                    break;
                case 7:
                    sv.addInterest();
                    System.out.println("Current balance of Savings is $" + (sv.getAccountBalance()));
                    break;
                case 8:
                    System.out.print("Shutting off...");
                    sc.close();
                    running = false;
                default:
                    System.out.println("\nInvalid option");
            }
        }
    }
}
