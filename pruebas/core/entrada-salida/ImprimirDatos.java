package core.io;

import java.util.logging.Logger;

public class ImprimirDatos {
    public static void main(String[] args) {
        /*
        Usando System.out
        Escribe un programa que:
        Imprima tu nombre y tu edad en una sola línea usando System.out.print().
        Imprima tu comida favorita en una nueva línea usando System.out.println().
        Formatee e imprima una frase como: "Mi comida favorita es pizza y tengo 25 años" usando System.out.printf().
         */
        System.out.print("Mi nombre y mi edad \n");
        System.out.println("Mi comida favorita");
        System.out.printf("Mi comida favorita es %s y tengo %d años \n", "pizza", 25);

        System.out.println("----------------------------------------------------");

        /*
        Registro con Logger
        Crea un programa que use un objeto Logger para registrar:
        Un mensaje informativo indicando que el programa ha comenzado.
        Una advertencia simulando un problema menor (por ejemplo: "Advertencia: Tiempo de respuesta alto").
        Un mensaje de error simulando una falla grave ("Error: Conexión al servidor perdida").
         */
        Logger logger = Logger.getLogger("MiLogger");

        logger.info("Inicio del programa");
        logger.warning("Advertencia: Tiempo de respuesta alto");
        logger.severe("Error: Conexión al servidor perdida");

        System.out.println("----------------------------------------------------");

        /*
        System.out, Logger y System.err (CON TRY/CATCH)
        */

        System.out.println("🏃‍♂️Inicio del programa");
        Logger logger2 = Logger.getLogger("NuevoLogger");

        try {
            logger2.info("El programa funciona correctamente");

            System.out.println("Nombre: Juan Pérez");
            System.out.println("Ciudad: Madrid");
            System.out.println("Lenguaje favorito: Java");

        } catch (Exception e) {
            System.err.println("Error: problema de ejecución");
            logger2.severe("Error critico " + e.getMessage());
        }
    }
}

/*
Los logs se unen en un solo flujo se debe a que ambos Logger (MiLogger y NuevoLogger) heredan y utilizan el mismo manejador global por defecto.
Esto significa que, aunque los nombres de los Logger son diferentes, comparten la misma configuración de salida estándar.

Solución para separar los logs
Puedes configurar los Logger para que cada uno use su propio Handler,
evitando que se mezclen sus salidas.
*/