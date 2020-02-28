package herenciaVolumen;

public class Cilindro {
    private double radio;
    private double altura;
    private double volumen;

    public Cilindro() {
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void calcularVolumen() {
        this.volumen = 3.141592D * Math.pow(this.radio, 2.0D) * this.altura;
    }
}
