public class ejemplo6 {
    public static void main(String[] args) {
        double[][] calificaciones = {
            {8.5, 9.0, 7.5},
            {6.0, 7.0, 8.0},
            {9.5, 8.5, 9.0}
        };
        int numEstudiantes = 1;

        for (double[] estudiante : calificaciones) {
            double suma = 0;
            for (double calificacion : estudiante) {
                suma += calificacion;
            }
            double promedio = suma / estudiante.length;
            System.out.println("Promedio del estudiante " + numEstudiantes + ": " + promedio);
            numEstudiantes++;
        }
    } // Cierre del método main
} // Cierre de la clase ejemplo6