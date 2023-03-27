package day24_TEKRAR;

public class C02_PassByValue {
    public static void main(String[] args) {

        double fiyat = 200;

        /*
        int fiyat = 500;
        String fiyat = "Java pass by value kullanir.";

            Java ayni method icerisinde ayni isimde birden fazla variable olusturulmasina IZIN VERMEZ.
         */

        indirimYap10(fiyat); // 180.0
        System.out.println("methodCall' dan sonra fiyat: " + fiyat);
        indirimYap25(fiyat);
        System.out.println("2. methodCall' dan sonra fiyat: " + fiyat);

        System.out.println("Return yapilan method' dan donen fiyat: " + indirimliFiyatGetir10(fiyat));
        System.out.println("3. methodCall' dan sonra fiyat: " + fiyat);

        // main method' daki fiyati kalici olarak degistirmek istersek,
        // atamayi MAIN METHOD ICERISINDE yapmaliyiz.

        fiyat = indirimliFiyatGetir10(fiyat);
        System.out.println("Main Method' da atama yapildiktan sonra fiyat: " + fiyat);

    }

    public static void indirimYap10(double fiyat) {

        fiyat = fiyat * 0.9;
        System.out.println("%10 indirimli fiyat: " + fiyat);

    }

    public static void indirimYap25(double fiyat) {

        fiyat = fiyat * 0.75;
        System.out.println("%25 indirimli fiyat: " + fiyat);

    }

    public static double indirimliFiyatGetir10(double fiyat) {

        fiyat = fiyat * 0.9;

        return fiyat;
    }
}
