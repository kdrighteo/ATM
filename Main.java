import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int balance = 1000000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("AUTOMATED TELLER MACHINE");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for deposit");
            System.out.println("choose 3 for checking balance");
            System.out.println("choose 4 for Exit");
            System.out.println("choose the operation you want");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter amount you want to withdraw");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println(" !!!!! please collect your money !!!!");
                        System.out.println("");
                    } else {
                        System.out.println("Insufficient Fund");
                    }
                }
                case 2 -> {
                    System.out.println("Enter amount to be deposited");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been deposited successfully");
                }
                case 3 -> System.out.println("balance: " + balance);
                case 4 -> System.exit(0);
            }
        }
    }
}