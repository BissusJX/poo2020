package arreglosDeberPoo;

public class Ficha {
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];

    public Ficha (String[] nombre, int[] edad, String[] universidad, String[] celular){
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.celular = celular;
    }
}
