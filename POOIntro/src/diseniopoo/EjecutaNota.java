package diseniopoo;

import java.util.Scanner;

public class EjecutaNota {

    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);
        System.out.println("Ingrese el nombre de Estudiante");
        String nombre = bang.nextLine();
        System.out.println("Ingrese el nombre de la Materia");
        String materia = bang.nextLine();
        System.out.println("Ingrese su nota del 1er Bimestre");
        Double bim1 = bang.nextDouble();
        System.out.println("Ingrese su nota del 2do Bimestre ");
        Double bim2 = bang.nextDouble();
        Nota nota = new Nota(nombre,materia,bim1,bim2);
        Double f = nota.nota_final();
        String mensaje = nota.mensaje_final();
        String mensaje2 = nota.obtener_mensaje();
        System.out.println(mensaje);
    }
}
