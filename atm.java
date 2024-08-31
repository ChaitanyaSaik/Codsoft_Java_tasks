import java.util.Scanner;

class bank {
    double bankbalance;
    double withdrawal;
    double desposit;

    void cash_desposit(double desposit) {
        if (bankbalance == 0) {
            bankbalance += desposit;
            System.out.println("your transaction is successfull");
        } else if (bankbalance >= 100000) {
            System.out.println("You are exceeding the limit");
        }
    }

    void bankbalance() {
        System.out.println("the current balance of your account:" + bankbalance);
    }

    void withdrawal(double withdrawal) {
        if (bankbalance <= 0) {
            System.out.println("Sorry your current balance is zero");
        } else if (withdrawal < bankbalance && bankbalance > 0) {
            bankbalance -= withdrawal;
            System.out.println("your transaction was successfull");
        } else if (withdrawal > bankbalance) {
            System.out.println("you have croosed the limit");
        } else {
            System.out.println("service error");
        }
    }
}

public class atm {
    public static void main(String[] args) {
        System.out.println("Welcome bank of maharasthra");
        Scanner myscan = new Scanner(System.in);
        bank obj = new bank();
        while (true) {
            System.out.println("Select your options");
            System.out.println("1. Desposit");
            System.out.println("2. withdrawal");
            System.out.println("3. Bank Balance");
            System.out.println("4. Exiting");
            int option = myscan.nextInt();
            if (option == 1) {
                System.out.println("Enter the amount to be desposit");
                double amount = myscan.nextDouble();
                obj.cash_desposit(amount);
            } else if (option == 2) {
                System.out.println("enter the amount to be withdrawal");
                double withdrawal_amount = myscan.nextDouble();
                obj.withdrawal(withdrawal_amount);
            } else if (option == 3) {
                obj.bankbalance();
            } else if (option == 4) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("invalid");
            }

        }

    }
}
