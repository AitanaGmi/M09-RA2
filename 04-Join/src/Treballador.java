import java.util.Random;

public class Treballador extends Thread {
    private float salAnual;
    private int edIni;//cuando empieza
    private int edFin;//caudno acaba
    private int edAct; //la edad que tiene la persona
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

    public void cobra() {
        float paga = salAnual / 12.0f;
        cobrado = cobrado + paga;
    } // calcula el sueldo anual dividendolo y dsps lo suma a lo q cobrado tiene acumulado

    public void pagaImpostos() {
        float paga = salAnual / 12.0f;
        float imp = paga * 0.24f;
        cobrado = cobrado - imp;
    }//calcula el suedo del mes ysaco el 24% y - lo cobrado.

    @Override
    public void run() {
        while (edAct < edFin) {
            if (edAct >= edIni) {
                for (int i = 0; i < 12; i++) {
                    cobra();
                    pagaImpostos();
                }
            }
            edAct = edAct + 1;
        }
    }
    //si tiene la edad necesarioa cobra y paga impuestos
}