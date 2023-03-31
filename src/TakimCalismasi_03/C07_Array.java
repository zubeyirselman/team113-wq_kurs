package TakimCalismasi_03;

import java.util.Arrays;

public class C07_Array {
    public static void main(String[] args) {

        /*
            Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.
            (Arrays.sort ve Arrays.fill kullanılmayacak)
         */

        int[] arr = {2,3,32,33,42,5};
        enKucuguAta(arr);
    }

    public static void enKucuguAta(int[] arr){
        int enKucukSayi = arr[0];
        int[] yeniArr = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<enKucukSayi){
                enKucukSayi = arr[i];
            }
        }
        for (int i = 0; i <yeniArr.length ; i++) {
            yeniArr[i] = enKucukSayi;
        }
        arr = yeniArr;
        System.out.println(Arrays.toString(arr));
    }
}
