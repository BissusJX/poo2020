package taller1;

public class Universidad {

    //definicion de atributos
    private String nombre;
    private String ubicacion;
    private String infrastructura;
    private String tipo_univ;
    private String calificacion;



    public String obtener_nombre() {
        return this.nombre;
    }

    public String obtener_ubicacion() {
        return this.ubicacion;
    }

    public String obtener_infraestructura() {
        return this.infrastructura;
    }
    public String obtener_tipo_univ() {
        return this.tipo_univ;

    }
    public String obtener_calificacion() {
        return this.calificacion;
    }

    public void actualizar_nombre(String nombre) {
        //con el this hacemos referencia a variables globales
        this.nombre = nombre;

    }

    public void actualizar_ubicacion(String ubicacion) {
        this.ubicacion = ubicacion;

    }


    public void actualizar_infraestructura( String infrastructura) {
        this.infrastructura = infrastructura;

    }

    public void actualizar_tipo_univ(String tipo_univ) {
        this.tipo_univ = tipo_univ;

    }

    public void actualizar_calificacion(String calificacion) {
        this.calificacion= calificacion;

    }

    public void ofrecer_empleo() {
        System.out.println("su funcion es ofrecer emplo ");;

    }

    public void ofrecer_estudio() {
        System.out.println("su funcion es ofrecer estudio");;
    }

}
