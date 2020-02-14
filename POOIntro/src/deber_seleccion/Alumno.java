package deber_seleccion;

public class Alumno {
    private String nombAlumno;
    private Double calf1;
    private Double calf2;
    private Double calf3;
    private Double calf4;
    private Double avr;


    public Alumno(String nombAlumno, Double calf1, Double calf2, Double calf3, Double calf4) {
        this.calf1 = calf1;
        this.calf2 = calf2;
        this.calf3 = calf3;
        this.calf4 = calf4;
    }

    public double avr() {
        avr = (calf1 + calf2 + calf3 + calf4) / 4;
        return avr;

    }

    public String validacion() {
        String mensaje = "";
        if (avr >= 60) {
            mensaje = "APROBADO";
        } else {
            mensaje = "REPROBADO";
        }
        return mensaje;
    }

 }
