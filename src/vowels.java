
import java.util.Scanner;

public class vowels {

    static Scanner sc = new Scanner(System.in);
    static String frase, entrada;
    static String salida = "";
    static char vocal;

    public static void main(String[] args) {
        System.out.println("Escriba una frase: ");
        frase = sc.nextLine();
        while (true) {
            System.out.println("Escriba una vocal: ");
            entrada = sc.nextLine();
            if (!entrada.equals("") && (entrada.equals("a") || entrada.equals("e") || entrada.equals("i") || entrada.equals("o") || entrada.equals("u"))) {
                vocal = entrada.charAt(0);
                break;
            } else {
                System.out.println("Vocal inválida, intentelo de nuevo.");
            }
        }
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                salida += vocal;
            } else {
                salida += frase.charAt(i);
            }
        }
        System.out.println(salida);
    }
}
