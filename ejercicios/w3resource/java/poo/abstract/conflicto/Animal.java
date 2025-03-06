package conflicto;

/*
Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses conflicto.Lion, conflicto.Tiger, and conflicto.Deer that extend the Animal class and implement
the eat() and sleep() methods differently based on their specific behavior.
 */
abstract class Animal {
    abstract void eat();
    abstract void sleep();

    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

        lion.eat();
        lion.sleep();

        tiger.eat();
        tiger.sleep();

        deer.eat();
        deer.sleep();
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps in the den");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats deer");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps in the jungle");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleeps in the meadow");
    }
}


