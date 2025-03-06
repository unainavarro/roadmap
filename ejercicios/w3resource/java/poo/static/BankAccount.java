/*
Write a Java program to create a class called "BankAccount"
with instance variables 'accountNumber' and balance, and static variables 'bankName' and 'interestRate'.
Provide static methods to get and set the static variables.
Create several 'BankAccount' objects and print their details along with the static variables.
*/
public class BankAccount {
    private String accountNumber;
    private double balance;
    private static String bankName = "SuperBank";
    private static double interestRate = 0.10;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "\n" +
                "bankName='" + bankName + "\n" +
                "interestRate='" + interestRate + "\n" +
                "accountNumber='" + accountNumber + "\n" +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(50000, "123456789");
        BankAccount account2 = new BankAccount(3000, "987654321");

        System.out.println(account1.toString());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(account2.toString());

        BankAccount.setBankName("MegaSuperBank");
        BankAccount.setInterestRate(0.5);

        System.out.println("----Cambio----");
        System.out.println(account1.toString());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(account2.toString());
    }
}
