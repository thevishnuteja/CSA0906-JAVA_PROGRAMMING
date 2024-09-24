import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountHolderName;
    protected double balance;

    public Account(int accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolderName, double initialDeposit, double interestRate) {
        super(accountNumber, accountHolderName, initialDeposit);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * (interestRate / 100);
        System.out.println("Interest applied.");
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolderName, double initialDeposit, double overdraftLimit) {
        super(accountNumber, accountHolderName, initialDeposit);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit reached. Transaction failed.");
        }
    }
}

public class OopsBanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create accounts
        SavingsAccount savingsAccount = new SavingsAccount(123456789, "Jane Doe", 5000, 1.5);
        CheckingAccount checkingAccount = new CheckingAccount(987654321, "John Smith", 1000, 1000);

        // Display accounts
        System.out.println("The accounts in the system are:");
        System.out.println("1. Savings Account");
        savingsAccount.displayInfo();
        System.out.println("2. Checking Account");
        checkingAccount.displayInfo();

        // Perform transactions
        System.out.print("Please enter the number of the account you wish to perform a transaction on (1 for Savings, 2 for Checking): ");
        int accountChoice = scanner.nextInt();

        System.out.print("Please enter the transaction type (deposit/withdraw): ");
        String transactionType = scanner.next();

        System.out.print("Please enter the amount: ");
        double amount = scanner.nextDouble();

        // Handle transactions
        if (accountChoice == 1) {
            if (transactionType.equalsIgnoreCase("deposit")) {
                savingsAccount.deposit(amount);
            } else if (transactionType.equalsIgnoreCase("withdraw")) {
                savingsAccount.withdraw(amount);
            } else {
                System.out.println("Invalid transaction type.");
            }
        } else if (accountChoice == 2) {
            if (transactionType.equalsIgnoreCase("deposit")) {
                checkingAccount.deposit(amount);
            } else if (transactionType.equalsIgnoreCase("withdraw")) {
                checkingAccount.withdraw(amount);
            } else {
                System.out.println("Invalid transaction type.");
            }
        } else {
            System.out.println("Invalid account choice.");
        }

        // Display updated account information
        System.out.println("\nUpdated Account Information:");
        if (accountChoice == 1) {
            savingsAccount.displayInfo();
        } else if (accountChoice == 2) {
            checkingAccount.displayInfo();
        }

        scanner.close();
    }
}
