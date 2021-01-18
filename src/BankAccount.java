import java.lang.*;

public class BankAccount {
    // Static Member Variable
    static int count = 1;

    // Member Variables
    private final int accountNumber;
    private String name;
    private double initialBalance;

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }



    BankAccount() {
        this.accountNumber = count;
        this.name = "";
        this.initialBalance = 0;
        count++;
    }

    BankAccount(String name, double initialBalance) {
        this.accountNumber = count;
        this.name = name;
        this.initialBalance = initialBalance;
        count++;
    }

    BankAccount(String name) {
        this.accountNumber = count;
        this.name = name;
        this.initialBalance = 0;
        count++;
    }

    public void withDraw(double amount) {
        if (amount <= this.initialBalance) {
            initialBalance -= amount;
            System.out.println("$" + amount + " withdrawn from your account " + accountNumber);
            displayAccountInfo();
        } else {
            System.out.println("Not enough balance in the account to withdraw. Please choose a different amount.");
        }
    }

    public void withDraw(double amount, double fee) {
        if (amount <= this.initialBalance) {
            initialBalance -= amount;
            initialBalance -= fee;
            System.out.println("$" + amount + " withdrawn from your account " + accountNumber + ".");
            System.out.println("$" + fee + " has been charged as service fee.");
            displayAccountInfo();
        } else {
            System.out.println("Not enough balance in the account to withdraw. Please choose a different amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            initialBalance += amount;
            System.out.println("$" + amount + " added to your account " + accountNumber);
            displayAccountInfo();
        } else {
            System.out.println("Invalid amount. Please choose a different amount.");
        }
    }


    public void deposit(double amount, double interestRate) {
        if (amount > 0) {
            initialBalance += amount;
            double interest = (interestRate / 100) * initialBalance;
            initialBalance += interest;
            System.out.println("$" + amount + " added to your account " + accountNumber + ".");
            System.out.println("$" + interest + " has been added to your account as interest.");
            displayAccountInfo();
        } else {
            System.out.println("Invalid amount. Please choose a different amount.");
        }
    }


    public void displayAccountInfo()
    {
        System.out.println("============== Account Information =====================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + initialBalance);
        System.out.println("========================================================");
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Ram", 5000);
        b1.displayAccountInfo();

        BankAccount b2 = new BankAccount();
        b2.setName("Sam");
        b2.setInitialBalance(10000);
        b2.displayAccountInfo();


        BankAccount b3 = new BankAccount("Raj");
        b3.setInitialBalance(20000);
        b3.displayAccountInfo();


        System.out.println();

        System.out.println("==== Transactions ====");
        b1.deposit(2000);
        b2.deposit(5000,10);
        b3.withDraw(8000);
        b2.withDraw(1000,5);



    }
}