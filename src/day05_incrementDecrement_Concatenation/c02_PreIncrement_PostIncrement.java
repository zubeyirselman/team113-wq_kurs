package day05_incrementDecrement_Concatenation;

public class c02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        /* eger sayinin degeri SADECE  1 artacak veya azalacaksa
        artirip sonra yazdirma/atama
        yazdirip sonra artirma/atama islemlerini tek satirda yapabiliriz.
         */


        //a'nin degerini 1 artirin ve yeni degerini olusturacaginiz b variable' ina atayin

        int a=20;

        int b=++a; // once artirir sonra atama yapar.

        System.out.println("a : " + a + ", " + "b : " + b); // a : 21, b : 21



        //a'nin degerini yazdirin, sonra a'yi 1 artirin

        a=20;
        System.out.println("a : " + a); // a :20
        a++;

        a=20;
        System.out.println("a : " +a++);
        System.out.println("bir sonraki satirda a : " + a );

        // a'nin degerini 1 azaltin ve sonra a'nin degerini yazdirin

        a=20;
        System.out.println(--a);
        System.out.println("bir sonraki satirda a : " + a );


    }
}
