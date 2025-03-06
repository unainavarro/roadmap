public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Ambas referencias apuntan a la misma instancia de Singleton. -> " + singleton1 + " " + singleton2);
        } else {
            System.out.println("Las referencias apuntan a instancias diferentes de Singleton. -> " + singleton1 + " " + singleton2);
        }
    }
}

