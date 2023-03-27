package day13_methodOlusturma;

public class c03_MethodOlusturmaFaktoriyelHesaplama {
    public static void main(String[] args) {

        // verdigimiz bir sayinin faktoriyelini hesaplayip,
        // sonucu bize donduren bir method olusturun

        int sonuc= faktoriyelHesapla(5);
        System.out.println(sonuc);
    }
        /*
    Method Olusturma Asamalari:
    1- public static standart (simdilik)
    2- olusturdugumuz method bize sonuc dondurecekse
        dondurecegi sonucun data turunu yaz
    3- method ismi
    4- method parantezi () icine method' a gondermemiz gereken bilgileri
        hangi variable ile gonderecegimizi yaz (parametre) (bu method icin int sayi)
    5- dondurulmesi istenen islemi yap
    6- return keyword kullanarak dondurulmesi istenen degeri dondur
         */

    public static int faktoriyelHesapla(int sayi){ // 5

         int faktoriyel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel *=i;
        }
        return faktoriyel;
    }


}
