package day20_TEKRAR;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        // uzun bir listeyi java' da list olarak kaydetmek istersek
        // tek tek eklemek istemezseniz
        // pratik olarak bir array olusturup
        // loop ile tum elementleri list' e ekleyebiliriz

        int[]  arr = {3,4,5,6,7,8,1,2,3,4,5,4,3,2,2,4};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
        // [3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 4, 3, 2, 2, 4]

        // listede eleman olarak 3 var mi?

        System.out.println(sayilar.contains(3)); // true
        System.out.println(sayilar.contains(-1)); // false

    }
}
