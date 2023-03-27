package day38_exceptions_GarbageCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_ListIterator {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(7);


        // tum elementleri index kullanmadan 3 artirin

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){

            Integer sayi = (Integer) lit.next();

            lit.set(sayi+3);
        }

        System.out.println(sayilar); //[9, 15, 17, 7, 10]
    }
}
