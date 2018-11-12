/*
 * Una ruta internacional es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen i país de destí
 */
package aeroport;


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
