/*
 * Un vol es defineix pel seu codi, ruta, avio, un vector amb els seus tripulants 
 * (tripulació), data de sortida, data d’arribada, hora de sortida, hora d’arribada
 * i durada.
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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Vol {
    private final static Scanner DADES = new Scanner(System.in);
    private String codi;
    private Object ruta;
    private int tipusRuta;
    private Avio avio;
    private TripulantCabina[] tripulacioCabina;
    private int posicioTripulacioCabina;
    private TCP[] tcps;
    private int posicioTcps;
    private Date dataSortida;
    private Date dataArribada;
    private LocalTime horaSortida;
    private LocalTime horaArribada;
    private String durada;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys ruta, avio,
     tripulacioCabina, tipusRuta, posicioTripulacioCabina, tcp i posicioTCP.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar ruta i avio a null, ja que quan es crea un vol, encara no s'han
     assignat ni la ruta ni l'avio.
     - Inicialitzarem l'atribut tipusRuta a 0, ja que com no s'ha assignat encara una ruta,
     no podem saber de quin tipus és.
     - Inicialitzar el vector tripulacioCabina com a buit i una longitud de 7.
     - Inicialitzar el vector tcps com a buit i una longitud de 25.
     - Inicialitzar els atributs posicioTripulacioCabina i posicioTcps a 0.
     - Inicialitzar l'atribut durada amb el mètode pertinent d'aquesta classe.
     */
    public Vol(String pCodi, Date pSortida, Date pArribada, LocalTime pHoraSortida, LocalTime pHoraArribada){
        codi = pCodi;
        ruta = null;
        tipusRuta = 0;
        avio = null;
        tripulacioCabina = new TripulantCabina[7];
        tcps = new TCP[25];
        posicioTripulacioCabina = 0;
        posicioTcps = 0;
        dataSortida = pSortida;
        dataArribada = pArribada;
        horaSortida = pHoraSortida;
        horaArribada = pHoraArribada;
        calcularDurada();
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
    public Object getRuta(){
        return ruta;
    }
    public void setRuta(Object pRuta){
        ruta = pRuta;
    }
    public int getTipusRuta(){
        return tipusRuta;
    }
    public void setTipusRuta( int pTipusRuta){
        this.tipusRuta = pTipusRuta;
    }
    public Avio getAvio(){
        return avio;
    }
    public void setAvio(Avio pAvio){
        avio = pAvio;
    }
    public TripulantCabina getTripulantCabina(){
        return tripulacioCabina[posicioTripulacioCabina];
    }
    public void setTripulantCabina(TripulantCabina[] pTripulant){
        tripulacioCabina = pTripulant;
    }
    public TCP getTCPS(){
        return tcps[posicioTcps];
    }
    public void setTCPS( TCP[] pTcps){
        tcps = pTcps;
    }
    public int getPosicioTripulantCabina(){
        return posicioTripulacioCabina;
    }
    public void setPosicioTripulacioCabina( int pPosicio){
        posicioTripulacioCabina = pPosicio;
    }
    public int getPosicioTCPS(){
        return posicioTcps;
    }
    public void setPosicioTCPS(int pPosicio){
        posicioTcps = pPosicio;
    }
    public Date getDataSortida(){
        return dataSortida;
    }
    public void setDataSortida(Date pSortida){
        dataSortida = pSortida;
    }
    public Date getDataArribada(){
        return dataArribada;
    }
    public void setDataArribada(Date pArribada){
        dataArribada = pArribada;
    }
    public LocalTime getHoraSortida(){
        return horaSortida;
    }
    public void setHoraSortida(LocalTime pHoraSortida){
        horaSortida = pHoraSortida;
    }
    public LocalTime getHoraArribada(){
        return horaArribada;
    }
    public void setHoraArribada(LocalTime pHoraArribada){
        horaArribada = pHoraArribada;
    }   
    public String getDurada(){
        return durada;
    }
    public void setDurada(){
        calcularDurada();
    }


    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou vol.
    Les dades a demanar són les que necessita el constructor.
    - En el cas de les dates, li hem de demanar a l'usuari que les introdueixi
    amb el format dd-mm-yyyy. Penseu que la data introduïda per l'usuari serà
    de tipus String i nosaltres l'hem de convertir a data.
    - En el cas de les hores només haurem de demanar l'hora i minuts, els segons
    i nanosegons no els tindrem en compte.
    Retorn: El nou vol.
     */
    public static Vol nouVol() throws ParseException {
        String pCodi, dataSortida, dataArribada;
        int horaS, minS, horaA, minA;
        Date pSortida, pArribada;
        LocalTime pHoraSortida,pHoraArribada;
        System.out.println("Introdueix un codi per al vol :");
        pCodi = DADES.nextLine();
        System.out.println("Introdueix la data de Sortida (dd-mm-yyyy):");
        dataSortida = DADES.nextLine();
        pSortida = new SimpleDateFormat("dd-mm-yyyy").parse(dataSortida);
        System.out.println("Introdueix la data d'Arribada (dd-mm-yyyy)");
        dataArribada = DADES.nextLine();
        pArribada = new SimpleDateFormat("dd-mm-yyyy").parse(dataArribada);
        System.out.println("Introdueix la hora de sortida(24H): ");
        horaS = DADES.nextInt();
        System.out.println("Introdueix els minuts de sortida: ");
        minS = DADES.nextInt();
        pHoraSortida = LocalTime.of(horaS, minS);
        System.out.println("Introdueix l'hora d'arribada(24H): ");
        horaA = DADES.nextInt();
        System.out.println("Introdueix el minuts d'arribada: ");
        minA = DADES.nextInt();
        pHoraArribada = LocalTime.of(horaA, minA);
        
        Vol nouVol = new Vol( pCodi, pSortida, pArribada, pHoraSortida, pHoraArribada);
        
        return nouVol;
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte, excepte ruta, avio,
     tripulacioCabina, tcps, posicioTripulacioCabina i posicioTcps.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. Les dates les heu de mostrar amb el format
     dd-mm-yyyy, i les hores amb el format hh:mm.
     - Per demanar els nous valors de les dates i les hores, farem el mateix que
     en el mètode anterior nouVol().
     - Si es modifiquen els atributs de data o d'hora, també s'haurà de modificar
     el valor de durada mitjançant el mètode adient d'aquesta classe.
     Retorn: cap
     */
    public void modificarVol() throws ParseException {
        String pCodi, dataSortida, dataArribada;
        int horaS, minS, horaA, minA;
        Date pSortida, pArribada;
        LocalTime pHoraSortida,pHoraArribada;
        
        System.out.println("/*Dades Actuals: */");
        mostrarVol();
        System.out.println("Introdueix les noves dades per al vol:");
        System.out.println("Introdueix un codi per al vol :");
        pCodi = DADES.nextLine();
        System.out.println("Introdueix una nova data de Sortida (dd-mm-yyyy):");
        dataSortida = DADES.nextLine();
        pSortida = new SimpleDateFormat("dd-mm-yyyy").parse(dataSortida);
        System.out.println("Introdueix una nova data d'Arribada (dd-mm-yyyy)");
        dataArribada = DADES.nextLine();
        pArribada = new SimpleDateFormat("dd-mm-yyyy").parse(dataArribada);
        System.out.println("Introdueix la nova hora de sortida(24H): ");
        horaS = DADES.nextInt();
        System.out.println("Introdueix els minuts de sortida: ");
        minS = DADES.nextInt();
        pHoraSortida = LocalTime.of(horaS, minS);
        System.out.println("Introdueix la nova hora d'arribada(24H): ");
        horaA = DADES.nextInt();
        System.out.println("Introdueix el minuts d'arribada: ");
        minA = DADES.nextInt();
        pHoraArribada = LocalTime.of(horaA, minA);
        
        setCodi(pCodi);
        setDataSortida(pSortida);
        setDataArribada(pArribada);
        setHoraSortida(pHoraSortida);
        setHoraArribada(pHoraArribada);
        calcularDurada();
    }

    /*
     Paràmetres: cap
     Accions:
     - Se li assignarà a l'atribut durada el valor tenint en compte que la durada
     és la diferència de temps entre la data i hora de sortida, i la data i hora
     d'arribada.
     - La durada ha de tenir el format "X h - Y s", on X seran les hores de durada i Y els minuts
     Retorn: cap
     */
    private void calcularDurada() {
        long segS, horaS, minS, segA, horaA, minA, totalS, totalA,duradaT;
        String duradaH, duradaM;
        segS = dataSortida.getTime();
        horaS = horaSortida.getHour()*3600;
        minS = horaSortida.getMinute()*60;
        totalS = segS + horaS + minS;
        segA = dataArribada.getTime();
        horaA = horaArribada.getHour()*3600;
        minA = horaArribada.getMinute()*60;
        totalA = segA + horaA + minA;
        
        duradaT = totalS - totalA;
        duradaM = Long.toString((duradaT%3600)*60);
        duradaH = Long.toString(duradaT/3600);
        
        durada = duradaH + ":" + duradaM;

    }

    /*
     Paràmetres: tripulant de cabina
     Accions:
     - afegeix el tripulant de cabina passat per paràmetre al vector tripulacioCabina    
     en la primera posició buida del vector i actualitza la posició del vector tripulacioCabina.
     Retorn: cap
     */
    public void afegirTripulantCabina(TripulantCabina tripulantCabina) {
        tripulacioCabina[posicioTripulacioCabina] = tripulantCabina;
        posicioTripulacioCabina++;

    }

    /*
     Paràmetres: TCP
     Accions:
     - afegeix el TCP passat per paràmetre al vector tcps en la primera posició buida 
     del vector i actualitza la posició del vector tcps.
     Retorn: cap
     */
    public void afegirTCP(TCP tcp) {
        tcps[posicioTcps] = tcp;
        posicioTcps++;

    }
    
    public void mostrarVol() {
        System.out.println("\nLes dades del vol amb codi " + codi + " són:");

        System.out.println("\nRuta: ");
        switch (tipusRuta) {
            case 1:
                ((RutaNacional) ruta).mostrarRutaNacional();
                break;
            case 2:
                ((RutaInternacional) ruta).mostrarRutaInternacional();
                break;
            case 3:
                ((RutaIntercontinental) ruta).mostrarRutaIntercontinental();
                break;
            case 4:
                ((RutaTransoceanica) ruta).mostrarRutaTransoceanica();
                break;
        }

        //System.out.println("\nAvio: ");
        //avio.mostrarAvio();

        System.out.println("\nData de sortida: " + new SimpleDateFormat("dd-MM-yyyy").format(dataSortida));
        System.out.println("\nData d'arribada: " + new SimpleDateFormat("dd-MM-yyyy").format(dataArribada));
        System.out.println("\nHores de sortida: " + horaSortida.getHour() + ":" + horaSortida.getMinute());
        System.out.println("\nHores d'arribada: " + horaArribada.getHour() + ":" + horaArribada.getMinute());

        System.out.println("\nLa tripulació de cabina és:");
        for (int i = 0; i < posicioTripulacioCabina; i++) {
            tripulacioCabina[i].mostrarTripulantCabina();
        }

        System.out.println("\nLa tripulació de cabina de passatgers és:");
        for (int i = 0; i < posicioTcps; i++) {
            tcps[i].mostrarTCP();
        }

        System.out.println("\nDurada: " + durada);
    }

}
