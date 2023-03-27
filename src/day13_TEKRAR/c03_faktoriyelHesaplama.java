package day13_TEKRAR;

public class c03_faktoriyelHesaplama {
    public static void main(String[] args) {

        // verdigimiz bir sayinin faktoriyelini hesaplayip,
        // sonucu bize donduren bir method olusturun


        int sonuc= faktoriyelHesaplama(15);
        System.out.println(sonuc);
    }

    public static int faktoriyelHesaplama(int sayi) {

        int faktoriyel = 1;

        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;

        }
        return faktoriyel;

    }

}
