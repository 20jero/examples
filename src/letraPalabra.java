
import java.util.Scanner;

public class letraPalabra {

    static Scanner sc = new Scanner(System.in);
    static String palabra = "";
    static String aux = "";
    static char letraABuscar;
    static char letraACambiar;
    static boolean encontrado = false;
    static int contador = 0;
    static String salidaPalabra = "";

    public static void main(String[] args) {
        System.out.println("Ingrese la palabra");
        palabra = sc.nextLine();
        System.out.println("Ingrese la letra para buscar");
        aux = sc.nextLine();
        letraABuscar = aux.charAt(0);
        System.out.println("Ingrese la nueva letra");
        aux = sc.nextLine();
        letraACambiar = aux.charAt(0);

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letraABuscar) {
                salidaPalabra += letraACambiar;
                contador += 1;
                encontrado = true;
            } else {
                salidaPalabra += palabra.charAt(i);
            }
        }
        if (encontrado) {
            System.out.println("La palabra contiene la letra '" + letraABuscar + "' " + contador + " veces");
            System.out.println("La palabra con las letras intercambiadas es: " + salidaPalabra);
        } else {
            System.out.println("La palabra no contiene la letra '" + letraABuscar + "'");
        }
    }
}
