package day21_TEKRAR;

public class c02_ForEachLoop {
    public static void main(String[] args) {

        /*   each: herbir demek

            Bizden istenen gorevde siralama onemsiz ise asil amaclanan tum elementleri elden gecirmek ise
            forLoop yerine ==> forEachLoop tercih edilir.

            forEachLoop' da ;
                -index yok
                -baslangic degeri yok
                -bitis degeri yok

         */


        int[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        // array' in tum elementlerinin toplamini yazdirin

        int toplam = 0;

        for (int each: arr
             ) {
            toplam += each;
        }

        System.out.println(toplam);

        // array' in elementlerinden 3 ile bolunebilenleri yazdirin

        for (int each: arr
             ) {
            if (each%3==0){
                System.out.print(each + " ");
            }
        }
        System.out.println();
        // array' in elementleri icinde kac tane tek sayi oldugunu bulun

        int sayac = 0;
        for (int each: arr
             ) {
            if (each%2!=0){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
