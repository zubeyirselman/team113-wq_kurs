package day28_deneme;

import day28_TEKRAR.C03_encapsuleDatalar;

public class accessModifierKullanimi {
    public static void main(String[] args) {

        C03_encapsuleDatalar obj = new C03_encapsuleDatalar();

        System.out.println(obj.a); // read yetkisi
        obj.a = 100; // write yetkisi

        //System.out.println(obj.satisTutari); // access modifier' i default oldugu icin read yapamiyorum
        //obj.satisTutari = 100; // access modifier' i default oldugu icin write yapamiyorum


        /*
            Baska bir class' daki variable veya method' a ulasmak istersek
                - ulasmak istedigimiz class uyesinin static olup olmamasi ERISIM YONTEMINI ETKILER.
                  STATIC ISE: classIsmi.uyeIsmi yazarken
                  STATIC DEGILSE: obje olusturup objeIsmi.uyeIsmi yazariz

                - Ulasmak istedigmiz uyenin access modifier' i ise;
                  o uyeye ulasip ulasamayacagimizi belirler.

                  Ulasabilirsek o datayi okuyabilir veya o dataya deger atayabiliriz.
         */
    }
}
