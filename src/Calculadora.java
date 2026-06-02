
import java.util.Scanner;

public class Calculadora {

    static Scanner sc = new Scanner(System.in);
    static String menu = "1. Suma \n2. Resta \n3. División \n4. Multiplicación \n0.Salir";
    static int opcion;
    static boolean divValida;
    static boolean run = true;

    public static void main(String[] args) {
        while (run) {
            System.out.println(menu);
            opcion = sc.nextInt();
            System.out.println("-------------------------\n Digite el primer valor: ");
            double num1 = sc.nextDouble();
            System.out.println("Digite el segundo valor: ");
            double num2 = sc.nextDouble();
            switch (opcion) {
                case 1 ->
                    System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
                case 2 ->
                    System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
                case 3 -> {
                    if (divValida) {
                        System.out.println(num1 + " / " + num2 + " = " + div(num1, num2));
                    } else {
                        System.out.println("Error Matemático, no se puede dividor por 0");
                    }
                }
                case 4 ->
                    System.out.println(num1 + " * " + num2 + " = " + multi(num1, num2));
                case 0 ->
                    run = false;
                default ->
                    System.out.println("Opción no válida");
            }
        }
    }

    public static double suma(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double resta(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double div(double num1, double num2) {
        if (num2 != 0) {
            divValida = true;
            double result = num1 / num2;
            return result;
        } else {
            divValida = false;
            return 0;
        }
    }

    public static double multi(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
}
