/*
Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a car".
*/
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();
    }
}



