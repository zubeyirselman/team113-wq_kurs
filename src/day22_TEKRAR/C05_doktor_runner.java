package day22_TEKRAR;

import day22_constructor.c04_Doktor;

public class C05_doktor_runner {
    public static void main(String[] args) {

        C04_doktor doktor1 = new C04_doktor();
        doktor1.isim = "Kemal";
        doktor1.yas = 40;

        System.out.println(doktor1.soyIsim); // soyIsim atanmamis
        System.out.println(doktor1.yas); // 40

        C04_doktor doktor2 =new C04_doktor();

        C04_doktor doktor3;
        //System.out.println(doktor3.yas);
        // constructor calismadan bir obje olusturulup deger atanmasi mumkun degildir.

        System.out.println("variable' a atanmayan obje icin yas: " + new c04_Doktor().yas);
        // variable' a atanmayan obje icin yas: 0


    }
}
