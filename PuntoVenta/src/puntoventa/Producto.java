/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

/**
 *
 * @author utpl
 */
public class Producto {
    private String nombre;
    private String unidadVend;
    private int cantidad;
    private double precio;

    public Producto(String nombre, String unidadVend, int cantidad, double precio) {
        this.nombre = nombre;
        this.unidadVend = unidadVend;
        this.cantidad = cantidad;
        this.precio = precio;
    }

  
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the unidadVend
     */
    public String getUnidadVend() {
        return unidadVend;
    }

    /**
     * @param unidadVend the unidadVend to set
     */
    public void setUnidadVend(String unidadVend) {
        this.unidadVend = unidadVend;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
