package arreglosDeberPoo;

import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);
        System.out.println("Ingrese su numero de cedula: ");
        int cedula = bang.nextInt();
        Cedula cedula1 = new Cedula(cedula);
        cedula1.validacion();
        System.out.println(cedula1.obtenerCedula());
        System.out.println(cedula1.obtenerValidador());
        System.out.println(cedula1.obtenerEstado());
    }
}
