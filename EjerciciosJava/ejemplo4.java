public class ejemplo4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue; // Salta el número 2 y pasa a la siguiente iteración
            }
            if (i == 4) {
                break; // Detiene por completo el bucle al llegar a 4
            }
            System.out.println("Número: " + i);
        }
    }
}