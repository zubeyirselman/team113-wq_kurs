package TakimCalismasi_03;

import java.util.Arrays;

public class C06_Array {
    public static void main(String[] args) {
        /*
            Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulup yazdiran metodu yazınız.
            (Arrays.sort kullanılmayacak)
         */

        int[] a = {2, 3, 3, 6, 5, 7, 9, 5, 4, 2, 7};

        enBuyukEnKucukOlaniBul(a);

    }

    public static int[] enBuyukEnKucukOlaniBul(int[] a) {

        int buyukSayi = a[0];
        int kucukSayi = a[0];

        for (int i = 1; i <a.length ; i++) {
            if (a[i]>buyukSayi){
                buyukSayi = a[i];
            }
            if (a[i]<kucukSayi){
                kucukSayi = a[i];
            }
        }
        System.out.println("En buyuk sayi: " + buyukSayi);
        System.out.println("En kucuk sayi: " + kucukSayi);
        int[] sonuc = {buyukSayi, kucukSayi};

        return sonuc;
    }
}
