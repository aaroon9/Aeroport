/*
 * Una ruta intercontinental es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen i continent 
 * de destí
 * v1.2
 */

package components;
import java.util.Scanner;

/**
 *
 * @author root
 */

public class RutaIntercontinental {

    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private String continentOri;
    private String continentDes;
    private double distancia;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - DONE: Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaIntercontinental(String pCodi, String pAeroportOri, String pAeroprtDes, String pPaisOri, String pPaisDes, String pContinentOri, String pContinentDes, double pDistancia){
        codi = pCodi;
        aeroportOri = pAeroportOri;
        aeroportDes = pAeroprtDes;
        paisOri = pPaisOri;
        paisDes = pPaisDes;
        continentOri = pContinentOri;
        continentDes = pContinentDes;
        distancia = pDistancia;
    }

    
    /*
    DONE: Mètodes accessors
    */
    public String getCodi(){
        return codi;
    }
    public void setCodi(String pCodi){
        this.codi = pCodi;
    }
    public String getAeroportOri(){
        return aeroportOri;
    }
    public void setAeroportOri(String pAeroportOri){
        this.aeroportOri = pAeroportOri;
    }
    public String getAeroportDes(){
        return aeroportDes;
    }
    public void setAeroportDes(String pAeroprtDes){
        this.aeroportDes = pAeroprtDes;
    }
    public String getPaisOri(){
        return paisOri;
    }
    public void setPaisOri(String pPaisOri){
        this.paisOri = pPaisOri;
    }
    public String getPaisDes(){
        return paisDes;
    }
    public void setPaisDes(String pPaisDes){
        this.paisDes = pPaisDes;
    }
    public String getContinentOri(){
        return continentOri;
    }
    public void setContinentOri(String pContinentOri){
        this.continentOri = pContinentOri;
    }
    public String getContinentDes(){
        return continentDes;
    }
    public void setContinentDes(String pContinentDes){
        this.continentDes = pContinentDes;
    }
    public double getDistancia(){
        return distancia;
    }
    public void setDistancia(double pDistancia){
        this.distancia = pDistancia;
    }
    

   /*
    Paràmetres: cap
    Accions:
    - DONE: Demanar a l'usuari les dades per consola per crear una nova ruta internacional.
            Les dades a demanar són les que necessita el constructor.
    - DONE: Heu de tenir en compte que els aeroports i països no tene per què estar formats
            per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaIntercontinental novaRutaIntercontinental() {
        Scanner in = new Scanner(System.in);
        String pCodi, pAeroportOri, pAeroprtDes, pPaisOri, pPaisDes, pContinentOri, pContinentDes;
        double pDistancia;

        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("Creacio d'una nova ruta intercontinental");
        System.out.println("Introdueix el codi de la ruta: ");
        pCodi = in.nextLine();
        System.out.println("Introdueix l'aeroport d'origen: ");
        pAeroportOri = in.nextLine();
        System.out.println("Introdueix l'aeroport de desti: ");
        pAeroprtDes = in.nextLine();
        System.out.println("Introdueix el pais d'origen: ");
        pPaisOri = in.nextLine();
        System.out.println("Introdueix el pais de desti: ");
        pPaisDes = in.nextLine();
        System.out.println("Introdueix el continent d'origen: ");
        pContinentOri = in.nextLine();
        System.out.println("Introdueix el continent de desti: ");
        pContinentDes = in.nextLine();
        System.out.println("Introdueix la distancia total de la ruta: ");
        pDistancia = in.nextDouble();

        //instanciem un nou avio
        RutaIntercontinental novaRutaIC = new RutaIntercontinental(pCodi, pAeroportOri, pAeroprtDes, pPaisOri, pPaisDes, pContinentOri, pContinentDes, pDistancia);

        return novaRutaIC;
    }


    /*
     Paràmetres: cap
     Accions:
     - DONE: Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
             i modificar els atributs corresponents d'aquest objecte.
     - DONE: Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
             actual, abans de modificar-los.
    
     Retorn: cap
     */
    public void modificarRutaIntercontinental() {
        Scanner in = new Scanner(System.in);
        String pCodi, pAeroportOri, pAeroprtDes, pPaisOri, pPaisDes, pContinentOri, pContinentDes;
        double pDistancia;

        //Mostrem les dades de la ruta abans de la modificacio
        System.out.println("---Modificacio d'una ruta intercontinental---");
        System.out.println("\nLes dades actuals de la ruta son les seguents:");
        mostrarRutaIntercontinental();

        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("\nNoves dades:");
        System.out.println("Introdueix el codi de la ruta: ");
        pCodi = in.nextLine();
        System.out.println("Introdueix l'aeroport d'origen: ");
        pAeroportOri = in.nextLine();
        System.out.println("Introdueix l'aeroport de desti: ");
        pAeroprtDes = in.nextLine();
        System.out.println("Introdueix el pais d'origen: ");
        pPaisOri = in.nextLine();
        System.out.println("Introdueix el pais de desti: ");
        pPaisDes = in.nextLine();
        System.out.println("Introdueix el continent d'origen: ");
        pContinentOri = in.nextLine();
        System.out.println("Introdueix el continent de desti: ");
        pContinentDes = in.nextLine();
        System.out.println("Introdueix la distancia total de la ruta: ");
        pDistancia = in.nextDouble();

        //Modifiquem les dades
        setCodi(pCodi);
        setAeroportOri(pAeroportOri);
        setAeroportDes(pAeroprtDes);
        setPaisOri(pPaisOri);
        setPaisDes(pPaisDes);
        setContinentOri(pContinentOri);
        setContinentDes(pContinentDes);
        setDistancia(pDistancia);
    }


    public void mostrarRutaIntercontinental() {
        System.out.println("\nLes dades de la ruta intercontinental amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
        System.out.println("\nPaís d'origen: " + paisOri);
        System.out.println("\nPaís de destí: " + paisDes);
        System.out.println("\nContinent d'origen: " + continentOri);
        System.out.println("\nContinent de destí: " + continentDes);
        System.out.println("\nDistància: " + distancia);
    }
}

