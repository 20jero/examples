
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class videogameTournament {

    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    static int opcion;
    static int ganador;
    static boolean run = true;
    static boolean encontrado = false;
    static String funcNombre = "";
    static ArrayList<String> nombres = new ArrayList<>();
    static ArrayList<Integer> edad = new ArrayList<>();
    static ArrayList<String> juegoFav = new ArrayList<>();
    static ArrayList<Integer> puntos = new ArrayList<>();

    static void menu() {
        System.out.println("-----Menú Principal-----\n1. Registrar jugador\n2. Ver jugadores\n3. Buscar jugador\n4. Eliminar jugador\n5. Iniciar torneo\n0. Salir");
    }

    static void opcionInvalida() {
        System.out.println("-----Opción seleccionada no válida-----");
    }

    static void registrarJugador() {
        System.out.println("Ingresa tu nombre: ");
        nombres.add(sc.nextLine().trim());
        while (true) {
            if (nombres.get(nombres.size() - 1).equals("")) {
                nombres.remove(nombres.size() - 1);
                System.out.println("Debes escribir un nombre: ");
                nombres.add(sc.nextLine().trim());
            } else {
                break;
            }
        }
        System.out.println("Ingresa tu edad: ");
        edad.add(sc.nextInt());
        sc.nextLine();
        while (true) {
            if (edad.get(edad.size() - 1) < 0) {
                edad.remove(edad.size() - 1);
                System.out.println("Edad inválida, por favor ingrésala de nuevo:");
                edad.add(sc.nextInt());
                sc.nextLine();
            } else {
                break;
            }
        }
        System.out.println("¿Cuál es tu videojuego favorito?");
        juegoFav.add(sc.nextLine().trim());
        puntos.add(0);
    }

    static void verJugadores() {
        System.out.println("---------Jugadores Registrados---------");
        System.out.println("Nombre | Edad | Juego Favorito | Puntos");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i) + " | " + edad.get(i) + " | " + juegoFav.get(i) + " | " + puntos.get(i));
        }
    }

    static void buscarJugador() {
        System.out.println("Escriba el nombre del jugador al que quiere buscar: ");
        funcNombre = sc.nextLine();
        System.out.println("Nombre | Edad | Juego Favorito | Puntos");
        for (int i = 0; i < nombres.size(); i++) {
            if (funcNombre.equalsIgnoreCase(nombres.get(i).toLowerCase())) {
                System.out.println(nombres.get(i) + " | " + edad.get(i) + " | " + juegoFav.get(i) + " | " + puntos.get(i));
            }
        }
        System.out.println("------Fin de los resultados------");
    }

    static void eliminarJugador() {
        System.out.println("Escriba el nombre del jugador que quiere remover del torneo: ");
        funcNombre = sc.nextLine();
        for (int i = 0; i < nombres.size(); i++) {
            if (funcNombre.equalsIgnoreCase(nombres.get(i).toLowerCase())) {
                encontrado = true;
                nombres.remove(i);
                edad.remove(i);
                juegoFav.remove(i);
                puntos.remove(i);
            } else {
                encontrado = false;
            }
        }
        if (encontrado) {
            System.out.println("-----Jugador removido con exito-----");
        } else {
            System.out.println("-----Jugador Inexistente-----");
        }
    }

    static void torneo() {
        if (!nombres.isEmpty()) {
            System.out.println("-----Empezando torneo-----");
            ganador = rand.nextInt(nombres.size());
            puntos.set(ganador, puntos.get(ganador) + 1);
            System.out.println("Ganador del Torneo: " + nombres.get(ganador) + "\n--------------------- \n Nombre | Edad | Juego Favorito | Puntos\n" + nombres.get(ganador) + " | " + edad.get(ganador) + " | " + juegoFav.get(ganador) + " | " + puntos.get(ganador));
        } else {
            System.out.println("-----No hay jugadores-----");
        }
    }

    public static void main(String[] args) {
        System.out.println("----Bienvenido al Torneo----");
        while (run) {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------");
            if (opcion >= 0 && opcion < 6) {
                switch (opcion) {
                    case 1 ->
                        registrarJugador();
                    case 2 ->
                        verJugadores();
                    case 3 ->
                        buscarJugador();
                    case 4 ->
                        eliminarJugador();
                    case 5 ->
                        torneo();
                    case 0 -> {
                        System.out.println("-----Fin del Torneo-----");
                        run = false;
                    }
                    default ->
                        opcionInvalida();
                }
            }
        }
    }
}
