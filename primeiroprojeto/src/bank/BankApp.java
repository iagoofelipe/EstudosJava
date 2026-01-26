package bank;

import java.util.Scanner;

public class BankApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = bank.getClient();

        System.out.printf("""
        
        **************************************
        
        Client: %s
        Type Account: %s
        Current Balance: %.2f
        
        **************************************
        """, client.getName(), client.getTypeAccount().name(), client.getBalance());

        OUTER:
        for (;;) {
            int option = menu();

            switch (option) {
                case 1:
                    bank.showCurrentBalance();
                    break;
                case 2:
                    System.out.print("Type the value: ");
                    bank.newDeposit(scanner.nextFloat());
                    bank.showCurrentBalance();
                    break;
                case 3:
                    System.out.print("Type the value: ");
                    if (bank.newWithdrawal(scanner.nextFloat())) {
                        bank.showCurrentBalance();
                    } else {
                        System.out.println("You have not enough balance to conclude this action");
                    }   break;
                case 4:
                    break OUTER;
            }
        }
    }

    static int menu() {
        System.out.println("""
        
        Welcome to Your Bank Account
        
        1. Current balance
        2. New deposit
        3. New withdrawal
        4. Quit
        
        """);

        int option;
        do {
            System.out.print("Option: ");
            option = scanner.nextInt();
        } while(option < 1 || option > 4);

        return option;
    }
}
