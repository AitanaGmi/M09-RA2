import java.util.Scanner;

public class Coet {

    private Motor[] motores;

    public Coet() {
        motores = new Motor[4];

        for (int i = 0; i < motores.length; i++) {
            motores[i] = new Motor(i);
        }
    }

    public void arranca() {
        for (int i = 0; i < motores.length; i++) {
            motores[i].start();
        }
    }

    public void passaAPotencia(int p) {
        if (p >= 0 && p <= 10) {
            for (int i = 0; i < motores.length; i++) {
                motores[i].setPotencia(p);
            }
        } else {
            System.out.println("Error de valor");
        }
    }

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Coet coet = new Coet();

        coet.arranca();

        while (true) {
            int p = teclat.nextInt();

            if (p == 0) {
                break;
            }

            coet.passaAPotencia(p);
        }

        teclat.close();
    }
}