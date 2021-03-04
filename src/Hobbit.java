public class Hobbit extends Heroes {

    /** constructor */
    public Hobbit(String nombre){
        super(200, 40, nombre);
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Hobbit y me llamo   " + this.nombre);
    }
    
}
