package taller_repeticion;
//Integrantes: Diana Serrano - Nohelia Ludeña
import java.util.Scanner;

public class EjecutaDivision {
    public static void main(String[] args) {
        String opcion;
        Scanner bang = new Scanner(System.in);
        System.out.println("\tDesea realizar una division a traves de restas repetitivas si/no");
        opcion = bang.nextLine();

        while (opcion.equals("si")) {
            System.out.println("Ingresar dividendo");
            int dividendo = bang.nextInt();
            System.out.println("Ingresar divisor");
            int divisor = bang.nextInt();

            Division division = new Division(dividendo, divisor);
            division.calcular_division();
            System.out.println("El resultado de la division es: " + division.obteber_division());
            bang.nextLine();
            System.out.println("Desea realizar otra division  si/no");
            opcion = bang.nextLine();
        }
    }
}
