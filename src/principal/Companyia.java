/*
 * Classe que defineix una companyia. Una companyia es defineix per un codi i un 
 * nom. A més, contindrà vectors amb avions, rutes nacionals, rutes internacionals,
 * rutes intercontinentals, rutes transocèaniques, tripulants de cabina, TCPs i vols.
 */
package principal;

import components.Avio;
import components.RutaIntercontinental;
import components.RutaInternacional;
import components.RutaNacional;
import components.RutaTransoceanica;
import components.TCP;
import components.TripulantCabina;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author root
 */

public class Companyia {

    private final static Scanner DADES = new Scanner(System.in);
    private int codi;
    private static int properCodi = 1; //El proper codi a assignar
    private String nom;
    private Avio[] avions;
    private int posicioAvions; //Posició actual buida del vector avions
    private RutaNacional[] rutesNacionals;
    private int posicioRutesNacionals; //Posició actual buida del vector rutesNacionals
    private RutaInternacional[] rutesInternacionals;
    private int posicioRutesInternacionals; //Posició actual buida del vector rutesInternacionals
    private RutaIntercontinental[] rutesIntercontinentals;
    private int posicioRutesIntercontinentals; //Posició actual buida del vector rutesIntercontinentals
    private RutaTransoceanica[] rutesTransoceaniques;
    private int posicioRutesTransoceaniques; //Posició actual buida del vector rutesTransoceaniques
    private TripulantCabina[] tripulantsCabina;
    private int posicioTripulantsCabina; //Posició actual buida del vector tripulantsCabina
    private TCP[] tcps;
    private int posicioTcps; //Posició actual buida del vector tcps
    private Vol[] vols;
    private int posicioVols; //Posició actual buida del vector vols

    /*
     CONSTRUCTOR
     Paràmetres: valor per l'atribut nom
     Accions:
     - Assignar a l'atribut corresponent el valor passat com a paràmetre
     - Assignar a l'atribut codi el valor de l'atribut properCodi i actualitzar
     properCodi amb el següent codi a assignar.
     - avions s'ha d'inicialtizar buit i amb una capacitat per 200 avions.
     - rutesNacionals s'ha d'inicialtizar buit i amb una capacitat per 100 rutes nacionals.
     - rutesInternacionals s'ha d'inicialtizar buit i amb una capacitat per 200 rutes internacionals.
     - rutesIntercontinentals s'ha d'inicialtizar buit i amb una capacitat per 100 rutes intercontinentals.
     - rutesTransoceaniques s'ha d'inicialtizar buit i amb una capacitat per 45 rutes transoceàniques.
     - tripulantsCabina s'ha d'inicialtizar buit i amb una capacitat per 600 tripulants de cabina.
     - tcps s'ha d'inicialtizar buit i amb una capacitat per 1000 TCPs.
     - vols s'ha d'inicialtizar buit i amb una capacitat per 700 vols.
     - posicioRutesNacionals, posicioRutesInternacionals, posicioRutesIntercontinentals, posicioRutesTransoceaniques, 
       posicioTripulantsCabina, posicioTcps i posicioVols, s'han d'inicialitzar a 0, què serà la primera posició
       buida dels vectors inicilitzats.
     */
    public Companyia(String pNom){
        nom = pNom;
        codi = properCodi; properCodi++;
        avions = new Avio[100];
        rutesNacionals = new RutaNacional[100];
        rutesInternacionals = new RutaInternacional[200];
        rutesIntercontinentals = new RutaIntercontinental[100];
        rutesTransoceaniques = new RutaTransoceanica[45];
        tripulantsCabina = new TripulantCabina[600];
        tcps = new TCP[1000];
        vols = new Vol[700];
        posicioRutesNacionals = 0;
        posicioRutesInternacionals = 0;
        posicioRutesIntercontinentals = 0;
        posicioRutesTransoceaniques = 0;
        posicioTripulantsCabina = 0;
        posicioAvions = 0;
        posicioTcps = 0;
        posicioVols = 0;
    }
    
