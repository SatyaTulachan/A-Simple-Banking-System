import java.util.Scanner;

public class SimpleBankingSystem {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){

        double balance=0;
        Boolean isRunning=true;
        int choice;
        while(isRunning){
            System.out.println("**************");
            System.out.println("Banking System");
            System.out.println("**************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**************");

            System.out.println("Enter the choice(1-4):");

            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance+Deposit();
                case 3 -> balance = balance-WithDraw(balance);
                case 4 -> isRunning=false;
                default -> System.out.println("INVALID CHOICE");
            }


        }
        System.out.println("**********************************");
        System.out.println("Thank you! and Have a nice day!!!");
        System.out.println("**********************************");
        scanner.close();

    }

    static void showBalance(double balance){
        System.out.println("**************");
        System.out.printf("$%.2f\n",balance);

    }
    static double Deposit(){
        double amount;
        System.out.println("Enter the amount you want to deposit:");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount can't be zero");
            return 0;
        }else {
            return amount;
        }
    }
    static double WithDraw(double balance){
        double amount;
        System.out.print("Enter the amount to withdraw:");
        amount = scanner.nextDouble();
        if(amount >balance){
            System.out.println("INSUFFICIENT AMOUNT");
            return 0;
        }else if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }else {
            return amount;
        }
    }

}
