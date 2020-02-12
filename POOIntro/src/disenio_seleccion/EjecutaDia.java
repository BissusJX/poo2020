package disenio_seleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int num = bang.nextInt();
        Dia dia = new Dia(num);
        dia.CalcularNombre();
        dia.obtenerNombre();
    }
}