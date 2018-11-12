/*
 * Un tripulant de cabina de passatgers (TCP) es defineix pel seu passaport, nom
 * , edat, data d’alta en la companyia, hores que porta de vol i rang
 * v0.1
 */
package aeroport;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author root
 */

public class TCP {

    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;
    private LocalTime horesVol;
    private String rang;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys dataAlta rang.
     Accions:
     - DONE: Assignar als atributs els valors passats com a paràmetres.
     - DONE: Inicialitzar l'atribut dataAlta amb l'hora actual del sistema.
     - DONE: Inicialitzar l'atribut rang a null, ja que quan es crea un TCP, mai té rang.
     */
    public TCP(String pPassaport, String pNom, int pEdat, Date pDataAlta, 
            LocalTime pHoresVol, String pRang){
        passaport = pPassaport;
        nom = pNom;
        edat = pEdat;
        SimpleDateFormat dataAlta = new SimpleDateFormat("hh:mm:ss");
        horesVol = pHoresVol;
        rang = null;
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
        this.nom = pRang;
    }
    
    
    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou TCP.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que el nom no té per què estar format per una única 
    paraula, per exemple, Pep Gómez.
    - També heu de tenir en compte que les hores de vol són de tipus LocalTime, per
    tant heu de demanar a l'usuari les hores i minuts per crear el LocalTime. En aquest
    cas es considerarà que els segons i nanosegons, sempre són  0.
     */
    public static TCP nouTCP() {
        return null;
       
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte menys data d'alta i
     rang.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. En el cas de les hores de vol, només se li han
     de mostrar les hores i minuts.
    
     Retorn: cap
     */
    public void modificarTCP() {

    }

    public void mostrarTCP() {
        System.out.println("\nLes dades del tripulant de cabina amb passaport " + passaport + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nEdat: " + edat);
        System.out.println("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(dataAlta));
        System.out.println("\nHores de vol: " + horesVol.getHour() + ":" + horesVol.getMinute());
        System.out.println("\nRang: " + rang);
    }

}