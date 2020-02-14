package deber_seleccion;
import java.util.Scanner;
public class EjecutaAlumno {
    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Estudiante:");
        String nombre = bang.nextLine();
        System.out.println("Ingrese Calificacion 1:");
        double calificacion1 = bang.nextDouble();
        System.out.println("Ingrese Calificacion 2:");
        double calificacion2 = bang.nextDouble();
        System.out.println("Ingrese Calificacion 3:");
        double calificacion3 = bang.nextDouble();
        System.out.println("Ingrese Calificacion 4:");
        double calificacion4 = bang.nextDouble();

        Alumno alumno = new Alumno(nombre, calificacion1, calificacion2, calificacion3, calificacion4);
        String presentacion = alumno.validacion();
System.out.println(presentacion);

    }
}
