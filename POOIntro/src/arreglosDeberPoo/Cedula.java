package arreglosDeberPoo;

public class Cedula {
    private int cedula;
    private String status;
    int v = 0;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cedula(int cedula){
        this.cedula = cedula;
    }

    public void validacion() {
        int[] coeficientes = {2,1,2,1,2,1,2,1,2};
        status = "Cédula incorrecta";

        int[] cedulaArray = new int[10];
        int contador = 9;
        for (int i = 0; i < cedulaArray.length ; i++) {
            cedulaArray[contador] = (int)((cedula/Math.pow(10,i))%10);
            contador--;
        }
        int suma = 0;
        int resultado;
        for (int i = 0; i < (cedulaArray.length-1); i++){
            resultado = coeficientes[i] * cedulaArray[i];
            if (resultado > 9){
                resultado -= 9;
            }
            suma += resultado;
        }
        int residuo = suma%10;
        if(residuo != 0){
            v = 10 - residuo;
        }

        if(v == cedulaArray[9]){
            status = "El numer de cedula es correcto";
        }
    }
    public int obtenerCedula(){
        return cedula;
    }
    public int obtenerValidador(){
        return v;
    }
    public String obtenerEstado(){
        return status;
    }
}
