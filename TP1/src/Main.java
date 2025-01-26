
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create an account
        System.out.println("Hello and welcome in your bank!");
        System.out.println("please enter your name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("enter your sold please");
        double sold = scanner.nextDouble();
        System.out.printf("Welcome %s! Your account has been created with an initial balance of %.2f.\n", name, sold);
        int option ;
        do {
        // Principal Menu
        System.out.println(" MENU ");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check balance");
        System.out.println("4. Quit");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();
            // customer operations code
            switch (option) {

                // deposit operation
                case 1:
                    double amount;
                    do {
                        System.out.println("what amount of  money you want to deposit");
                        amount = scanner.nextDouble();
                    } while (amount < 0);
                    sold = sold + amount;
                    System.out.printf("You have deposited %.2f, and your new sold is %.2f \n", amount, sold);
                    break;

                // withdraw operation
                case 2:
                    System.out.println("what amount of money you're willing to Withdraw");
                    amount = scanner.nextDouble();
                    if (amount < sold && amount > 0) {
                        sold = sold - amount;
                        System.out.printf("You have withdrawn %.2f, and your new sold is %.2f \n", amount, sold);

                    } else {
                        System.out.println(" you don't have enough money");
                    }
                    break;
                // checking operation
                case 3:
                    System.out.printf(" your sold is %.2f", sold);
                    break;
            }
        }while (option != 4);

        System.out.println("thanks for using our bank");
    }
}