/*
 * Un avió es defineix pel seu codi, fabricant, model, capacitat i un vector amb 
 * les seves classes.
 * v1.4
 */

package components;
import java.util.Scanner;

/**
 *
 * @author root
 */

public class Avio {

    private String codi;
    private String fabricant;
    private String model;
    private int capacitat;
    private Classe[] classes;
    private int posicioClasses; //Atribut que controla la primera posició buida del vector

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys classes i posicioClasses.
     Accions:
     - DONE! Assignar als atributs els valors passats com a paràmetres.
     - DONE! Inicialitzar el vector classes com a buit i una longitud de 4.
     - DONE! Inicialitzar l'atribut possicioClasses a 0.
     */
    public Avio(String pCodi, String pFabricant, String pModel, int pCapacitat){
        codi = pCodi;
        fabricant = pFabricant;
        model = pModel;
        capacitat = pCapacitat;
        classes = new Classe[4];
        posicioClasses = 0;
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

    public String getFabricant(){
        return fabricant;
    }

    public void setFabricant(String pFabricant){
        this.fabricant = pFabricant;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String pModel){
        this.model = pModel;
    }

    public int getCapacitat(){
        return capacitat;
    }

    public void setCapacitat(int pCapacitat){
        this.capacitat = pCapacitat;
    }


    /*
    Paràmetres: cap
    Accions:
    - DONE: Demanar a l'usuari les dades per consola per crear un nou avió.
            Les dades a demanar són les que necessita el constructor.
    - DONE: També heu de tenir en compte que el fabricant o model, no tenen perquè estar
            formats per una única paraula, per exemple, Airbus Company o Boing 777
    Retorn: El nou avió.
     */
    public static Avio nouAvio() {
        Scanner in = new Scanner(System.in);
        String pCodi, pFabricant, pModel;
        int pCapacitat;
        
        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("Creacio d'un nou avio");
        System.out.println("Introdueix el codi de l'avio: ");
        pCodi = in.nextLine();
        System.out.println("Introdueix el fabricant de l'avio: ");
        pFabricant = in.nextLine();
        System.out.println("Introdueix el model de l'avio: ");
        pModel = in.nextLine();
        System.out.println("Introdueix la capacitat de l'avio: ");
        pCapacitat = in.nextInt();

        //instanciem un nou avio
        Avio avioNou = new Avio(pCodi, pFabricant, pModel, pCapacitat);

        return avioNou;
    }


    /*
     Paràmetres: cap
     Accions:
     - DONE:Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
            i modificar els atributs corresponents d'aquest objecte.
     - DONE:Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
            actual, abans de modificar-los
     Retorn: cap
     */
    public void modificarAvio() {
        Scanner in = new Scanner(System.in);
        String pCodi, pFabricant, pModel;
        int pCapacitat;

        //Mostrem les dades de l'avio abans de la modificacio
        System.out.println("---Modificacio d'un avio---");
        System.out.println("\nLes dades actuals de l'avio son les seguents:");
        mostrarAvio();

        //demanem les dades a l'usuari i les assignem a variables
        System.out.println("\nNoves dades:");
        System.out.println("Introdueix el codi de l'avio: ");
        pCodi = in.nextLine();
        System.out.println("Introdueix el fabricant de l'avio: ");
        pFabricant = in.nextLine();
        System.out.println("Introdueix el model de l'avio: ");
        pModel = in.nextLine();
        System.out.println("Introdueix la capacitat de l'avio: ");
        pCapacitat = in.nextInt();

        //Modifiquem les dades
        setCodi(pCodi);
        setFabricant(pFabricant);
        setModel(pModel);
        setCapacitat(pCapacitat);
    }


    public void mostrarAvio() {
        System.out.println("\nLes dades de l'avió amb codi " + codi + " són:");
        System.out.println("\nFabricant: " + fabricant);
        System.out.println("\nModel: " + model);
        System.out.println("\nCapacitat: " + capacitat);
    }


    /*
     Paràmetres: cap
     Accions:
     - DONE:Afegeix una nova classe al vector de classes de l'avió actual si aquesta encara
            no s'ha afegit. S'ha de comprovar si s'ha afegit fent servir el mètode pertinent
            d'aquesta classe, i actualitzar la posició del vector de classes.
     - DONE:Abans d'afegir la classe, també heu de comprovar que la seva capacitat sumada
            a la capacitat de les altres classes de l'avió, no superi la capacitat total
            de l'avió.
     - DONE:Si l'ingredient ja s'havia afegit o bé la seva capacitat sumada a les capacitats
            de les altres classes supera la capacitat total de l'avió, no s'afegirà de nou i
            li mostrarem a l'usuari el missatge "\nLa classe no s'ha pogut afegir".
     Retorn: cap
     */
    public void afegirClasse() {
        Scanner in = new Scanner(System.in);
        String nomClasse;
        int capacitatClasse, capacitatTotal = 0;
        boolean afegida = false;
        Classe classeNova = Classe.novaClasse();

        //demanem les dades de la nova classe a l'usuari
        System.out.println("Afegir classe");
        System.out.println("Introdueix el nom de la classe:");
        nomClasse = in.nextLine();
        System.out.println("Introdueix la capacitat de la classe:");
        capacitatClasse = in.nextInt();

        //Sumem la capacitat de la nova classe a una variable auxiliar de capacitat
        capacitatTotal += capacitatClasse;

        //Comprovem si la classe existeix
        if(seleccionarClasse(nomClasse) == -1){
            //Calculem la nova capacitat teorica que tindra l'avio
            for(int i = 0; i < posicioClasses; i++){
                capacitatTotal += classes[i].getCapacitat();
            }
            //si es compleixen ambdues condicions es crea la classe
            if(capacitatTotal <= capacitat){
                classes[posicioClasses] = classeNova;
                posicioClasses++;
                //Marquem que esta afegida
                afegida = true;
            }
        }

        //Mostrem error en el cas de que no l'afegim
        if(!afegida){
            System.out.println("\nLa classe no s'ha pogut afegir");
        }
    }


    public int seleccionarClasse(String nom) {
        boolean trobat = false;
        int pos = -1;
        for (int i = 0; i < posicioClasses && !trobat; i++) {
            if (classes[i].getNom().equals(nom)) {
                pos = i;
                trobat = true;
            }
        }
        return pos;
    }
}

