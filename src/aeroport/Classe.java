/*
 * Defineix una classe d’un avió. Una classe d’un avió es defineix pel seu nom 
 * (no pot haver-hi un avió amb dues classes amb el mateix nom) i capacitat.
 * 
 */
package aeroport;


/**
 *
 * @author root
 */
public class Classe {
      
    private String nomAvio;
    private short capAvio;
    
     /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public Classe(String pNom, short pCapacitat){
        nomAvio = pNom;
        capAvio = pCapacitat;
    }

    /*
    Mètodes accessors    
    */
    public String getNom(){
        return nomAvio;
    }
    public short getcapacitat(){
        return capAvio;
    }
    public void setNom(String pNom){
        nomAvio = pNom;
    }
    public void setCapacitat(short pCapacitat){
        capAvio = pCapacitat;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova classe d'avió. 
      Les dades a demanar són les que necessita el constructor.
    - També heu de tenir en compte que el nom, no té perquè estar formt per una única
    paraula, per exemple, Turista Preferent.
    Retorn: La nova classe.
     */
    public static Classe novaClasse() {
        return null;

    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los
     Retorn: cap
     */
    public void modificarClasse() {

    }

    public void mostrarClasse() {
        System.out.println("\nLa classe " + nomAvio + " té una capacitat de "+capAvio);
    }

    Object getNom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
