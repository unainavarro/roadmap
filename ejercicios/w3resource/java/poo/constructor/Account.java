/*
Write a Java program to create a class called Account with instance variables accountNumber and balance.
Implement a parameterized constructor that initializes these variables with validation:
accountNumber should be non-null and non-empty. Balance should be non-negative.
Print an error message if the validation fails
 */
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: accountNumber no puede ser nulo ni estar vacío");
            return;
        }

        if (balance < 0) {
            System.out.println("Error: el balance no puede ser negativo");
            return;
        }
        //Sí pasa las validaciones guardar datos
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Uso:
    public static void main(String[] args) {
        Account account = new Account("abc123456789", 50000);

        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
    }
}
