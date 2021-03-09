public class Heroes extends Personaje {

    private static int ataqueMaximo = 100;

    private static int instanciasHeroes;

    public Heroes(int vida, int armadura, String nombre){
        super(vida, armadura, ataqueMaximo, nombre, true);
        Heroes.instanciasHeroes++;
    }

    public static int getInstancias(){
        return Heroes.instanciasHeroes;
    }
    
}
