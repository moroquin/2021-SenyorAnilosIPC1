public class Personaje {

    protected int vida;
    protected int armadura;
    protected int ataque;
    protected String nombre;
    protected boolean esHeroe;

    private static int instanciasPersonajes;

    public Personaje(int vida, int armadura, int ataque, String nombre, boolean esHeroe) {
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
        this.nombre = nombre;
        this.esHeroe = esHeroe;
        instanciasPersonajes++;
    }

    public void saludar(){
        System.out.println("Hola soy un heroe " + this.nombre);
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getArmadura() {
        return this.armadura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean get() {
        return this.esHeroe;
    }

    public static int getInstancias(){
        return Personaje.instanciasPersonajes;
    }

}
