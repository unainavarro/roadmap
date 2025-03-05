import java.text.DecimalFormat;

public class Ejer_08 {
    /*
        Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
        Sample data (Monthly compounded) and Output:
        Input the investment amount: 1000
        Input the rate of interest: 10
        Input number of years: 5
        Expected Output:
        Years    FutureValue
        1            1104.71
        2            1220.39
        3            1348.18
        4            1489.35
        5            1645.31
         */

    public static void main(String[] args) {
        // Cantidad inicial de inversión
        double investmentAmount = 1000;
        // Tasa de interés anual en porcentaje
        double annualInterestRate = 10;
        // Número de años de la inversión
        int years = 5;

        // Encabezado de la tabla
        System.out.println("Años\tValor Futuro");

        // Bucle para calcular y mostrar el valor futuro para cada año
        for (int i = 1; i <= years; i++) {
            // Llamada al método para calcular el valor futuro
            double futureValue = calculateFutureInvestmentValue(investmentAmount, annualInterestRate, i);
            // Formatear el resultado con dos decimales
            System.out.println(i + "\t" + new DecimalFormat("0.00").format(futureValue));
        }
    }

    /**
     * Método para calcular el valor futuro de la inversión
     *
     * @param principal  Cantidad inicial invertida
     * @param annualRate Tasa de interés anual en porcentaje
     * @param years      Número de años
     * @return Valor futuro de la inversión
     */
    public static double calculateFutureInvestmentValue(double principal, double annualRate, int years) {
        // Convertir la tasa de interés anual a mensual
        double monthlyRate = annualRate / 100 / 12;
        // Calcular el número total de meses
        int months = years * 12;
        // Fórmula para calcular el valor futuro
        return principal * Math.pow(1 + monthlyRate, months);
    }
}
