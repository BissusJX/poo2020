package taller1;

public class Docente {

    //definicion de atributos
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String genero;
    private String titulo;

    public String obtener_nombre() {
        return this.nombre;
    }


    public String obtener_apellido() {
        return this.apellido;
    }

    public String obtener_nacionalidad() {
        return this.nacionalidad;
    }
    public String obtener_titulo() {
        return this.titulo;

    }
    public String obtener_genero() {
        return this.genero;
    }

    public void actualizar_nombre(String nombre) {
        //con el this hacemos referencia a variables globales
        this.nombre = nombre;

    }

    public void actualizar_apellido(String apellido) {
        this.apellido = apellido;

    }


    public void actualizar_nacionalidad( String nacionalidad) {
        this.nacionalidad = nacionalidad;

    }

    public void actualizar_titulo(String  titulo) {
        this.titulo = titulo;

    }

    public void actualizar_genero(String genero) {
        this.genero = genero;

    }
    public void enseñar() {
        System.out.println("su funcion es enseñar");;
    }


}
