package day03_scanner_dataCasting_;

public class c05_DataCasting {
    public static void main(String[] args) {

        /*bazi primitive data turleri baska hic bir data turunden deger kabul etmez.
        bazi primitive data turleri ozel sartlar ile baska turdeki datalari deger olarak kabul eder.
         */


        boolean bl= false;
        bl= true;

        //bl="true";
        //bl=20;
        //bl='a';

        char ch= 't';
        ch='%';
        ch=' ';
        ch=99;

        int sayi1=20;

        short sayi2=15;

        double sayi3=24;

        sayi1=sayi2;
        //sayi1=sayi3;

        //sayi2=sayi1;
        //sayi2=sayi3;

        sayi3=sayi1;
        sayi3=sayi2;

        sayi1=ch;
        //sayi2=ch;
        sayi3=ch;


    }
}
