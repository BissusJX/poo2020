package taller1;

public class EjecutarEstudiante {

    public static void main(String[]args){
        //creacion de objeto
        Estudiante estudiante = new Estudiante();

        estudiante.actualizar_nombre("Jungkook");
        estudiante.actualizar_apellido("Jeon");
        estudiante.actualizar_nacionalidad("Coreano");
        estudiante.actualizar_edad(21);
        estudiante.actualizar_genero("Masculino");

        String mostrar_apellido = estudiante.obtener_apellido();
        System.out.println(mostrar_apellido);

        String mostrar_nombre = estudiante.obtener_nombre();
        System.out.println(mostrar_nombre);

        String mostrar_nacionalidad = estudiante.obtener_nacionalidad();
        System.out.println(mostrar_nacionalidad);

        int mostrar_edad = estudiante.obtener_edad();
        System.out.println(mostrar_edad);

        String mostrar_genero = estudiante.obtener_genero();
        System.out.println(mostrar_genero);

        estudiante.estudiar();
    }




}
