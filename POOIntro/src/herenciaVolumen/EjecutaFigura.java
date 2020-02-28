package herenciaVolumen;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 6;

        while(opcion != 5) {
            System.out.println("\nAreas Figuras Geometricas\n1.CUBO\n2.CILINDRO\n3.CONO\n4.ESFERA\n5.FIN\nESCOGER OPCION: ");
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1:
                    Cubo cubo = new Cubo();
                    System.out.println("ingrese el valor de la arista");
                    cubo.setArista(entrada.nextDouble());
                    cubo.calcularVolumen();
                    System.out.printf("El valor del volumen es: %s", cubo.getVolumen());
                    break;
                case 2:
                    Cilindro cilindro = new Cilindro();
                    System.out.println("ingrese el valor del radio");
                    cilindro.setRadio(entrada.nextDouble());
                    System.out.println("ingrese el valor de la altura");
                    cilindro.setAltura(entrada.nextDouble());
                    cilindro.calcularVolumen();
                    System.out.printf("El valor del volumen es: %s", cilindro.getVolumen());
                    break;
                case 3:
                    Cono cono = new Cono();
                    System.out.println("ingrese el valor del radio");
                    cono.setRadio(entrada.nextDouble());
                    System.out.println("ingrese el valor de la altura");
                    cono.setAltura(entrada.nextDouble());
                    cono.calcularVolumen();
                    System.out.printf("El valor del volumen es: %s", cono.getVolumen());
                    break;
                case 4:
                    Esfera esfera = new Esfera();
                    System.out.println("ingrese el valor del radio");
                    esfera.setRadio(entrada.nextDouble());
                    esfera.calcularVolumen();
                    System.out.printf("El valor del volumen es: %s", esfera.getVolumen());
                case 5:
                    break;
                default:
                    System.out.println("ingrese un numero correcto");
            }
        }

    }
}
