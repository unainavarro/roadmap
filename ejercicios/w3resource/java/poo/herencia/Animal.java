/*
Write a Java program to create a class called Animal with a method called makeSound().
Create a subclass called Cat that overrides the makeSound() method to bark.
 */
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow"); // Nota: Los gatos no ladran ("bark")
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
    }
}

