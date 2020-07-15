package application;
import entities.Account;
import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is the an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);
        if (answer == 'y'){
            System.out.println("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(holder, number, initialDeposit);
            }
        else{
            account = new Account(holder, number);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        double balance = sc.nextDouble();
        account.depositValue(balance);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        balance = sc.nextDouble();
        account.withdrawValue(balance);
        System.out.println("Updated account data: ");
        System.out.println(account);
        sc.close();
    }
}