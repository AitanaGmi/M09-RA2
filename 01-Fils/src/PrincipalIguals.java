public class PrincipalIguals  {

    public static void main(String[] args) {
        Fil juan = new Fil("Juan", false);
        Fil pepe = new Fil("Pepe",false);

        juan.setPriority(Thread.MAX_PRIORITY);
        pepe.setPriority(Thread.MAX_PRIORITY);

        pepe.start();
        juan.start();


        System.out.println("Acaba thread main");
    }
}
/*Para que salgan de forma intercalada pongo la misma prioridad para q no haya ningun tipo
  de preferencia, iniciolos hilos con start().

*/