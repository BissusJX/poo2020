package herencia;

public class Docente extends Persona {

    public Docente(String area,String nombre,String identificacion,String estadoCivil,String fechaNacimiento){
        this.area = area;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento= fechaNacimiento;
        this.estadoCivil = estadoCivil;
    }

    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void enseniar(){
        System.out.println("metodo para enseniar");
    }
    public void calificar(){
        System.out.println("metodo para calificar");
    }
}
