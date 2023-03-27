package day26_localTime_varargs;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {

        topla(3,4); // [3, 4] Toplam: 7
        topla(3,4,5); // [3, 4, 5] Toplam: 12
        topla(3,4,5,6); // [3, 4, 5, 6] Toplam: 18
        topla(1,2,3,4,5,6); // [1, 2, 3, 4, 5, 6] Toplam: 21
        topla(1,2,3,5,6,8,9); // [1, 2, 3, 5, 6, 8, 9] Toplam: 34

    }

    public static void topla(int... a){

        System.out.println(Arrays.toString(a));

        int toplam = 0;
        for (int each:a
             ) {
            toplam +=each;
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

        dolayisiyla array elementlerini istedigimiz isleme uygun olarak kullanabiliriz.
     */

}
