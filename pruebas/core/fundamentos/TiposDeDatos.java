package core.fundamentos;

public class TiposDeDatos {
    public enum EstadoPedido {
        NUEVO("Pedido recién creado"),
        ENVIADO("Pedido enviado al cliente"),
        COMPLETADO("Pedido entregado");

        private final String descripcion;

        EstadoPedido(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }


    public static void main(String[] args) {
        // Tipos de datos PRIMITIVOS
        byte enteroPequeño = 127;
        short enteroUnPocoMasGrande = 129;
        int entero = 10;
        long enteroGrande = 1289372309;
        double decimal1 = 308.9;
        float decimal2 = 24.4F;
        char character = 'a';
        boolean booleano = true;

        // Tipos de dato de REFERENCIA
        String saludo = "Hola, bienvenido.";
        int[] arrayNum = {1, 2, 3, 4};
        System.out.println(arrayNum[0]); // Primero
        System.out.println(arrayNum[arrayNum.length - 1]); // Último

        // Enum
        enum Color {
            ROJO,
            VERDE(),
            PURPURA,
            GRIS
        }
        System.out.println("Color.ROJO = " + Color.ROJO);
        System.out.println("Color.PURPURA = " + Color.PURPURA);

        System.out.println(EstadoPedido.COMPLETADO.getDescripcion());
    }
}
