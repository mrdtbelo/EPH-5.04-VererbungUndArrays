package model;

public class Person {

    private String name;
    private int alter;

    private Kurs[] kurseDerPerson;

    public Person(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * Sobald das Array erweitert wurde, muss dem Kurs noch mitgeteilt werden, dass dieser Lehrer den Kurs übernimmt.
     * @param neuerKurs
     */
    public void addKurs(int[] array, Kurs neuerKurs){
        int[] newArray = new int[array.length+1];
        newArray = array;
        //array[array.length-1] = neuerKurs;
       //

    }
}
