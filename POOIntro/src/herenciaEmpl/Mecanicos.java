package herenciaEmpl;

public class Mecanicos extends Empleado{
    private double valorTrab;
    private double veces;
    private double sueldoQ;

    public Mecanicos (double valorTrabajos, double veces){
        this.valorTrab = valorTrabajos;
        this.veces = veces;
    }

    public double calcularSueldoMec(){
        sueldoQ = (valorTrab * veces);
        sueldoQ = sueldoQ * 0.04;
        return sueldoQ;
    }
}
