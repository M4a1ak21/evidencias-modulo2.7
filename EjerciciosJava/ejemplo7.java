public class ejemplo7 {
    String nombre;
    int edad;

    public static void main(String[] args) {

        // Crear un objeto de la clase Persona
        ejemplo7 persona1 = new ejemplo7();

        // Dar valores a los atributos
        persona1.nombre = "Carlos";
        persona1.edad = 17;

        // Mostrar la información
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
    }
}