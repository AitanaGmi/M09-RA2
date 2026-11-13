public class PrincipalDiferents {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan",false);
        Fil pepe = new Fil("Pepe",false);

        juan.setPriority(Thread.MAX_PRIORITY);
        pepe.setPriority(Thread.MIN_PRIORITY);


        pepe.start();
        juan.start();
        System.out.println("Acaba thread main");
    }
}
/*
    creamos los dos hilos, para que se haga uno primero y otro dsps de pone prioriodad
    diferente de forma diferente en cada uno para q se haga 1 antes q el otro.

*/
