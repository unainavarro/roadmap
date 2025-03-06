/*
Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
Create subclasses Manager and Programmer that extend the Employee class and implement
the respective methods to calculate salary and display information for each role.
*/
abstract class Employee {
    abstract double calculateSalary();
    abstract void displayInfo();

    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 5000);
        Employee programmer = new Programmer("Bob", 4000, 200);

        manager.displayInfo();
        System.out.println("Salary: " + manager.calculateSalary());

        programmer.displayInfo();
        System.out.println("Salary: " + programmer.calculateSalary());
    }
}

class Manager extends Employee {
    private String name;
    private double baseSalary;

    Manager(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    double calculateSalary() {
        return baseSalary;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Name: " + name);
    }
}

class Programmer extends Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    Programmer(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer Name: " + name);
    }
}

