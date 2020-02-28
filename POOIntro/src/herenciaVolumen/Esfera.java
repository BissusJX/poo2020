package herenciaVolumen;

public class Esfera {
    private double radio;
    private double volumen;

    public Esfera() {
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void calcularVolumen() {
        this.volumen = 3.141592D * Math.pow(this.radio, 3.0D);
    }
}
