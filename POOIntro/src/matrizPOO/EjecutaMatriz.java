package matrizPOO;


import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[]args){
        Scanner bang = new Scanner(System.in);
        int [][]mA = new int[3][3];
        int [][]mB = new int[3][3];


        for (int i=0; i < mA.length; i ++){
            for (int j=0; j < mA.length; j++){
                System.out.printf("Ingrese el numero %d - %d de la matriz A: ", i, j);
                mA[i][j] = bang.nextInt();
            }
        }
        for (int i=0; i < mB.length; i ++){
            for (int j=0; j < mB.length; j++){
                System.out.printf("Ingrese el numero %d - %d de la matriz B: ", i, j);
                mB[i][j] = bang.nextInt();
            }
        }
        SumaMatriz matriz = new SumaMatriz ();
        matriz.setMatrizA(mA);
        matriz.setMatrizB(mB);

        String mostrar = matriz.presentarMatriz(mA);
        System.out.println(mostrar);
        String mostrar2 = matriz.presentarMatriz(mB);
        System.out.println(mostrar2);
        String mostrar3 = matriz.presentarMatriz(matriz.sumaMatrizC());
        System.out.println(mostrar3);






    }
}
