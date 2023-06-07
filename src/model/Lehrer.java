package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Lehrer extends Person{

    //Attribute
    private String besoldungsGruppe;

    private Unterrichtsfach[] faecherDesLehrers;


    /**
     * Ein Objekt der Klasse Lehrer wird erstellt.
     * @param name
     * @param alter
     * @param besoldungsGruppe    Gehaltsstufen von Lehrern
     */
    public Lehrer(String name, int alter, String besoldungsGruppe) {
        super(name, alter);
        this.besoldungsGruppe = besoldungsGruppe;
    }

    public String getBesoldungsGruppe() {
        return besoldungsGruppe;
    }

    public void setBesoldungsGruppe(String besoldungsGruppe) {
        this.besoldungsGruppe = besoldungsGruppe;
    }



    /**
     * Ein Fach wird der Menge der unterrichtenden Fächer hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuesFach
     */
    public void addFach(Unterrichtsfach neuesFach){
        if(faecherDesLehrers == null) {
            faecherDesLehrers = new Unterrichtsfach[1];
            faecherDesLehrers[0] = neuesFach;
        }else{
            Unterrichtsfach[] biologie = new Unterrichtsfach[faecherDesLehrers.length + 1];
            for(int i = 0; i < faecherDesLehrers.length; i++){
                faecherDesLehrers = biologie;
            }
        }
    }

    /**
     * Methode erstellt aus den Informationen zum Lehrer (Name, Alter, Besoldungsgruppe, Kurse, Fächer) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        String info = "";
        //TODO Kompakte Zeichenkette zu den Informationen einer Lehrkraft - gut lesbar!
        return info;
    }
}
