package diseniopoo;
import java.util.Scanner;
public class EjecutaCerveza {

    public static void main(String[]args){
        //creacion de objeto tiempo
       /* Cerveza cerveza = new Cerveza();
        cerveza.setNombre("Pilsener");
        cerveza.setPrecio(2);
        cerveza.setTipo("Personal");
        cerveza.Unidades_vendidas(100);
+
        System.out.println(cerveza.getNombre());
        System.out.println("precio: "+cerveza.getPrecio());
        System.out.println("tipo: "+cerveza.getTipo());
        System.out.println("unidades vendidas: "+cerveza.getUnidades_vendidas());

        float mostrar_ventas = cerveza.calcularVentas();
        System.out.println(mostrar_ventas);*/

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de la cerveza: ");
        String nombre = teclado.nextLine();
        System.out.println("tipo de cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("precio: ");
        float precio = teclado.nextFloat();
        System.out.println("Unidades vendidad: ");
        int unidades_vendidas = teclado.nextInt();

        Cerveza cerveza = new Cerveza(precio, unidades_vendidas, nombre, tipo);
        float mostrar_ventas = cerveza.calcularVentas();
        System.out.println(mostrar_ventas);
    }




}