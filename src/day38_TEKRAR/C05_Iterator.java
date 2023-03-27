package day38_TEKRAR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(7);

        // cift olan sayilari silin

        Iterator it1 = sayilar.iterator();

        while (it1.hasNext()){

            Integer sayi = (Integer) it1.next();
            if (sayi%2==0){
                it1.remove();
            }
        }
        System.out.println(sayilar); // [7]
    }
}
