package Application;
import Entities.Account;

import java.util.Objects;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine(); // para consumir a quebra de linha pendente.
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String choice = sc.next();
        double value;
        Account account = new Account(name, number);
        if (Objects.equals(choice, "y")){
            System.out.print("Enter the initial deposit value: ");
            value = sc.nextDouble();
            account = new Account(number, name, value);
            System.out.print("Account data:\n");
            System.out.print(account);
        }
        else{
            System.out.print("Account data:\n");
            System.out.print(account);
        }

        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.print("Updated account data:\n");
        System.out.print(account);

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.print("Updated account data:\n");
        System.out.print(account);

        sc.close();
    }
}
