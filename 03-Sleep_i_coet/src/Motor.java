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
        while (true) {

            while (potenciaActual != potenciaObj) {

                String tipus;
                try {
                    // Entre 1 y 2 segundos
                    Thread.sleep(1000 + random.nextInt(1001));
                } catch (InterruptedException e) {
                    return;
                }

                if (potenciaActual < potenciaObj) {
                    potenciaActual++;
                    tipus = "Incre.";
                } else {
                    potenciaActual--;
                    tipus = "Decre.";
                }

                if (potenciaActual == potenciaObj) {
                    tipus = "FerRes";
                }

                System.out.println(getName() + ": " + tipus
                        + " Objectiu: " + potenciaObj + " Actual: " + potenciaActual);

                // Si el objetivo es 0 y hemos llegado a 0 el motor s epara
                if (potenciaObj == 0 && potenciaActual == 0) {
                    return;
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}