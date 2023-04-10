
package day44_maps_THE_END;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C02_DataTuruOlarakObjectKullanma {
    public static void main(String[] args) {

        List<Object> sayilar = new ArrayList<>();

        sayilar.add(4);
        sayilar.add('d');
        sayilar.add("Java");
        sayilar.add(true);
        sayilar.add(4.2);

        int[] a = {3,4,5};
        sayilar.add(a);

        System.out.println(sayilar); // [4, d, Java, true, 4.2, [I@3b6eb2ec]

        System.out.println(Arrays.toString((int[]) sayilar.get(5))); // [3, 4, 5] cast yapinca yazdirdi.

        System.out.println(7 + 6.5); // 13.5

        System.out.println((Integer) sayilar.get(0) + (Double)sayilar.get(4)); // 8.2

        /*
            Biz nestedMap yaptigimizda erisim kolay olur ama bu tur casting problemleriyle karsilasabiliriz.
         */


    }
}
