package TakimCalismasi_03;

import java.util.Arrays;

public class C08_Array {
    public static void main(String[] args) {

        /*
            Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
            createArray(8,15) → [8,9,10,11,12,13,14,15]
         */

        System.out.println(Arrays.toString(arsindakileriYazdir(23,30)));
    }

    public static int[] arsindakileriYazdir (int baslangicDegeri, int bitisDegeri){

        int[] arr = new int[(bitisDegeri-baslangicDegeri) + 1];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = baslangicDegeri;
            baslangicDegeri++;
        }

        return arr;
    }
}
