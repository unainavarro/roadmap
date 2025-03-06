/*
Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 */
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        account.withdraw(450); // Intento de retirar
        account.deposit(200);  // Depósito
        account.withdraw(50);  // Retiro exitoso
    }
}


