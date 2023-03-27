package day15_doWhileLoop_Scope;

public class c05_LocaleVariable {
    public static void main(String[] args) {

        /*
            1- bir method icerisinde olusturulan variable' in scope' u o method' dur.
                baska bir method' dan kullanilamaz.
                bu variable' lara LOCALE VARİABLE denir.
            2- her ne kadar bir method icinde olsalar da
                loop' larin da ayri bir scope' u vardir
                loop icerisinde olusturulan variable' lar
                loop dısında kullanilamazlar.
         */

        String isim= "Ali Can";

        //sayi++;

        for (int i = 0; i <10 ; i++) {
            int j=i+1;
        }

        //System.out.println(i);
        //System.out.println(j);

    }

    public static void baskaMethod(){

        //System.out.println(isim);
        int sayi=5;
    }
}
