package taller1;

public class Computadora {

    //definicion de atributos
    private String modelo;
    private String color;
    private String tamaño;
    private float capacidad;
    private String fecha_compra;

    public String obtener_tamaño() {
        return this.tamaño;
    }


    public String obtener_modelo() {
        return this.modelo;
    }

    public String obtener_color() {
        return this.color;
    }

    public String obtener_fechaCompra() {
        return this.fecha_compra;

    }

    public float obtener_capacidad() {
        return this.capacidad;
    }

    public void actualizar_tamaño(String tamaño) {
        //con el this hacemos referencia a variables globales
        this.tamaño = tamaño;

    }

    public void actualizar_modelo(String modelo) {
        this.modelo = modelo;

    }


    public void actualizar_color( String color) {
        this.color= color;

    }


    public void actualizar_capacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public void actualizar_fechaCompra(String fecha_compra) {
        this.fecha_compra = fecha_compra;

    }

    public void procesar() {
        System.out.println("su funcion es procesar informacion");;
    }
}
