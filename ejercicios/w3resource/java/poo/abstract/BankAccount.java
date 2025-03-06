/*
Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective
methods to handle deposits and withdrawals for each account type.
*/
abstract class BankAccount {
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(500);
        BankAccount currentAccount = new CurrentAccount(1000);

        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(700);

        currentAccount.deposit(500);
        currentAccount.withdraw(300);
    }
}

class SavingsAccount extends BankAccount {
    private double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account Deposit: " + amount + ", Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Savings Account: Withdrawal denied. Minimum balance required is 100.");
        } else {
            balance -= amount;
            System.out.println("Savings Account Withdrawal: " + amount + ", Balance: " + balance);
        }
    }
}

class CurrentAccount extends BankAccount {
    private double balance;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account Deposit: " + amount + ", Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Current Account Withdrawal: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Current Account: Insufficient funds.");
        }
    }
}

