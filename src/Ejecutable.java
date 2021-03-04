/**
 * Ejecutable
 */
public class Ejecutable {

    public static void main(String args[]){
       // asdf
       System.out.println("");
       //Personaje per = new Personaje(vida, armadura, ataque, nombre, esHeroe)
        Elfo elf = new Elfo("Oliver");
        elf.saludar();
        Hobbit hob = new Hobbit("frodo");
        hob.saludar();


    }
}