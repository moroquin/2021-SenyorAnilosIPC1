public class juego {

    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];

    private static int Cantidad = 5;
    
    public juego(){
        ejercitoBestias = new Bestias[Cantidad];
        ejercitoHeroes = new Heroes[Cantidad];

    }

    public void jugar(){
        System.out.println("Bienvenido al juego del señor de los anillos: \n\n");
    }

    public void inicializarHeroes(){
        ejercitoHeroes[0]= new Elfo("legolas");
        ejercitoHeroes[1]= new Hobbit("frodo");
        ejercitoHeroes[2] = new Humano("Aragon");
        ejercitoHeroes[3]= new Elfo("legolas2");
        ejercitoHeroes[4]= new Hobbit("frodo3");
    }
}
