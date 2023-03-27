package day11_TEKRAR;

public class c07_replace {
    public static void main(String[] args) {

        /*
        Soru 4 : Kullanicidan bir sifre isteyip,
        asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        kontrol1- ilk harf kucuk harf olmali
        kontrol2- son karakter rakam olmali
        kontrol3- sifre bosluk icermemeli
        kontrol4- uzunlugu en az 10 karakter olmali
         */


        // soruyu if-else ile yaparsak sadece 1 hata yazdirir otekilere bakmaz.
        // o zaman bagimsiz 4 if cumlesi yapmaliyim
        // en sonda 4 sarti da sagladigini kontrol eden bir variable kullanacagiz.
        // buna genelde 'bayrak' diyoruz. (flag)


        int flag=0;
        String sifre= "a2luwf8fhıfm67123";

        // kontrol1- ilk harf kucuk harf olmali

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            flag++;
        } else {
            System.out.println("ilk harf kucuk harf olmali");
        }

        // kontrol2- son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1);

        if (sonHarf>='0' && sonHarf<='9'){
            flag++;
        } else {
            System.out.println("son karakter rakam olmali");
        }

        // kontrol3- sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        } else {
            flag++;
        }

        // kontrol4- uzunlugu en az 10 karakter olmali

        if (sifre.length()>=10){
            flag++;
        }else {
            System.out.println("uzunlugu en az 10 karakter olmali");
        }

        // eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin

        if (flag==4){
            System.out.println("sifre basariyla kaydedildi");
        } else {
            System.out.println("Basarisiz sifre, Lutfen tekrar deneyiniz!");
        }


    }
}
