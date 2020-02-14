package disenio_repeticion;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
    Scanner bang = new Scanner(System.in);
     double horasTrabajadas;
     double valorHora;
     String nombre;
     double sueldo;
     String opcion="";
     String mensaje="";

        System.out.println("Ingrese  valor de las horas");
        valorHora = bang.nextDouble();
        Boolean nuevoEmpleado = true;
    do {
        bang.nextLine();
        System.out.println("Ingrese el nombre:");
        nombre = bang.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        horasTrabajadas = bang.nextInt();
        Empleado empleado = new Empleado(horasTrabajadas, valorHora, nombre);

        mensaje= empleado.presentar();
        System.out.println(mensaje);

        System.out.println("\nDesea calcular el sueldo de otro empleado? si / no:");
        opcion = bang.nextLine();
        if (opcion.equals("no")) {
            nuevoEmpleado = false;
        }else{
            nuevoEmpleado = true;
        }

    }while (nuevoEmpleado == true);


    }
}
