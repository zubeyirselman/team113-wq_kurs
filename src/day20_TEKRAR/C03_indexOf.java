package day20_TEKRAR;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");

        System.out.println(isimler); // [Kubra, Mustafa, Emre, Ferhat, Erdal]

        // 2. indexteki elementi yazdirin

        System.out.println(isimler.get(2)); // Emre

        // ferhat' in indexini yazdirin

        System.out.println(isimler.indexOf("Ferhat")); // 3

        System.out.println(isimler.lastIndexOf("Ferhat")); // 3

        System.out.println(isimler.indexOf("Hilal")); // -1

        isimler.add("Mustafa");
        System.out.println(isimler); // [Kubra, Mustafa, Emre, Ferhat, Erdal, Mustafa]

        System.out.println(isimler.indexOf("Mustafa")); // 1
        System.out.println(isimler.lastIndexOf("Mustafa")); // 5

    }
}
