public class Elfo extends Heroes {

    public Elfo(String nombre){
        super(250, 60, nombre);
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un elfo y me llamo   " + this.nombre);
    }

    @Override
    public int obtenerAtaque(Personaje defensor){
        if (defensor instanceof Orco){
            System.out.println(" "+ this.getNombre() + " furia elfica ");
            return this.getAtaque() + 10;

        }
        
        return this.getAtaque();
    }
}
