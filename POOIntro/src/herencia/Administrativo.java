package herencia;

public class Administrativo extends Persona{
    private String dependencia;

    public Administrativo(String dependecia,String nombre,String identificacion,String estadoCivil,String fechaNacimiento) {
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
    }
        public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public void gestionarProceso(){
        System.out.println("Metodo para gestionar proceso");
    }
}
