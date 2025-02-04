package Java.IDE.ATM;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        OperationInterface operation = new OperationImplementation();
        
        int atmNum = 123456;
        int atmPin = 7890;
        Scanner input = new Scanner(System.in);
        System.out.println("!!! === Welcome to ATM === !!! ");
        System.out.print("Enter ATM Number : ");
        int atmInNum = input.nextInt();
        System.out.print("Enter PIN Number : ");
        int atmInPin = input.nextInt();
        if ((atmInNum == atmNum) && (atmInPin == atmPin)) {
            while (true) {
                System.out.println("Select your choice --> ");
                System.out.println("\n 1. Check your Balance \n 2. Withdraw Cash \n 3. Deposit Cash \n 4. Transaction History \n 5. Exit ATM");
                System.out.println();
                System.out.print("Enter Choice : ");

                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("Your Bank Balance is generated ...");
                    operation.checkBalance();
                } else if (choice == 2) {
                    System.out.print("Enter the Cash to Withdraw : ");
                    double withdrawCash = input.nextDouble();
                    operation.withdrawCash(withdrawCash);
                } else if (choice == 3) {
                    System.out.print("Enter the Cash to Deposit : ");
                    double depositCash = input.nextDouble();
                    operation.depositCash(depositCash);
                } else if (choice == 4) {
                    System.out.println("Your Minimal Statement is generated ...");
                    operation.viewTransactions();
                } else if (choice == 5) {
                    System.out.println("Thankyou for visiting the ATM, \n Come Again ...");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Choice");
                }
            }
        } else {
            System.out.println("Incorrect in Number or Pin");
            System.exit(0);
        }
        input.close();
    }
}
