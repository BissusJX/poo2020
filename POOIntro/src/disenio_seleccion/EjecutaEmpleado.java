package disenio_seleccion;

import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Empleado");
        String nombre = bang.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        int horas = bang.nextInt();
        System.out.println("Ingrese el valor por cada hora trabajada");
        double cuota = bang.nextDouble();

        Empleado empleado = new Empleado(nombre, horas, cuota);

        String prs = empleado.presentar();
        System.out.println(prs);

    }
}
