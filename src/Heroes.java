public class Heroes extends Personaje {

    private static int ataqueMaximo = 100;

    public Heroes(int vida, int armadura, String nombre){
        super(vida, armadura, ataqueMaximo, nombre, true);
    }
    
}
