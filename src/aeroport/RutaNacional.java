/*
 * Una ruta nacional es defineix pel seu codi, aeroport d’origen, aeroport de 
 * destí, distància i país.
 * v1.0
 */
package aeroport;

import java.util.Scanner;


/**
 *
 * @author root
 */
public class RutaNacional {
    
    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private double distancia;
    private String pais;
    
    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - DONE: Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaNacional(String pCodi, String pAeroportOri, String pAeroprtDes, double pDistancia, String pPais){
        codi = pCodi;
        aeroportOri = pAeroportOri;
        aeroportDes = pAeroprtDes;
        distancia = pDistancia;
        pais = pPais;
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
    public double getDistancia(){
        return distancia;
    }
    public void setDistancia(double pDistancia){
        this.distancia = pDistancia;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pPais){
        this.pais = pPais;
    }

    /*
    Paràmetres: cap
    Accions:
    - DONE: Demanar a l'usuari les dades per consola per crear una nova ruta nacional.
            Les dades a demanar són les que necessita el constructor.
    - DONE: Heu de tenir en compte que els aeroports no tene per què estar formats per una única 
            paraula, per exemple, El Prat.
     */
    public static RutaNacional novaRutaNacional() {
        Scanner in = new Scanner(System.in);
        String pCodi, pAeroportOri, pAeroprtDes, pPais;
        double pDistancia;

        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("Creacio d'una nova ruta nacional");
        System.out.println("Introdueix el codi de la ruta: ");
        pCodi = in.nextLine();
        System.out.println("Introdueix l'aeroport d'origen: ");
        pAeroportOri = in.nextLine();
        System.out.println("Introdueix l'aeroport de desti: ");
        pAeroprtDes = in.nextLine();
        System.out.println("Introdueix el pais de la ruta: ");
        pPais = in.nextLine();
        System.out.println("Introdueix la distancia total de la ruta: ");
        pDistancia = in.nextDouble();

        //instanciem un nou avio
        RutaNacional novaRutaN = new RutaNacional(pCodi, pAeroportOri, pAeroprtDes, pDistancia, pPais);

        return novaRutaN;
       
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
    public void modificarRutaNacional() {
        Scanner in = new Scanner(System.in);
        String pCodi, pAeroportOri, pAeroprtDes, pPais;
        double pDistancia;
        
        //Mostrem les dades de la ruta abans de la modificacio
        System.out.println("---Modificacio d'una ruta nacional---");
        System.out.println("\nLes dades actuals de la ruta son les seguents:");
        mostrarRutaNacional();

        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("Introdueix el codi de la ruta: ");
        pCodi = in.nextLine();
        System.out.println("Introdueix l'aeroport d'origen: ");
        pAeroportOri = in.nextLine();
        System.out.println("Introdueix l'aeroport de desti: ");
        pAeroprtDes = in.nextLine();
        System.out.println("Introdueix el pais de la ruta: ");
        pPais = in.nextLine();
        System.out.println("Introdueix la distancia total de la ruta: ");
        pDistancia = in.nextDouble();

        //Modifiquem les dades
        setCodi(pCodi);
        setAeroportOri(pAeroportOri);
        setAeroportDes(pAeroprtDes);
        setPais(pPais);
        setDistancia(pDistancia);
    }

    public void mostrarRutaNacional() {
        System.out.println("\nLes dades de la ruta nacional amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
        System.out.println("\nDistància: " + distancia);
        System.out.println("\nPaís: " + pais);
    }
}