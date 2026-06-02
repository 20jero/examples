
import java.util.Scanner;

public class monitoreoPresion {

    static Scanner sc = new Scanner(System.in);
    static double presion, promPresion;
    static double presionMax = -999;
    static double presionMin = 999;
    static double sumaPresiones = 0;
    static int riesgoDescompresion = 0;

    public static void main(String[] args) {
        for (int vuelta = 1; vuelta <= 10; vuelta++) {
            System.out.println("Ingrese la presión de la rueda en la vuelta #" + vuelta);
            presion = sc.nextDouble();
            if (presion <= 34 && presion >= 18) {
                sumaPresiones += presion;
                if (presion > presionMax) {
                    presionMax = presion;
                }
                if (presion < presionMin) {
                    presionMin = presion;
                }
                if (presion <= 20.5) {
                    riesgoDescompresion++;
                }
            } else {
                System.out.println("¡Alerta de Telemetría! Presión fuera de rango");
                vuelta--;
            }
        }
        promPresion=sumaPresiones/10;
        System.out.println("La presión promedio fue: "+promPresion+"\nLa presión máxima fue: "+presionMax+"\nLa presión mínima fue: "+presionMin+"\nHubo riesgo de Descompresión "+riesgoDescompresion+" veces");
    }
}
