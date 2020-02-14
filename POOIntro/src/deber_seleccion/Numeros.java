package deber_seleccion;

public class Numeros {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int mayor;

    public Numeros(int numero1, int numero2, int numero3, int numero4){
        this.num1 = numero1;
        this.num2 = numero2;
        this.num3 = numero3;
        this.num4 = numero4;
    }

    public int calcularNumMayor(){
        if (num1 > num2 && num1 > num3 && num1 >  num4){
            mayor = num1;
        }else{
            if (num2 > num3 && num2 > num4){
                mayor = num2;
            }else{
                if (num3 > num4){
                    mayor = num3;
                } else {
                    mayor = num4;
                }
            }
        }
        return mayor;
    }

    public String sacarNumeroMayor(){
        String cadena = "";
        cadena = String.format("\nEl numero mayor es: %d", calcularNumMayor());
        return cadena;
    }
}
