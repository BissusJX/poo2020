package herenciaEmpl;

public class Administrativos extends Empleado{

    private double sueldoMen;
    private double sueldoQ;

    public Administrativos (double sueldoMensual){
        this.sueldoMen = sueldoMensual;
    }

    public double calcularSueldoAdm(){
        sueldoQ = sueldoMen / 2;
        return sueldoQ;
    }
}
