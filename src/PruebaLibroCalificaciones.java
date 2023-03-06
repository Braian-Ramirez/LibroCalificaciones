import java.util.Scanner;
public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
        System.out.printf("El nombre inicial del curso es: %s\n\n", miLibroCalificaciones.obtenerNombreDelCurso());
        System.out.println("Ingrese el nombre del curso:");
        String elNombre = scan.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso( elNombre );
        System.out.println();
        miLibroCalificaciones.mostrarMensaje();
    }
}