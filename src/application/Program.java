package application;

import entities.AccountBank;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountBank accountBank = new AccountBank();
        System.out.print("Enter account number: ");
        int account = sc.nextInt();

        System.out.print("Enter account holder: ");
        String name = sc.next();

        System.out.print("Is there na initial deposit (y/n)? ");
        String depositInitial = sc.next();
        if (depositInitial.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            accountBank.deposit = sc.nextDouble();
        }

        System.out.println("Account data:\n Account " + account + ", Holder: " + name + ", Balance: $ " + accountBank.deposit);

        System.out.print("Enter a deposit value:");
        accountBank.addDeposit(sc.nextDouble());

        System.out.println("Updated account data:\n Account " + account + ", Holder: " + name + ", Balance: $ " + accountBank.deposit);

        System.out.print("Enter a withdraw value:");
        accountBank.removeDeposit(sc.nextDouble());

        System.out.println("Updated account data:\n Account " + account + ", Holder: " + name + ", Balance: $ " + accountBank.deposit);

    }
}
