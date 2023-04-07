package day41_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        // LinkedList 3 tane interface' i implement etmistir.
        // List, Queue, Deque interface' leri
        // dolayisiyla bu interface' lerden sonra gelen ilk concrete class oldugundan
        // Bu 3 interface' deki tum abstract method' lari override etmistir.

        // LinkedList olusturulurken secilen data turune gore
        // bu 3 interface' den birinin ozelliklerini alabilir.
        // veya data turu LinkedList secilirse, 3 interface' in ozelliklerini de toptan alir

        List<String> ll2 = new LinkedList<>();

        // daha onceden arrayList olustururken, List interface' ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan LinkedList' lerin ozelliklerini biliyoruz

        ll2.add("R"); // [R]
        ll2.add("Z"); // [R, Z]
        ll2.add(0, "A"); // [A, R, Z]
        ll2.addAll(2,ll1); // [A, R, K, T, Z]
        ll2.set(3, "M"); // [A, R, K, M, Z]
        ll2.add("K");
        ll2.add("T");
        System.out.println(ll2); // [A, R, K, M, Z, K, T]
        System.out.println(ll2.get(4)); // Z
        System.out.println(ll2.retainAll(ll1)); // true

        System.out.println(ll2);

        ll2.add("A");
        System.out.println(ll2.hashCode()); // 3232590

        // System.out.println(ll2.get(4)); exception firlatir cunku 4. index yok
        System.out.println(ll2.subList(2, 4)); // [T, A] exception firlatmaz cunku 4. index dahil degil.


    }
}
