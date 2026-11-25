import java.util.Random;

public class Motor extends Thread {

    private int potenciaActual;
    private int potenciaObj;
    private Random random;

    public Motor(int num) {
        super("Motor " + num);
        this.potenciaActual = 0;
        this.potenciaObj = 0;
        this.random = new Random();
    }

    public void setPotencia(int p) {
        this.potenciaObj = p;
    }

    @Override
    public void run() {
        boolean sortir = false;

        while (!sortir) {
            while (potenciaActual != potenciaObj) {
                if (potenciaActual < potenciaObj) {
                    potenciaActual++;
                } else {
                    potenciaActual--;
                }

            }
        }
    }
}