
import java.util.Scanner;

public class palindromo {

    static Scanner sc = new Scanner(System.in);
    static String entrada = "";
    static String salida = "";
    static String salidaAux = "";
    static String entradaAux = "";

    public static void main(String[] args) {
        System.out.println("Ingrese una frase o palabra");
        entrada = sc.nextLine();
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) != ' ') {
                entradaAux += entrada.charAt(i);
            }
        }
        for (int i = entrada.length() - 1; i >= 0; i--) {
            salida += entrada.charAt(i);
            if (entrada.charAt(i) != ' ') {
                salidaAux += entrada.charAt(i);
            }
        }
        System.out.println(salida);
        if (salidaAux.equalsIgnoreCase(entradaAux)) {
            System.out.println("Son palíndromos");
        } else {
            System.out.println("No son palíndromos");
        }
    }
}
