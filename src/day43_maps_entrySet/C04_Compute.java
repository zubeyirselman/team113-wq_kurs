package day43_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {
    public static void main(String[] args) {

        Map<String, Integer> ornekMap = new TreeMap<>();

        ornekMap.put("A", 20);
        ornekMap.put("B", 15);
        ornekMap.put("K", 25);
        ornekMap.put("M", 20);
        ornekMap.put("T", 30);

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=20, T=30}

        // eger map' de A varsa degerini 40 yapin

        // ornekMap.put("A",40); // varsa update eder yoksa ekler

        ornekMap.computeIfPresent("A", (k, v) -> v = 40);
        System.out.println(ornekMap); // {A=40, B=15, K=25, M=20, T=30}

        // map' de B yoksa B' yi deger olarak 50 ile ekle

        ornekMap.putIfAbsent("B", 50); // bununla da olur
        ornekMap.computeIfAbsent("B", v -> 50); // bununla da olur
        System.out.println(ornekMap); // {A=40, B=15, K=25, M=20, T=30}
        // B' nin degeri degismedi cunku biz YOKSA ekle dedik

        // map' de K varsa degerini 2 katina cikar

        ornekMap.computeIfPresent("K", (a, b) -> b * 2); // (k,v) demek zorunda degiliz.
        System.out.println(ornekMap); // {A=40, B=15, K=50, M=20, T=30}

        // eger T varsa degerini 10 azalt

        ornekMap.computeIfPresent("T", (k, v) -> v - 10);
        System.out.println(ornekMap); // {A=40, B=15, K=50, M=20, T=20}

        // eger C yoksa degeri 30 olarak ekle

        ornekMap.computeIfAbsent("C", v -> 30);
        System.out.println(ornekMap); // {A=40, B=15, C=30, K=50, M=20, T=20}

    }
}
