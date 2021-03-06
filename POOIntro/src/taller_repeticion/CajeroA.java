package taller_repeticion;

public class CajeroA {

    private String nombre;
    private double saldoInicial;
    private double retiro;
    private double deposito;
    private double saldoFinal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldo_inicial) {
        this.saldoInicial = saldo_inicial;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoF(double saldo_final) {
        this.saldoFinal = saldo_final;
    }

    public CajeroA (String nom, double saldo){
        nombre = nom;
        saldoInicial = saldo;
    }

    public double calcularSaldo(int opcion, double cantidad){
        if(opcion==2){
            saldoFinal = saldoInicial + cantidad;
        } else {
            if(opcion==3){
                if(cantidad>saldoInicial){
                    System.out.printf("No puede retirar mas dinero ");
                } else{
                    saldoFinal = saldoInicial - cantidad;
                }
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
        return saldoFinal;
    }
}
