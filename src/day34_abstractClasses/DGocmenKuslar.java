package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar{

    /*
        Sadece ayrimi belirtmek icin abstract olmayan class' lara;
        CONCRETE Class denir.

        1- abstract bir class
        parenti olan abstract class' daki
        abstract method' lari Implement etmek
        ZORUNDA DEGILDIR.

        Isterse implement edip concrete hale getirir
        isterse yok sayar.

        2- abstract bir silsileden gelen
        ilk concrete class
        parent veya grandParent(s) olan abstract class' larda
        concrete yapilmayan tum abstract class' lari
        implement etmek ZORUNDADIR.

     */

    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
