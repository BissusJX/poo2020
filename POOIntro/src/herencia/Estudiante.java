package herencia;

public class Estudiante extends Persona{

    private String carrera;
    public Estudiante(String carrera,String nombre,String identificacion,String estadoCivil,String fechaNacimiento){
        this.carrera= carrera;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento= fechaNacimiento;
        this.estadoCivil = estadoCivil;

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void estudiar () {
        System.out.println("estudiar");
    }
    public void matricularse() {
        System.out.println("Metodo para matricularse");
    }
}
