import java.util.Scanner;

public class Bienvenida {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("=== SISTEMA DE BIENVENIDA ===");
        System.out.print("Por favor, ingresa tu nombre completo: ");

        String nombre = lector.nextLine();

        System.out.println("\n-------------------------");
        System.out.println("¡Hola, " + nombre + "! el internet esta lento!!!!!!");
        System.out.println("------------------------------------");

        lector.close();
    }
}