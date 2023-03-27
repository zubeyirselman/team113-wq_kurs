package day22_TEKRAR;

public class c02_hemsire {

       /*
            ornegin bir hastane programinda
            hastanede calisacak hemsirelerin hangi bilgilerini tutmak istiyorsak
            hangi method' lari hemsirelerde kullanmak istiyorsak
            bir hemsire class' i olusturup
            tum bu ozellikleri ( variable ve method' lari ) o class' da olustururuz.

            programda ne zaman bir hemsireye ihtiyac olsa
            hemsire class' indan obje olustururuz.
            boylece otomatik olarak tum ozelliklere sahip olur

            eger biz istedigimiz parametrelere sahip bir constructor olusturmazsak
            java class' tan obje olusturulabilmesi icin class' a default bir constructor koyar.

            default constructor gorulmez.
            parametresi yoktur.
            constructor body' si bostur.
            gorunmeyen default constructor: c02_Hemsire (){

            }

            bizde istedigimiz parametrelere sahip
            istedigimiz kadar constructor olusturabiliriz.

            COK ONEMLİ :  Eger biz bir constructor olusturursak
            yani class' da gozle gorunen bir constructor varsa
            java default constructor' i siler.
            bizim olusturdugumuz hicbir constructor' a default constructor DENEMEZ



     */

        String isim = "isim atanmamis";
        String soyIsim = "soyisim atanmamis";
        String telNo;
        String adres;
        int yas;
        boolean izindeMi;
        char evliMi;
        int ekMesaiUcreti = 20;

    public int mesaiUcretiHesapla(int mesaiSaati){


        return mesaiSaati*ekMesaiUcreti;
    }

}
