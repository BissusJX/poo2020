package arreglosDeberPoo;

import java.util.Scanner;

public class EjecutaConvertidor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero binario");
        String num = scan.nextLine();
        Convertidor binario = new Convertidor(num);
        binario.obtenerArray();
        binario.obtenerDecimal();

    }
}
