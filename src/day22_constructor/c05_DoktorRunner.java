package day22_constructor;

public class c05_DoktorRunner {
    public static void main(String[] args) {

        c04_Doktor doktor1 = new c04_Doktor();
        doktor1.isim = "Kemal";
        doktor1.yas = 40;

        System.out.println(doktor1.soyIsim); // soyisim atanmamis
        System.out.println(doktor1.yas); // 40


        c04_Doktor doktor2 = new c04_Doktor();


        c04_Doktor doktor3;

        //System.out.println(doktor3.yas);
        // constructor calismadan bir obje olusturulup deger atanmasi mumkun degildir.
        System.out.println("variable' a atanmayan obje icin yas: " + new c04_Doktor().yas);
        // variable' a atanmayan obje icin yas: 0
    }

}
