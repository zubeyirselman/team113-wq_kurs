package day43_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C05_HashMapMethodlari {
    public static void main(String[] args) {

        Map<String, Integer> ornekMap = new TreeMap<>();

        ornekMap.put("A", 20);
        ornekMap.put("B", 15);
        ornekMap.put("K", 25);
        ornekMap.put("M", 20);
        ornekMap.put("T", 30);

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=20, T=30}

        System.out.println(ornekMap.get("K")); // 25
        System.out.println(ornekMap.get("Z")); // null
        // verilen key varsa value' sunu dondurur, yoksa null dondurur.

        System.out.println(ornekMap.getOrDefault("M", 60)); // 20
        // M' nin value' sunu yazdir, bulamazsan deger olarak 60 yazdir.
        System.out.println(ornekMap.getOrDefault("Z", 60)); // 60
        // Z' nin value' sunu yazdir, bulamazsan deger olarak 60 yazdir.

        System.out.println(ornekMap.replace("M", 50)); // method bana belki lazim olur diye, 20 olan eski degerini dondurdu
        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=30} aslinda 50 degerini atadi

        System.out.println(ornekMap.replace("T", 30, 90)); // true
        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=90}
        // true dondurdu ve 90 degeri ile degistirdi cunku; verilen deger (yani 30) T' nin degeriydi.

        System.out.println(ornekMap.replace("B", 30, 90)); // false dondurdu ve,
        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=90} degistirme islemini yapmadi
                                                                      // cunku B' nin eski degeri 30 degil!


    }
}
