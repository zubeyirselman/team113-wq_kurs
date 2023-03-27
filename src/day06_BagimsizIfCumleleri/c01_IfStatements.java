package day06_BagimsizIfCumleleri;

public class c01_IfStatements {
    public static void main(String[] args) {
        /*
        Buradaki sartlar biribirinden bagimsizdir.
        uygun sayilar olursa 3 if body'si de calisabilir.
        bazen de hicbir if body'si devreye girmeyebilir.
        asagidaki kod, konsolda hicbirsey yazmamasina ragmen calismistir. cunku degerler sartlari saglamamistir.
         */

        int a=13;
        int b=55;

        if (a>b){
            System.out.println("a b'den buyuk");
        }
        if (a%2==0){
            System.out.println("a cift sayidir");
        }
        if (b>100){
            System.out.println("b 100'den buyuktur");
        }

        boolean sonuc= a*7>b;
        /*
        bazen if statement' da direk boolean bir deger sart olarak yazilabilir.
        bu durumda boolean variable degeri true ise if body calisir,
        false ise if body calismaz.
         */

        if (sonuc){
            System.out.println("istenen sart sagandi");
        }













    }
}
