package diseniopoo;

public class Cerveza {

    private float precio;
    private int unidades_vendidas;
    private String nombre;
    private String tipo;

    public Cerveza(float precio,int unidades_vendidas,String nombre,String tipo){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void Unidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float calcularVentas(){
        float totalVentas = precio * unidades_vendidas;
        return totalVentas;

    }
}
