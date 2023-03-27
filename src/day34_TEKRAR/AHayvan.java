package day34_TEKRAR;

public abstract class AHayvan {

    /*
        Bir class' i abstract class yapmak icin deklerasyona
        abstract keyword' unu yazmak yeterlidir.

        Abstract class' lar class olduklari icin constructorlari vardir.
        Ama abstract class' lardan obje olusturulamaz.

        Abstract class' larda bugune kadar kullandigimiz yapida
        methodlar olusturabiliriz.
        Ancak bunlar child class' lar tarafindan uyarlanmak(override) zorunda olmaz.

        child class' lari uyarlamaya mecbur etmek istedigimiz methodlari da
        abstract yapmaliyiz.

        Bir methodu abstract yapmak icin
        yine deklerasyonla abstract yazmamiz yeterlidir.

     */

    public abstract void hareket();

    public abstract void solunum();

    public abstract void beslenme();

    public abstract void cogalma();

    public abstract void omur();
}
