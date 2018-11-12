/*
 * Una ruta internacional es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen i país de destí
 */
package aeroport;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class RutaInternacional {
    
    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private double distancia;
    
    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaInternacional(String pCodi, String pAeroportOrigen, String pAeroportDest, String pPaisOri, String pPaisDes, double pDistancia){
        codi = pCodi;
        aeroportOri = pAeroportOrigen;
        aeroportDes = pAeroportDest;
        paisOri = pPaisOri;
        paisDes = pPaisDes;
        distancia = pDistancia;
    };

    /*
    Mètodes accessors
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
    public double getDistancia(){
        return distancia;
    }
    public void setDistancia(double pDistancia){
        this.distancia = pDistancia;
    }


    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta internacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports països no tene per què estar formats per una única 
    paraula, per exemple, El Prat o Regne Unit.
     */
    public static RutaInternacional novaRutaInternacional() {
        Scanner in = new Scanner (System.in);
        String pCodi;
        String pAeroportOrigen; 
        String pAeroportDest; 
        String pPaisOri;
        String pPaisDes;
        double pDistancia;
        System.out.println("Introdueix un Codi per la nova ruta: ");
        pCodi = in.nextLine();
        System.out.println("Introdueix un aeroport d'origen: ");
        pAeroportOrigen = in.nextLine();
        System.out.println("Introdueix un aeroport d'esti: ");
        pAeroportDest = in.nextLine();
        System.out.println("Introdueix un pais Origen: ");
        pPaisOri = in.nextLine();
        System.out.println("Introdueix un pais Desti: ");
        pPaisDes = in.nextLine();
        System.out.println("Introdueix la distancia que es recorrerà: ");
        pDistancia = in.nextDouble();
        
        RutaInternacional rutaInternacional = new RutaInternacional( pCodi, pAeroportOrigen, pAeroportDest, pPaisOri, pPaisDes, pDistancia);
        return null;
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los.
    
     Retorn: cap
     */
    public void modificarRutaInternacional() {
                Scanner in = new Scanner (System.in);
        String pCodi, pAeroportOri, pAeroprtDes, pPaisOri, pPaisDes, pContinentOri, pContinentDes;
        double pDistancia;

        //Mostrem les dades de la ruta abans de la modificacio
        System.out.println("---Modificacio d'una ruta intercontinental---");
        System.out.println("Les dades actuals de la ruta son les seguents:");
        mostrarRutaInternacional();

        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("Noves dades:");
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
        setDistancia(pDistancia);

    }

    public void mostrarRutaInternacional() {
        System.out.println("\nLes dades de la ruta internacional amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
         System.out.println("\nPaís d'origen: " + paisOri);
        System.out.println("\nPaís de destí: " + paisDes);
        System.out.println("\nDistància: " + distancia);
    }
}
