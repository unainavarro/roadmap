/*
Write a Java program to create a class called Employee with methods called work() and getSalary().
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/
class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 2000.0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("Adding a new employee to the company");
    }

    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
        System.out.println("Salary: " + hrManager.getSalary());
    }
}




