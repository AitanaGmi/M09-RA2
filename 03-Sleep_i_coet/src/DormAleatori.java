import java.util.Random;

public class DormAleatori extends Thread {

    private long tempsTotal;

    public DormAleatori(String nom) {
        super(nom);
        tempsTotal = 0;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int intervalAleatori = random.nextInt(1000);

            System.out.printf("%s(%d) a dormir %4dms total %5dms%n",
                    getName(), i, intervalAleatori, tempsTotal);

            try {
                Thread.sleep(intervalAleatori);
                tempsTotal += intervalAleatori;
            } catch (InterruptedException e) {
                System.out.println("El fil " + getName() + " ha estat interromput");
            }
        }
    }

    public static void main(String[] args) {

        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");

        joan.start();
        pep.start();

        System.out.println("-- Fi de main -----------");
    }
}