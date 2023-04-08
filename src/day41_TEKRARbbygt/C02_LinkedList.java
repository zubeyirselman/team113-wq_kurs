package day41_TEKRARbbygt;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        /*
            List data turunde bir LinkedList olusturalim
         */

        List<String> harfler = new LinkedList<>();
        harfler.add("h");
        harfler.add("k");
        harfler.add("m");
        harfler.add("l");

        System.out.println(harfler); // [h, k, m, l]

        harfler.add("b");
        System.out.println(harfler); // [h, k, m, l, b]

        harfler.add(3, "t");
        System.out.println(harfler); // [h, k, m, t, l, b]

        harfler.set(3, "r");
        System.out.println(harfler); // [h, k, m, r, l, b]

    }
}
