package arreglosDeberPoo;

import arreglosPOO.Array;

import java.util.Scanner;

public class EjecutaFicha {
    public static void main(String[] args) {
        Scanner bang = new Scanner(System.in);
        String[] nombre = new String[5];
        int[] edad = new int[5];
        String[] universidad = new String[5];
        String[] celular = new String[5];
        String presentar = "";

        for (int i=0; i < nombre.length; i ++){
            System.out.printf("Ingrese el nombre de la persona %d: ", i);
            nombre[i] = bang.nextLine();
            System.out.printf("Ingrese la edad de la persona %d: ", i);
            edad[i] = bang.nextInt();
            bang.nextLine();
            System.out.printf("Ingrese las iniciales de la Univerdad de la persona %d: ", i);
            universidad[i] = bang.nextLine();
            System.out.printf("Ingrese el numero de celular de la persona %d: ", i);
            celular[i] = bang.nextLine();
        }
        bang.nextLine();

        Ficha estudiante = new Ficha(nombre, edad, universidad, celular);

        for (int i=0; i < nombre.length; i ++){
            presentar = String.format("\n%s\nNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: %s\n", presentar, nombre[i], edad[i], universidad[i], celular[i]);
        }
        System.out.println(presentar);

    }
}
