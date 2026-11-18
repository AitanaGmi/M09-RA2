import java.util.Random;

public class Futbolista extends Thread {
    private int ngols;
    private int ntirades;

    static final int NUM_JUGADORS = 11;
    static final int NUM_TIRADES = 20;
    static final float PROBABILITAT = 0.5f;

    Random  random =  new Random();

    public int getNgols() {
        return ngols;
    }

    public int ntirades(){
        return ntirades;
    }

    public Futbolista(String nombre){
        super(nombre);
        this.ngols = 0;
        this.ntirades = 0;
    }

    @Override 
    public  void run(){
        for (int i = 0; i < NUM_TIRADES; i++) {
            ntirades+=1;

            int prob = random.nextInt(2);

            if(prob >= PROBABILITAT){
                ngols+=1;
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {

        Futbolista[] jugadores = new Futbolista[Futbolista.NUM_JUGADORS];

        String[] nombres = {
            "Piqué", "Vinicius", "Torres", "Ramos",
            "Ronaldo", "Lewan", "Belli", "Arnau",
            "Aspas", "Messi", "MBapé"
        };
    }
}
