package core.fundamentos;

public class EntradaPrincipal {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumento recibido: " + args[0]);
        } else {
            System.out.println("No se han recibido argumentos");
        }
    }
}
