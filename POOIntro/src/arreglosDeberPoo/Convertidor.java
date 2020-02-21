package arreglosDeberPoo;
import java.lang.Math;
public class Convertidor {
    private String num;
    private int i;
    private int conv;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Convertidor(String binario) {
        this.num = binario;
    }

    public void obtenerArray() {
        int numInt = Integer.parseInt(num);
        int[] array = new int[6];
        int a = 5;
        for (int i = 0; i < array.length; i++) {
            array[a] = (int) ((numInt / Math.pow(10, i)) % 10);
            a--;
        }
        a = 5;
        for (int i = 0; i < array.length; i++) {

            conv = (int) (conv + (array[i] * Math.pow(2, a)));

            a--;
        }
    }
    public void obtenerDecimal(){
        System.out.println("El numero binario:"+num+" en decimal es = "+ getConv() +" en decimal");
    }


    public int getConv() {
        return conv;
    }

    public void setConv(int conversion) {
        this.conv = conversion;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;


    }

}