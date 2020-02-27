package herenciaEmpleado;

public class EmpleadoAsalariado extends Empleado {
    private double valorMensual;

    public EmpleadoAsalariado(String nombre, String cargo, String dependencia,double valorMensual){
        this.valorMensual= valorMensual;
        this.nombre= nombre;
        this.cargo= cargo;
        this.dependencia = dependencia;
    }

    public double getValor_Mensual() {
        return valorMensual;
    }

    public void setValor_Mensual(double valor_Mensual) {
        this.valorMensual = valor_Mensual;
    }
    public void calcularSueldoA(){
        System.out.println("El sueldo de un empleado asalariado es: "+valorMensual);
    }
}
