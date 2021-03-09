public class Humano extends Heroes {

    private static int contadorInstancias;

    public Humano(String nombre){
        super(180,75,nombre);
        Humano.contadorInstancias++;
    }

    public static int getInstancias(){
        return contadorInstancias;
    }
    

    
}
