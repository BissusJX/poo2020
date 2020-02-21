package arreglosDeberPoo;

import arreglosPOO.Array;

import java.util.Scanner;

public class EjecutaFicha {
    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);
        String[] datos = new String[4];
        Ficha ficha = new Ficha();
        for (int i =0; i<5; i++){
            for (int j= 0; j<=datos.length;i++) {
                System.out.println("Ingrese nombre del estudiante: ");
                datos[j] = bang.nextLine();
                System.out.println("Ingrese su edad: ");
                datos[j] = bang.nextLine();
                System.out.println("Ingrese las iniciales de la universidad que estudia: ");
                datos[j] = bang.nextLine();
                System.out.println("Ingrese su numero de cedula: ");
                datos[j] = bang.nextLine();
            }
        }
        

    }
}
