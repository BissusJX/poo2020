package herenciaVolumen;

public class Cubo {
    private double arista;
    private double volumen;

    public Cubo() {
    }

    public double getArista() {
        return this.arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void calcularVolumen() {
        this.volumen = Math.pow(this.arista, 3.0D);
    }
}
