
import java.util.Scanner;

public class placasCarros {

    static Scanner sc = new Scanner(System.in);
    static String letras = "abcdefghijklmnopqrstuvwxyz";
    static String numeros = "0123456789";
    static String placaUsr = "";
    static int contadorLetras = 0;
    static int contadorNumeros = 0;
    static boolean letrasValidas = false;
    static boolean numerosValidos = false;

    public static void main(String[] args) {
        System.out.println("Digite la placa con un espacio entre las letras y los números");
        placaUsr = sc.nextLine().toLowerCase();
        if (placaUsr.length() == 6) {
            for (int i = 0; i < 6; i++) {
                if (i <= 2) {
                    for (int j = 0; j < letras.length(); j++) {
                        if (placaUsr.charAt(i) == letras.charAt(j)) {
                            contadorLetras++;
                            letrasValidas = contadorLetras == 3;
                        }
                    }
                } else {
                    for (int k = 0; k < numeros.length(); k++) {
                        if (placaUsr.charAt(i) == numeros.charAt(k)) {
                            contadorNumeros++;
                            numerosValidos = contadorNumeros == 3;
                        }
                    }
                }
            }
        }
        if (letrasValidas && numerosValidos) {
            System.out.println("Es una placa válida");
        } else {
            System.out.println("No es una placa válida");
        }
    }
}
