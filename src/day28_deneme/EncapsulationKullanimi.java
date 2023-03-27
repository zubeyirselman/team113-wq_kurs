package day28_deneme;

import day28_accessModifier_Encapsulation.C03_encapsuleDatalar;

public class EncapsulationKullanimi {
    public static void main(String[] args) {

        System.out.println(C03_encapsuleDatalar.getIsim());

        C03_encapsuleDatalar obj = new C03_encapsuleDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);

        System.out.println("Toplam Satis: " + obj.getToplamSatis());

    }
}
    /*
        C03_encapsuleDatalar class' indaki isim variable' inin degeri gorulsun ama degistirilemesin
    satisTutari ise deger girilebilsin ama girilen degerler sonradan gorulemesin

        Eger bir variable icin read veya write ozelliklerinin birbirinden ayrilmasi isteniyorsa,
    ONCELIKLE access modifier ile kimsenin ulasamamasini saglayin

        Private yaparak kimsenin ulasamayacagini garantiye aldiktan SONRA,
    READ yetkisi vermek istediklerimiz icin getter(),
    WRITE yetkisi vermek istediklerimiz icin setter() olusturmaliyiz.

    */
