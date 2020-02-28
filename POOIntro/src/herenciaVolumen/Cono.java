package herenciaVolumen;

public class Cono {
    private double radio;
    private double altura;
    private double volumen;

    public Cono() {
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
        this.volumen = 0.0D * Math.pow(this.radio, 2.0D) * this.altura;
    }
}
