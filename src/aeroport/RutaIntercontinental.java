/*
 * Una ruta intercontinental es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen i continent 
 * de destí
 */
package aeroport;

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
        aeroprtDes = pAeroprtDes;
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
        return pCodi;
    }
    public void setCodi(pCodi){
        this.codi = pCodi;
    }
    public String getAeroportOri(){
        return pAeroportOri;
    }
    public void setAeroportOri(pAeroportOri){
        this.aeroportOri = pAeroportOri;
    }
    public String getAeroportDes(){
        return pAeroprtDes;
    }
    public void setAeroportDes(pAeroprtDes){
        this.aeroprtDes = pAeroprtDes;
    }
    public String getPaisOri(){
        return pPaisOri;
    }
    public void setPaisOri(pPaisOri){
        this.paisOri = pPaisOri;
    }
    public String getPaisDes(){
        return pPaisDes;
    }
    public void setPaisDes(pPaisDes){
        this.paisDes = pPaisDes;
    }
    public String getContinentOri(){
        return pContinentOri;
    }
    public void setContinentOri(pContinentOri){
        this.continentOri = pContinentOri;
    }
    public String getContinentDes(){
        return pContinentDes;
    }
    public void setContinentDes(pContinentDes){
        this.continentDes = pContinentDes;
    }
    public String getDistancia(){
        return pContinentDes;
    }
    public void setDistancia(pDistancia){
        this.distancia = pDistancia;
    }
    
   /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta internacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports i països no tene per què estar formats
    per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaIntercontinental novaRutaIntercontinental() {
        String codiA, fabricantA, modelA;
        int capacitatA, classes;

        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("Creacio d'un nou avio");
        System.out.println("Introdueix el codi de l'avio: ");
        codiA = in.nextLine();
        System.out.println("Introdueix el fabricant de l'avio: ");
        fabricantA = in.nextLine();
        System.out.println("Introdueix el model de l'avio: ");
        modelA = in.nextLine();
        System.out.println("Introdueix la capacitat de l'avio: ");
        capacitatA = in.nextInt();

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
    public void modificarRutaIntercontinental() {

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

