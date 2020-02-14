package disenio_repeticion;

public class Empleado {
    private double horasTrabajadas;
    private double valorHora;
    private String nombre;
    private double sueldo;
    private String mensaje;

    public  Empleado(double horasTrabajadas,double valorHora, String nombre) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public double getValorHora() {
        return valorHora;
    }

    public Empleado(String nom,double horas,double valor){
        this.nombre = nom;
        this.horasTrabajadas= horas;
        this.valorHora = valor;
    }
    public  Empleado(String nom, double horas){
        this.nombre = nom;
        this.horasTrabajadas = horas;
    }
    public void establecerValorHora( double valor){
        this.valorHora = valor;
    }


    public double calcularSueldo() {
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * valorHora;
        } else {
            sueldo = (40 * valorHora) + ((horasTrabajadas - 40) * (valorHora * 2));
        }
        return sueldo;
    }

    public String presentar(){
        mensaje = String.format("%s\nNombre: %s\nHoras Trabajadas: %.2f\nValor por hora: %.2f\nSUELDO: %.2f",
                mensaje, nombre, horasTrabajadas, valorHora, calcularSueldo());
        return mensaje;
    }
}
