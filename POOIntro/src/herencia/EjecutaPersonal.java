package herencia;
import java.util.Scanner;
public class EjecutaPersonal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        String nombre,identificacion,estadoCivil,fechaNac,carrera,dependencia,area;

        System.out.println(" Escriba el numero deacuerdo a la opcion que desea : \n1.Datos estudiante" +
                "\n2.Datos docente: \n3Datos Administrativo");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        if (opcion==1) {
            System.out.println("Ingrese nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese identificacion");
            identificacion = entrada.nextLine();
            System.out.println("Ingrese la carrera del estudiante");
            carrera = entrada.nextLine();
            System.out.println("Ingrese estado civil");
            estadoCivil = entrada.nextLine();
            System.out.println("Ingrese fecha de nacimiento");
            fechaNac = entrada.nextLine();

            Estudiante est = new Estudiante(carrera, nombre, identificacion, estadoCivil, fechaNac);
            est.setNombre(nombre);
            est.setIdentificacion(identificacion);
            est.setCarrera(carrera);
            est.setEstadoCivil(estadoCivil);
            est.setFechaNacimiento(fechaNac);

            System.out.println("---------------------------------");
            System.out.println("Datos de objeto Estudiante");
            System.out.println("----------------------------------");
            System.out.println("Nombre del Estudiante: " + est.getNombre());
            System.out.println("Identificacion: " + est.getIdentificacion());
            System.out.println("Carrera: " + est.getCarrera());
            System.out.println("Estado civil: " + est.getEstadoCivil());
            System.out.println("Fecha de nacimiento: " + est.getFechaNacimiento());
        }else {
            if (opcion == 2){
                System.out.println("Ingrese nombre");
                nombre = entrada.nextLine();
                System.out.println("Ingrese identificacion");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese el area del docente");
                area = entrada.nextLine();
                System.out.println("Ingrese estado civil");
                estadoCivil = entrada.nextLine();
                System.out.println("Ingrese fecha de nacimiento");
                fechaNac = entrada.nextLine();

                Docente doc = new Docente(area, nombre, identificacion, estadoCivil, fechaNac);
                doc.setNombre(nombre);
                doc.setIdentificacion(identificacion);
                doc.setArea(area);
                doc.setEstadoCivil(estadoCivil);
                doc.setFechaNacimiento(fechaNac);
                System.out.println();

                System.out.println("---------------------------------");
                System.out.println("Datos de objeto Docente");
                System.out.println("----------------------------------");
                System.out.println("Nombre del Docente: " + doc.getNombre());
                System.out.println("Identificacion: " + doc.getIdentificacion());
                System.out.println("Area: " + doc.getArea());
                System.out.println("Estado civil: " + doc.getEstadoCivil());
                System.out.println("Fecha de nacimiento: " + doc.getFechaNacimiento());
            }else{

                System.out.println("Ingrese nombre");
                nombre = entrada.nextLine();
                System.out.println("Ingrese identificacion");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese la dependencia");
                dependencia = entrada.nextLine();
                System.out.println("Ingrese estado civil");
                estadoCivil = entrada.nextLine();
                System.out.println("Ingrese fecha de nacimiento");
                fechaNac = entrada.nextLine();


                Administrativo adm = new Administrativo(dependencia, nombre, identificacion, estadoCivil, fechaNac);
                adm.setNombre(nombre);
                adm.setIdentificacion(identificacion);
                adm.setDependencia(dependencia);
                adm.setEstadoCivil(estadoCivil);
                adm.setFechaNacimiento(fechaNac);

                System.out.println("---------------------------------");
                System.out.println("Datos de objeto Administrativo");
                System.out.println("----------------------------------");
                System.out.println("Nombre del Administrador: " + adm.getNombre());
                System.out.println("Identificacion: " + adm.getIdentificacion());
                System.out.println("Dependencia: " + adm.getDependencia());
                System.out.println("Estado civil: " + adm.getEstadoCivil());
                System.out.println("Fecha de nacimiento: " + adm.getFechaNacimiento());

             }

        }
    }
}
