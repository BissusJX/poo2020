package deber_seleccion;

import java.util.Scanner;
public class EjecutaSueldo {
    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Empleado");
        String nombre = bang.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        int horas = bang.nextInt();
        System.out.println("Ingrese el valor por cada hora trabajada");
        double valor = bang.nextDouble();

        SueldoTriple sueldoTriple = new SueldoTriple(nombre, horas, valor);
        String imprimir = sueldoTriple.presentar();
        System.out.println(imprimir);
    }
}