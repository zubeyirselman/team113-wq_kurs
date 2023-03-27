
package day21_TEKRAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        List<Integer> benzersizlerListesi = new ArrayList<>();

        for (int each: arr
             ) {
            if (!benzersizlerListesi.contains(each)){
                benzersizlerListesi.add(each);
            }
        }

        System.out.println(benzersizlerListesi);
        arr = new int[benzersizlerListesi.size()];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= benzersizlerListesi.get(i);
        }
        System.out.println(Arrays.toString(arr));


    }
}
