package herenciaEmpleado;

public class EmpleadoHora extends Empleado {
    private int hora;
    private Double  valorHora;
    private double sueldo;

    public EmpleadoHora( String nombre, String cargo, String dependencia,int hora, Double valorHora){
        this.valorHora= valorHora;
        this.hora= hora;
        this.nombre= nombre;
        this.cargo= cargo;
        this.dependencia = dependencia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    public double calcularSueldo (){
        double sueldo;
        sueldo =  hora* valorHora;

        return sueldo;
    }

}
