package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class c06_get_set {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        System.out.println(sayilar.get(0)); // 3

        // son elementi yazdir.

        System.out.println(sayilar.size() - 1); // 2

        // 2 elementini 12 yapin

        System.out.println(sayilar.set(2, 12)); // 2 ==> degistirdigi eski elemani yazdirdi

        // 5' i 7 yapalim

        System.out.println(sayilar.set(1, 7)); // 7 ==> degistirdigi eski elemani yazdirdi

        System.out.println(sayilar); // [3, 7, 12] ==> sout deyince listin yeni halini yazdirdi



    }
}