    /*
     Mètodes accessors    
     */
    public String getNom(){
        return nom;
    }
    public void setNom(String pNom){
        this.nom = pNom;
    }
    public int getCodi(){
        return codi;
    }
    public Avio[] getAvions() {
        return avions;
    }
    public void setAvions(Avio[] pAvions) {
        avions = pAvions;
    }
    public int getProperCodi() {
        return properCodi;
    }
    public void setProperCodi(int pProperCodi) {
        properCodi = pProperCodi;
    }
    public RutaNacional[] getRutesNacionals() {
        return rutesNacionals;
    }
    public void setRutesNacionals(RutaNacional[] pRutesNacionals) {
        rutesNacionals = pRutesNacionals;
    }
    public RutaInternacional[] getRutesInternacionals() {
        return rutesInternacionals;
    }
    public void setRutesrutesInternacionals(RutaInternacional[] pRutesInternacionals) {
        rutesInternacionals = pRutesInternacionals;
    }
    public RutaIntercontinental[] getRutesIntercontinentals() {
        return rutesIntercontinentals;
    }
    public void setRutesIntercontinentals(RutaIntercontinental[] pRutesIntercontinentals) {
        rutesIntercontinentals = pRutesIntercontinentals;
    }
    public RutaTransoceanica[] getRutesTransoceaniques() {
        return rutesTransoceaniques;
    }
    public void setRutesTransoceaniques(RutaTransoceanica[] pRutesTransoceaniques) {
        rutesTransoceaniques = pRutesTransoceaniques;
    }
    public TripulantCabina[] getTripulantsCabina() {
        return tripulantsCabina;
    }
    public void setTripulantsCabina(TripulantCabina[] pTripulantsCabina) {
        tripulantsCabina = pTripulantsCabina;
    }
    public int getPosicioRutesNacionals(){
        return posicioRutesNacionals;
    }
    public void setPosicioRutesNacionals(int pPosicioRutesNacionals){
        this.posicioRutesNacionals = pPosicioRutesNacionals;
    }
    public int getPosicioRutesInternacionals(){
        return posicioRutesInternacionals;
    }
    public void setPosicioRutesInternacionals(int pPosicioRutesInternacionals){
        this.posicioRutesInternacionals = pPosicioRutesInternacionals;
    }
    public int getPosicioRutesIntercontinentals(){
        return posicioRutesIntercontinentals;
    }
    public void setPosicioRutesIntercontinentals(int pPosicioRutesIntercontinentals){
        this.posicioRutesIntercontinentals = pPosicioRutesIntercontinentals;
    }
    public int getPosicioRutesTransoceaniques(){
        return posicioRutesTransoceaniques;
    }
    public void setPosicioRutesTransoceaniques(int pPosicioRutesTransoceaniques){
        this.posicioRutesTransoceaniques = pPosicioRutesTransoceaniques;
    }
    public int getPosicioTripulantsCabina(){
        return posicioTripulantsCabina;
    }
    public void setPosicioTripulantsCabina(int pPosicioTripulantsCabina){
        this.posicioTripulantsCabina = pPosicioTripulantsCabina;
    }
    public int getPosicioAvions(){
        return posicioAvions;
    }
    public void setPosicioAvions(int pPosicioAvions){
        this.posicioAvions = pPosicioAvions;
    }
    public int getPosicioTcps(){
        return posicioTcps;
    }
    public void setPosicioTcps(int pPosicioTcps){
        this.posicioTcps = pPosicioTcps;
    }
    public int getPosicioVols(){
        return posicioVols;
    }
    public void setPosicioVols(int pPosicioVols){
        this.posicioVols = pPosicioVols;
    }
    public TCP[] getTcps() {
        return tcps;
    }
    public void setTcps(TCP[] pTcps) {
        tcps = pTcps;
    }
    public Vol[] getVol() {
        return vols;
    }
    public void setVols(Vol[] pVols) {
        vols = pVols;
    }
    
    
    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova Companyia. Les dades
     a demanar són les que necessita el constructor.
     - Heu de tenir en compte que el nom de la companyia, poden ser frases, per exemple,
     Singapore Airlines.
     Retorn: La nova companyia.
     */
    public static Companyia novaCompanyia() {
        Scanner in = new Scanner(System.in);
        String pNom;
        
        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("Creacio d'una nova companyia");
        System.out.println("Introdueix el nom de la companyia: ");
        pNom = in.nextLine();
        
        //instanciem una nova companyia
        Companyia novaCompanyia = new Companyia(pNom);

        return novaCompanyia;
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte. En aquest cas
     no es pot modificar el contingut dels vectors, només el de l'atribut nom. 
     Evidentment, tampoc podeu modificar el codi.
     - Li heu de mostrar a l'usuari els valor actual del nom de l'objecte
     actual, abans de modificar-lo.
     Retorn: cap
     */
    public void modificarCompanyia() {
        Scanner in = new Scanner(System.in);
        String pNom;
        
        //Mostrem les dades de la companyia abans de la modificacio
        System.out.println("---Modificacio d'una companyia---");
        System.out.println("\nLes dades actuals de la companyia son les seguents:");
        mostrarCompanyia();
        
        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("Modificacio d'una companyia");
        System.out.println("Introdueix el nom de la companyia: ");
        pNom = in.nextLine();
        
        //instanciem una nova companyia
        setNom(pNom);
    }

    public void mostrarCompanyia() {
        System.out.println("\nLes dades de la companyia amb codi " + codi + " són:");
        System.out.println("\nNom:" + nom);
    }

    /*
     AVIÓ
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou avió al vector d'avions de l'objecte actual (el que cridarà
     al mètode), fent servir el mètode de la classe Avio pertinent.
     - actualitza la posició del vector d'avions.
     Retorn: cap
     */
    public void afegirAvio() {
        this.avions[posicioAvions] = Avio.nouAvio();
        posicioAvions++;
    }

    public int seleccionarAvio() {

        System.out.println("\nCodi de l'avió?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioAvions && !trobat; i++) {
            if (avions[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA NACIONAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta nacional al vector de rutes nacionals de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaNacional pertinent.
     - actualitza la posició del vector de rutes nacionals.
     Retorn: cap
     */
    public void afegirRutaNacional() {
        this.rutesNacionals[posicioRutesNacionals] = RutaNacional.novaRutaNacional();
        posicioRutesNacionals++;
    }

    public int seleccionarRutaNacional() {

        System.out.println("\nCodi de la ruta nacional?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioRutesNacionals && !trobat; i++) {
            if (rutesNacionals[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA INTERNACIONAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta internacional al vector de rutes internacionals de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaInternacional pertinent.
     - actualitza la posició del vector de rutes internacionals.
     Retorn: cap
     */
    public void afegirRutaInternacional() {
        this.rutesInternacionals[posicioRutesInternacionals] = RutaInternacional.novaRutaInternacional();
        posicioRutesInternacionals++;
    }

    public int seleccionarRutaInternacional() {

        System.out.println("\nCodi de la ruta internacional?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioRutesInternacionals && !trobat; i++) {
            if (rutesInternacionals[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA INTERCONTINENTAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta intercontinental al vector de rutes intercontinental de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaIntercontinental pertinent.
     - actualitza la posició del vector de rutes intercontinental.
     Retorn: cap
     */
    public void afegirRutaIntercontinental() {
        this.rutesIntercontinentals[posicioRutesIntercontinentals] = RutaIntercontinental.novaRutaIntercontinental();
        posicioRutesIntercontinentals++;
    }

    public int seleccionarRutaIntercontinental() {

        System.out.println("\nCodi de la ruta intercontinental?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioRutesIntercontinentals && !trobat; i++) {
            if (rutesIntercontinentals[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA TRANSOCEÀNICA
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta transoceànica al vector de rutes transoceàniques de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaTransoceanica pertinent.
     - actualitza la posició del vector de rutes transoceàniques.
     Retorn: cap
     */
    public void afegirRutaTransoceanica() {
        this.rutesTransoceaniques[posicioRutesTransoceaniques] = RutaTransoceanica.novaRutaTransoceanica();
        posicioRutesTransoceaniques++;
    }

    public int seleccionarRutaTransoceanica() {

        System.out.println("\nCodi de la ruta transoceànica?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioRutesTransoceaniques && !trobat; i++) {
            if (rutesTransoceaniques[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     TRIPULACIÓ CABINA
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou tripulant de cabina al vector de tripulants de cabina de 
     l'objecte actual (el que cridarà al mètode), fent servir el mètode de la classe 
     TripulantCabina pertinent.
     - actualitza la posició del vector de tripulants de cabina.
     Retorn: cap
     */
    public void afegirTripulantCabina() {
        this.tripulantsCabina[posicioTripulantsCabina] = TripulantCabina.nouTripulantCabina();
        posicioTripulantsCabina++;
    }

    public int seleccionarTripulantCabina() {

        System.out.println("\nCodi del tripulant de cabina?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioTripulantsCabina && !trobat; i++) {
            if (tripulantsCabina[i].getPassaport().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     TCP
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou TCP al vector de TCPs de l'objecte actual (el que cridarà 
     al mètode), fent servir el mètode de la classe TCP pertinent.
     - actualitza la posició del vector de TCPs.
     Retorn: cap
     */
    public void afegirTCP() throws ParseException{
        this.tcps[posicioTcps] = TCP.nouTCP();
        posicioTcps++;
    }

    public int seleccionarTCP() {

        System.out.println("\nCodi del tripulant de la cabina de passatgers?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioTcps && !trobat; i++) {
            if (tcps[i].getPassaport().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     VOL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou vol al vector de vols de l'objecte actual (el que cridarà 
     al mètode), fent servir el mètode de la classe Vol pertinent.
     - actualitza la posició del vector de vols.
     Retorn: cap
     */
    public void afegirVol() throws ParseException {
        this.vols[posicioVols] = Vol.nouVol();
        posicioVols++;
    }

    public int seleccionarVol() {

        System.out.println("\nCodi del vol?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioVols && !trobat; i++) {
            if (vols[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     Paràmetres: cap
     Accions:
     - afegeix l'avió seleccionat de la companyia al vol seleccionat, si el vol i l'avió 
     existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar els 
     avió i vol, i el mètode escaient de la classe Vol per afegir l'avió al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap avió i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi l'avió
     li mostrarem el missatge "\nNo existeix aquest avió"
     Retorn: cap
     */
    public void afegirAvioVol() {
        int posV, posA;
        posV = seleccionarVol();
        
        if(posV != -1){
            Vol pVol = vols[posV];
            posA = seleccionarAvio();
            if(posA != -1){
                Avio pAvio = avions[posA];
                pVol.setAvio(pAvio);
            } else {
                System.out.println("Aquest avio no existeix");
            }
        } else {
            System.out.println("Aquest vol no existeix");
        }
    }

    /*
     Paràmetres: cap
     Accions:
     - afegeix el tripulant de cabina seleccionat de la companyia al vector de
     tripulació de cabina del vol seleccionat, si el vol i el tripulant de cabina
     existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar el 
     tripulant de cabina i vol, i el mètode escaient de la classe Vol per afegir 
     el tripulant de cabina al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap tripulant de cabina i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi el tripulant de cabina
     li mostrarem el missatge "\nNo existeix aquest tripulant de cabina"
     Retorn: cap
     */
    public void afegirTripulantCabinaVol() {
        int posV, posTc;
        posV = seleccionarVol();

        if (posV != -1) {
            Vol pVol = vols[posV];
            posTc = seleccionarTripulantCabina();
            
            if (posTc != -1) {
                TripulantCabina tripCab = tripulantsCabina[posTc];
                pVol.afegirTripulantCabina(tripCab);
            } else {
                System.out.println("Aquest tripulant de cabina no existeix");
            }
        } else {
            System.out.println("Aquest vol no existeix");
        }
    }
    
    /*
     Paràmetres: cap
     Accions:
     - afegeix el TCP seleccionat de la companyia al vector de TCPs del vol seleccionat, 
     si el vol i el TCP existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar el 
     TCP i vol, i el mètode escaient de la classe Vol per afegir el TCP al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap TCP i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi el TCP
     li mostrarem el missatge "\nNo existeix aquest tripulant de cabina de passatgers"
     Retorn: cap
     */
    public void afegirTCPVol() {
        int posV, posTcp;
        posV = seleccionarVol();
        
        if (posV != -1) {
            Vol pVol = vols[posV];
            posTcp = seleccionarTCP();
            
            if (posTcp != -1) {
                TripulantCabina tripCab = tripulantsCabina[posicioTripulantsCabina];
                pVol.afegirTripulantCabina(tripCab);
            } else {
                System.out.println("Aquest tripulant de cabina no existeix");
            }
        } else {
            System.out.println("Aquest vol no existeix");
        }
    }

    /*
     Paràmetres: cap
     Accions:
     - Afegeix la ruta seleccionada de la companyia al vol seleccionat, si el vol 
     i la ruta existeixen en la companyia, i actualitza el tipus de ruta del vol
     amb el tipus de la ruta afegida.    
     - Heu de tenir en compte que la ruta a seleccionar ha de ser del tipus passat
     per paràmetre, és a dir, tipus 1 és ruta nacional, tipus 2 és ruta internacional,
     tipus 3 és ruta intercontinental i tipus 4 és ruta transoceànica.
     - Heu de fer servir els mètodes escaients d'aquesta classe per seleccionar 
     la ruta i el vol, i el mètode escaient de la classe Vol per afegir la ruta
     al vol seleccionat i actualitzar el tipus de ruta.
     - Si el vol no existeix, no s'afegirà cap ruta i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi la ruta
     li mostrarem el missatge "\nNo existeix aquesta ruta"    
     Retorn: cap
     */
    public void afegirRutaVol(int tipus) {
         Vol pVol = vols[seleccionarVol()];
        if (pVol != null) {
            switch (tipus) {
                case 1:
                    pVol.setRuta(RutaNacional.novaRutaNacional());
                    break;
                case 2:
                    pVol.setRuta(RutaInternacional.novaRutaInternacional());
                    break;
                case 3:
                    pVol.setRuta(RutaIntercontinental.novaRutaIntercontinental());
                    break;
                case 4:
                    pVol.setRuta(RutaIntercontinental.novaRutaIntercontinental());
                    break;
                default:
                    System.out.println("Aquesta ruta no existeix");
            }

        }
    }

}
