/*
Write a Java program to create an outer class called Computer with an inner class Processor.
The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed).
Create an instance of Processor from the Computer class and call the "displayDetails()" method.
*/
class Computer {
    private String processorBrand = "Intel";
    private double processorSpeed = 3.5;

    class Processor {
        void displayDetails() {
            System.out.println("Processor Brand: " + processorBrand);
            System.out.println("Processor Speed: " + processorSpeed + " GHz");
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor();
        processor.displayDetails();
    }


}

