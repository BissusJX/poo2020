package Intropoo;

public class EjecutaPersona {
    public static void main (String[]args){

        Persona persona = new Persona("femenino","libre",20,"Diana");
        System.out.println(persona.getNombre());
        System.out.println("Edad: " +persona.getEdad());
        System.out.println("religion: " +persona.getReligion());
        System.out.println("Genero: "+persona.getGenero());

        //Creacion de objeto con constructor 2

        Persona persona2 = new Persona("Masculino","Jimin");

        System.out.println(persona2.getNombre());
        System.out.println("genero: "+persona2.getGenero());

        Persona persona3 = new Persona("Jungkook",21);

        System.out.println(persona3.getNombre());
        System.out.println("edad: "+persona3.getEdad());


    }
}
