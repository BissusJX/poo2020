package taller1;

public class Animal {
    //definicion de atributos
    private String especie;
    private String reproduccion;
    private String clasificacion;
    private String alimentacion;
    private float peso;


    /*
     *Metodo para obtener el valor de la variable especie

     */
    public String obtener_especie() {
        return this.especie;
    }
    /*
     *Metodo para obtener el valor de la variable reproduccion

     */

    public String obtener_reproduccion() {
        return this.reproduccion;
    }
    /*
     *Metodo para obtener el valor de la variable clasificacion

     */

    public String obtener_clacificacion() {
        return this.clasificacion;
    }
    /*
     *Metodo para obtener el valor de la variable alimentacion
     */
    public String obtener_alimentacion() {
        return this.alimentacion;

    }
    /*
     *Metodo para obtener el valor de la variable peso

     */
    public float obtener_peso() {
        return this.peso;
    }
    /*
     *Metodo para actualizar la variable especie

     */
    public void actualizar_especie(String especie) {
        //con el this hacemos referencia a variables globales
        this.especie = especie;

    }
    /*
     *Metodo para actualizar la variable reproduccion

     */
    public void actualizar_reproduccion(String reproduccion) {
        this.reproduccion = reproduccion;

    }

    /*
     *Metodo para actualizar la variable clasificacion

     */
    public void actualizar_clasificacion( String clasificacion) {
        this.clasificacion= clasificacion;

    }
    /*
     *Metodo para actualizar la variable alimentacion
     * @param segundo
     */
    public void actualizar_alimentacion(String alimentacion) {
        this.alimentacion= alimentacion;

    }
    /*
     *Metodo para actualizar la variable peso

     */
    public void actualizar_peso(float peso) {
        this.peso = peso;

    }

    public void reproducirse(){
        System.out.println("este metodo indica que el animal se reproduce");
    }

    public void alimentarse() {
        System.out.println("los animales se alimentan");

    }
}
