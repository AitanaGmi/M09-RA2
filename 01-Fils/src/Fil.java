/**
 * para hacer la case juan y pep hay q hace runa nica clase q es fil q sirbe para los dos,
 * hacemos q se extienda de thread asi puede funcionar como un hilo
 */
public class Fil extends Thread{
    private String nombre; //un nombre para cada hilo, debe ser sin static pq cuando cree pepe cambiare tmb el nombre de juan si tengo static
    private boolean estricto;

    public Fil(String nombre, boolean estricto){
        this.nombre=nombre; //y un constructor para cada uno de ellos
        this.estricto = estricto;


    }

    @Override 
    public void run(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <=1000; j++) {
                
            }

            System.out.println(nombre + " " + i);
            if(estricto){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Acaba el fil " + nombre);
    }
}