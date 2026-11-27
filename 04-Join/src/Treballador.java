import java.util.Random;

public class Treballador extends Thread {
    private float salAnual;
    private int edIni;
    private int edFin;
    private int edAct;
    private float cobrado;
    private Random rnd;

    public Treballador(float salAnual, int edIni, int edFin, String nom) {
        super(nom);
        this.salAnual = salAnual;
        this.edIni = edIni;
        this.edFin = edFin;
        this.edAct = 0;
        this.cobrado = 0.0f;
        this.rnd = new Random();
    }

    public float getCobrat() {
        return cobrado;
    }

    public int getEdat() {
        return edAct;
    }
}