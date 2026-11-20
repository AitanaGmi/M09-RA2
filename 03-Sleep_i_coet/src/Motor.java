public class Motor extends Thread {

    private int potenciaActual;
    private int potenciaObj;
    private boolean comandaRebuda;
    private boolean apagar;

    public Motor(int num) {
        super("Motor " + num);
        potenciaActual = 0;
        potenciaObj= 0;
        comandaRebuda = false;
        apagar = false;
    }

    public void setPotencia(int p){
        potenciaObj = p;

        if(p == 0){
            apagar = true;
        }
    }

}