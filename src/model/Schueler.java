package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schueler extends Person {

    //Referenzen
    private Tadel[] tadelDesSchuelers;

    /**
     * Ein Objekt der Klasse Schüler.
     * @param name
     * @param alter
     */
    public Schueler(String name, int alter) {
        super(name, alter);
    }


    /**
     * Ein Tadel wird der Menge der Tadel hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerTadel
     */
    private void addTadel(Tadel neuerTadel){
        if(tadelDesSchuelers == 0){
            tadelDesSchuelers = new Tadel[1];
            tadelDesSchuelers[0] = neuerTadel;
        }else{
            Tadel[] t = new Tadel[tadelDesSchuelers.length + 1];
            for(int i = 0; i < tadelDesSchuelers.length; i++)
        }
    }

    /**
     * Methode erstellt aus den Informationen zum Schüler (Name, Alter, Kurse, Tadel) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        String info = "";
        //TODO Kompakte Zeichenkette zu den Informationen eines Schülers - gut lesbar!
        return info;
    }
}
