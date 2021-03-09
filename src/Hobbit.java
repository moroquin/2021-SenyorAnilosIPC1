public class Hobbit extends Heroes {

    private static int contadorInstancias;

    /** constructor */
    public Hobbit(String nombre){
        super(200, 40, nombre);
        Hobbit.contadorInstancias++;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Hobbit y me llamo   " + this.nombre);
    }
    
    public static int getInstancias(){
        return Hobbit.contadorInstancias;
    }
    
}
