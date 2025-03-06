

/*
Write a Java program to create an abstract class Animal with an abstract method called sound().
Create subclasses conflicto.Lion and conflicto.Tiger that extend the
Animal class and implement the sound() method to make a specific sound for each animal.
 */
abstract class Animal {
    abstract void sound();

    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger growls");
    }
}


