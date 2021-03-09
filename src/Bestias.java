public class Bestias extends Personaje {
    
    private static int ataqueMaximo = 90;

    public Bestias(int vida, int armadura, String nombre){
        super(vida, armadura, Bestias.ataqueMaximo ,nombre, false);
    }

    @Override
    public int getAtaque(){
        return Dado.tirarDado(0, Bestias.ataqueMaximo , 1, true);
    }
    
}
