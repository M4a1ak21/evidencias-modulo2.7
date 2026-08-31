import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE EDAD ===");
        System.out.print("¿En qué año naciste? (Ej: 2008) ");
        int anioNacimiento = teclado.nextInt();
        
        // Lógica: Restamos el año actual (2026) menos el año de nacimiento
        int anioActual = 2026;
        int edadCalculada = anioActual - anioNacimiento;
        
        System.out.println("\n-----------------------------------------");
        System.out.println("Según tus datos, este año cumples o tienes: " + edadCalculada + " años.");
        System.out.println("-----------------------------------------");
        
        teclado.close();
    }
}

