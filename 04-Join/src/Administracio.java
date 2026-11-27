public class Administracio {
    private static final int numPob = 50;
    private Treballador[] pobAct;

    public Administracio() {
        pobAct = new Treballador[numPob];
        for (int i = 0; i < numPob; i++) {
            String nom = "Ciutadà-" + i;
            pobAct[i] = new Treballador(25000.0f, 20, 65, nom);
        }
    }

    public static void main(String[] args) {
        Administracio adm = new Administracio();

        for (int i = 0; i < numPob; i++) {
            adm.pobAct[i].start();//llamo al start no al run
        }

        for (int i = 0; i < numPob; i++) {
            try {
                adm.pobAct[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        for (int i = 0; i < numPob; i++) {
            Treballador t = adm.pobAct[i];
            System.out.printf("%s -> edat: %d / total: %.2f%n", t.getName(), t.getEdat(), t.getCobrat());
        }
    }
}