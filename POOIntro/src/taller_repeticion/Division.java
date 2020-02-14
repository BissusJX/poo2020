package taller_repeticion;
////Integrantes: Diana Serrano - Nohelia Ludeña
public class Division {
    private int dividendo;
    private int divisor;
    int i;

    public Division (int dividendo, int divisor){
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public void calcular_division (){
        for (i = 0; dividendo >= divisor; i++) {
            dividendo = dividendo - divisor;
        }
    }

    public int obteber_division () {
        return i;
    }
}
