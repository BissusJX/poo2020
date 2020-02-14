package taller_repeticion;
//Integrantes: Diana Serrano - Nohelia Ludeña
import java.util.Scanner;
public class EjecutaMultplicacion {
    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);
        String opcion;
        System.out.println("\tDesea realizar una division a traves de restas repetitivas si/no");

        do{
            System.out.println("Ingrese el valor del numero 1: ");
            int num1 = bang.nextInt();

            System.out.println("Ingrese el  valor del numero 2:");
            int num2 = bang.nextInt();
            Multiplicacion mult = new Multiplicacion(num1, num2);
            mult.calcularMultiplicacion();
            System.out.println("El resultado de la multiplicacion " + num1 + "*" +num2 + " = " + mult.getResultado());

            bang.nextLine();
            System.out.println("Desea realizar otra multiplicacion? si/no: ");
            opcion = bang.nextLine();

        }
        while( opcion.equals("si") );

    }
}
