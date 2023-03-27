package day26_TEKRAR;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {

        topla(3,4); // [3, 4] Toplam: 7
        topla(2,3,4,5); // [2, 3, 4, 5] Toplam: 14
        topla(2,3,5,7,6,3,4); // [2, 3, 5, 7, 6, 3, 4] Toplam: 30
        topla(3,4,6,2,1,7,9,7,5,4); // [3, 4, 6, 2, 1, 7, 9, 7, 5, 4] Toplam: 48

    }

    public static void topla(int... a){

        System.out.println(Arrays.toString(a));

        int toplam = 0;
        for (int each :a
             ) {
            toplam += each;
        }
        System.out.println("Toplam: " + toplam);
    }

     /*
        java' da bir method,
        parametrelerine uygun argumente sahip methodCall oldugunda calisir.

        Ornegin 2 int parametre varsa
        sadece 2 int argument ile methodCall yapildiginda calisir.

        Java ayni data turune sahip olmak sartiyla
        parametre sayisini esnek tutabilmek icin Varargs olusturmustur.

        Varargs bir ARRAY' dir.

        dolayisiyla array elementlerini,
        istedigimiz isleme uygun olarak kullanabiliriz.
     */

}
