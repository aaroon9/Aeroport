/*
 * Una ruta transoceànica es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen, continent 
 * de destí i oceà que sobrevola.
 */
package aeroport;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class RutaTransoceanica {

    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private String continentOri;
    private String continentDes;
    private String ocea;
    private double distancia;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaTransoceanica(String pCodi, String pAeroportOri, String pAeroportDes, String pPaisOri, String pPaisDes, String pContinentOri, String pContinentDes, String pOcea,  double pDistancia){
        codi = pCodi;
        aeroportOri = pAeroportOri;
        aeroportDes = pAeroportDes;
        paisOri = pPaisOri;
        paisDes = pPaisDes;
        continentOri = pContinentOri;
        continentDes = pContinentDes;
        ocea = pOcea;
        distancia = pDistancia;
    }
    
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
    public String getContinentOri(){
        return continentOri;
    }
    public void setContinentOri( String pContinentOri){
        this.continentOri = pContinentOri;
    }
    public String getContinentDes(){
        return continentDes;
    }
    public void setContinetDes(String pContinentDes){
        this.continentDes = pContinentDes;
    }
    public String getOcea(){
        return ocea;
    }
    public void setOcea(String pOcea){
        this.ocea = pOcea;
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
    - Demanar a l'usuari les dades per consola per crear una nova ruta transcoceanica.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports i països no tene per què estar formats
    per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaTransoceanica novaRutaTransoceanica() {
        Scanner in = new Scanner (System.in);
        String pCodi;
        String pAeroportOrigen; 
        String pAeroportDest; 
        String pPaisOri;
        String pPaisDes;
        String pContinentOri;
        String pContinentDes;
        String pOcea;
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
        System.out.println("Introdueix un continent d'origen: ");
        pContinentOri = in.nextLine();
        System.out.println("Introdueix un continent de desti: ");
        pContinentDes = in.nextLine();
        System.out.println("Introdueix l'ocea que es sobrevola: ");
        pOcea = in.nextLine();
        System.out.println("Introdueix la distancia que es recorrerà: ");
        pDistancia = in.nextDouble();
        
        RutaTransoceanica rutaTransoceanica = new RutaTransoceanica(pCodi,pAeroportOrigen,pAeroportDest,pPaisOri,pPaisDes,pContinentOri,pContinentDes, pOcea,pDistancia);
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
    public void modificarRutaTransoceanica() {
        Scanner in = new Scanner (System.in);
        String pCodi, pAeroportOri, pAeroprtDes, pPaisOri, pPaisDes, pContinentOri, pContinentDes;
        double pDistancia;

        //Mostrem les dades de la ruta abans de la modificacio
        System.out.println("---Modificacio d'una ruta intercontinental---");
        System.out.println("Les dades actuals de la ruta son les seguents:");
        mostrarRutaTransoceanica();

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

    public void mostrarRutaTransoceanica() {
        System.out.println("\nLes dades de la ruta transoceànica amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
        System.out.println("\nPaís d'origen: " + paisOri);
        System.out.println("\nPaís de destí: " + paisDes);
        System.out.println("\nContinent d'origen: " + continentOri);
        System.out.println("\nContinent de destí: " + continentDes);
        System.out.println("\nOceà que sobrevola: " + ocea);
        System.out.println("\nDistància: " + distancia);
    }
}

