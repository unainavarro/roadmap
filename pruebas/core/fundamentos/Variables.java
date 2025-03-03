package core.fundamentos;

public class Variables {
    //Variable de instancia, no es accesible desde un contesto estático.
    int numeroLocal = 10;
    static int numeroLocal2 = 10;

    public static void main(String[] args) {
        //Variables simples de tipo primitivo
        int edad = 90;
        double altura = 1.70;
        char inicial = 'x';
        boolean esEstudiante = true;

        System.out.println("#### Variables Simples ####");
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + esEstudiante);

        System.out.println("#### Variables Locales ####");
        // System.out.println("numeroLocal = " + numeroLocal);  Error cannot be referenced from a static context
        System.out.println("numeroLocal2 = " + numeroLocal2);
    }
}
