/*
 * Un tripulant de cabina es defineix pel seu passaport, nom, edat, data d’alta 
 * en la companyia, hores que porta de vol, rang i barres
 */
package components;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class TripulantCabina {

    private final static Scanner DADES = new Scanner(System.in);

    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;
    private LocalTime horesVol;
    private String rang;
    private int barres;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys dataAlta i barres.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar l'atribut dataAlta amb l'hora actual del sistema.
     - Inicialitzar l'atribut barres mitjançant el mètode pertinent d'aquesta classe.
     */
    public TripulantCabina(String pPass, String pNom, int pEdat, LocalTime pHoresVol, String pRang){
       passaport = pPass;
       nom = pNom;
       edat = pEdat;
       SimpleDateFormat dataAlta= new SimpleDateFormat("hh:mm:ss");
       horesVol = pHoresVol;
       rang = pRang;
       barres = assignarBarres(pRang);
    }

    /*
    Mètodes accessors
     */
    public String getPassaport(){
        return passaport;
    }

    public void setPassaport(String pPassaport){
        this.passaport = pPassaport;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String pNom){
        this.nom = pNom;
    }

    public int getEdat(){
        return edat;
    }

    public void setEdat(int pEdat){
        this.edat = pEdat;
    }
    
    public Date getDataAlta(){
        return dataAlta;
    }

    public void setDataAlta(Date pDataAlta){
        this.dataAlta = pDataAlta;
    }

    public LocalTime getHoresVol(){
        return horesVol;
    }

    public void setHoresVol(LocalTime pHoresVol){
        this.horesVol = pHoresVol;
    }
    
    public String getRang(){
        return rang;
    }

    public void setRang(String pRang){
        this.rang = pRang;
    }
    
    public int getBarres(){
        return barres;
    }
    
    public void setBarres(int pBarres){
        this.barres = pBarres;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou tripulant de cabina.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que el nom no té per què estar format per una única 
    paraula, per exemple, Pep Gómez.
    - També heu de tenir en compte que les hores de vol són de tipus LocalTime, per
    tant heu de demanar a l'usuari les hores i minuts per crear el LocalTime. En aquest
    cas es considerarà que els segons i nanosegons, sempre són  0.
    -  Li demanarà a l'usuari el rang del tripulant de cabina tenint en compte que
    "C" serà el que ha d'introduir l'usuari si el rang és comandant, "CP" si és
    copilot i "EV" si és enginyer de vol.
    - Si no introdueix cap dels tres rangs, no se li assignarà cap valor al rang i se 
    li mostrarà a l'usuari el missatge "\nEl rang introduït no és correcte".
    - Si el rang introduït és correcte, se li assignarà a l'atribut rang "Comandant"
    en cas que el valor introduït sigui "C", "Copilot" en cas que el valor introduït
    sigui "CP" i "Enginyer de vol" en cas que el valor introduït sigui "EV".
    Retorn: El nou tripulant de cabina.
     */
    public static TripulantCabina nouTripulantCabina() {
        Scanner in = new Scanner (System.in);
        String pPass, pNom,pRang;
        int pEdat, hores, minuts;
        
        LocalTime pHoresVol;
        boolean rang = false;
        System.out.println("/* Nou Tripulant de Cabina */");
        System.out.println("Introduexi un passaport per el tripulant: ");
        pPass = in.nextLine();
        System.out.println("Introdueix un nom per el tripulant: ");
        pNom = in.nextLine();
        System.out.println("Introdueix una edat per el tripulant: ");
        pEdat = in.nextInt();
        System.out.println("Introdueix les hores del vol: ");
        hores = in.nextInt();
        System.out.println("Introdueix els minuts del vol: ");
        minuts = in.nextInt();
        pHoresVol = LocalTime.of(hores, minuts);
        do{
            System.out.println("Intrdoueix un rang per al tripulant (C)-> Comandant, (CP)-> Copilot, (EV)-> enginyer de vol. ");
            pRang = in.nextLine();
            if(pRang != "CP" || pRang != "C" || pRang != "EV"){
                System.out.println("El rang introduït no és correcte");
            }else if(pRang == "C"){
                pRang = "Comandant";
                rang = true;
            }else if(pRang == "CP"){
                pRang = "Copilot";
                rang = true;
            }else if (pRang == "EV"){
                pRang = "Enginyer de vol";
                rang = true;
            }
        }
        while( rang != true);
        
        TripulantCabina nouTripulant = new TripulantCabina( pPass, pNom,pEdat,pHoresVol,pRang);
        return null;
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte menys data d'alta.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. En el cas de les hores de vol, només se li han
     de mostrar les hores i minuts.
     - Si es vol modificar el rang, a l'hora de demanar-li el nou rang a l'usuari
     haurem de fer el mateix que en el mètode nouTripulantCabina, però en aquest 
     cas, si no s'introdueix un rang correcte, en lloc de no assignar-li res a 
     l'atribut rang, el que farem és no modificar el seu valor actual.
     - Abans de modificar el valor del rang, hem de comprovar que el nou valor 
     compleix els requisits especificats en l'enunciat de la pràctica de la UF1 
     del mòdul 5, és a dir, un Enginyer de cabina pot passar a ser còpilot si té 5
     o més anys d'antiguetat, i un copilot pot passar a ser comandant, si té 15 
     o més anys d'antiguetat.
     - Si modifiquem el valor del rang, també haurem de modificar el valor de les
     barres amb el mètode adient d'aquesta classe.
    
     NOTA: 5 anys són 157788000 segons.
    
     Retorn: cap
     */
    public void modificarTripulantCabina() {
         Scanner in = new Scanner (System.in);
         String pPass, pNom, pRang;
         int pEdat, hores, minuts, segons, barres = 0;
         
         LocalTime pHoresVol;
         
         //Mostrem les dades del Tripulant abans de la modificacio
        System.out.println("---Modificacio d'una ruta intercontinental---");
        System.out.println("Les dades actuals del Tripulant son les seguents:");
        mostrarTripulantCabina();
        
        System.out.println("Noves Dades:");
        System.out.println("Introdueix el nou passaport:");
        pPass = in.nextLine();
        System.out.println("Introdueix el nou nom: ");
        pNom = in.nextLine();
        System.out.println("Introdueix la nova edat:");
        pEdat = in.nextInt();
        System.out.println("Introdueix les hores de vol:");
        hores = in.nextInt();
        System.out.println("Introdueix els minuts de vol:");
        minuts = in.nextInt();
        
        pHoresVol = LocalTime.of(hores, minuts);
        segons = hores*3600;
        segons += (minuts*60);
        pRang = getRang();
        
        if(segons>=157788000 && pRang == "Enginyer de vol"){
            setRang("Copilot");
            barres = assignarBarres("Copilot");
        }else if(segons>= 473364000 && pRang == "Copilot"){
            setRang("Comandant");
            barres = assignarBarres("Comandant");
        }
        else{
            setRang(pRang);
        }
        setPassaport(pPass);
        setNom(pNom);
        setEdat(pEdat);
        setHoresVol(pHoresVol);
        setBarres(barres);

    }

    public void mostrarTripulantCabina() {
        System.out.println("\nLes dades del tripulant de cabina amb passaport " + passaport + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nEdat: " + edat);
        System.out.println("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(dataAlta));
        System.out.println("\nHores de vol: " + horesVol.getHour() + ":" + horesVol.getMinute());
        System.out.println("\nRang: " + rang);
        System.out.println("\nBarres: " + barres);
    }

    /*
     Paràmetres: rang
     Accions:
     - Se li assignarà a l'atribut barres el valor corresponent segons el rang introduït
     per paràmetre i les especificacions de l'enunciat de la UF1 del mòdul 5, és a dir, 
     en el cas del copilot, 2 barres si té menys de 1500 hores de vol i 3 si té 1500 o més, 
     en el cas del comandant sempre 4 i en el cas de l'enginyer de vol sempre 1.
     Retorn: número de barres
     */
    public int assignarBarres(String pRang) {
        int barres = 0;
        
        if(pRang == "Copilot" && this.horesVol.getHour()<1500){
            barres = 2;
        }else if(pRang == "Copilot" && this.horesVol.getHour() >= 1500){
            barres = 3;
        }
        else if(pRang == "Comandant"){
            barres = 4;
        }else if(pRang == "Enginyer de vol"){
            barres = 1;
        }
        return barres;

    }

}
