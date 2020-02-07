package intropoo;

public class EjecutarTiempo {

    public static void main(String[]args){
        //creacion de objeto tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_Hora(10);
        tiempo.actualizar_Minuto(51);
        tiempo.actualizar_Segundo(45);
        String mostrar_tiempo = tiempo.obtener_Tiempo();
        System.out.println(mostrar_tiempo);
    }
}
