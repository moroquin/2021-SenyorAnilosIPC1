public class juego {

    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];

    private static int Cantidad = 5;
    
    public juego(){
        ejercitoBestias = new Bestias[Cantidad];
        ejercitoHeroes = new Heroes[Cantidad];
    }

    public void presentarPersonajes(Personaje ejercito[]){
        if (ejercito.length> 0 ){
            String tempo = "";
            if (ejercito[0] instanceof Bestias){
                tempo = "Bestia";
            }
            else{
                tempo = "Heroe";
            }

            System.out.println("\nPresentando ejercito de "+tempo);

            /**System.out.println("\nPresentando ejercito de "+
                            (ejercito[0] instanceof Bestias?"Bestias":"Herores")
                            );**/

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        }
        else {
            System.out.println("No hay un ejercito ");
        }
    }

    public void jugar(){
        System.out.println("Bienvenido al juego del señor de los anillos: \n\n");
        this.inicializarBestias();
        this.inicializarHeroes();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);

    }

    public void inicializarHeroes(){
        ejercitoHeroes[0]= new Elfo("legolas");
        ejercitoHeroes[1]= new Hobbit("frodo");
        ejercitoHeroes[2] = new Humano("Aragon");
        ejercitoHeroes[3]= new Elfo("legolas2");
        ejercitoHeroes[4]= new Hobbit("frodo3");
    }

    public void inicializarBestias(){
        ejercitoBestias[0]= new Orco("no se");
        ejercitoBestias[1]= new Trasgo("trasgo 1");
        ejercitoBestias[2] = new Orco("orco 2");
        ejercitoBestias[3]= new Trasgo("Trasgo2");
        ejercitoBestias[4]= new Orco("orco 3");
    }
}
