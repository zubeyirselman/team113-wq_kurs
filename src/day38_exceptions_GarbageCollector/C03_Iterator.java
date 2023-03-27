package day38_exceptions_GarbageCollector;

import java.util.Arrays;

public class C03_Iterator {
    public static void main(String[] args) {

        int [] arr = {3,8,1,9,15};

        // tum elementleri yazdirin

        for (int each:arr
             ) {
            System.out.print(each + "    "); // 3    8    1    9    15
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +"      "); // 3      8      1      9      15
        }


        // Index kullanmadan tum elementleri 3 artirip kaydedin
        // Index istenmedigi icin normal loop kullanamayiz
        // for-each deneyelim

        System.out.println("");
        for (int each:arr
             ) {

            each = each +3;
            System.out.print(each + "    "); // 6    11    4    12    18

        }
        System.out.println("");
        System.out.println(Arrays.toString(arr)); // [3, 8, 1, 9, 15] array degismedi
    }
}
