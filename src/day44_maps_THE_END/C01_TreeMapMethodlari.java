package day44_maps_THE_END;

import java.util.TreeMap;

public class C01_TreeMapMethodlari {
    public static void main(String[] args) {

        TreeMap<String,Integer> deneme = new TreeMap<>();

        deneme.put("F",20);
        deneme.put("T",30);
        deneme.put("A",10);
        deneme.put("M",25);
        deneme.put("Z",30);

        System.out.println(deneme); // {A=10, F=20, M=25, T=30, Z=30}

        System.out.println(deneme.tailMap("F")); // {F=20, M=25, T=30, Z=30}
        // varsa verilen key' den baslayip sona kadar dondurur.
        System.out.println(deneme.tailMap("C")); // {F=20, M=25, T=30, Z=30}
        // eger yoksa; C olsa nerede olurdu dedi ve aynisini yazdirdi
        System.out.println(deneme.tailMap("O")); // {T=30, Z=30}
        // O olsa nerede olurdu dedi ve ona gore dondurdu.

        System.out.println(deneme.tailMap("M", false)); // {T=30, Z=30}
        // java' da baslangic degerleri inclusive' dir. ( yani dahildir)
        // eger tail alirken, verdigimiz baslangic key' inin dahil olmasini istemiyorsak,
        // false parametresi yazariz.

        System.out.println(deneme.headMap("M")); // {A=10, F=20}
        // M' den basa dogru yazdi, M haric
        System.out.println(deneme.headMap("O")); // {A=10, F=20, M=25}
        // O olsaydi nerede olurdu dedi ve O' dan geriye dogru yazdi
        System.out.println(deneme.headMap("T",true)); // {A=10, F=20, M=25, T=30}
        // bitis degeri normalde haric olur, dahil etmek istersek true diyoruz.

        System.out.println(deneme.pollLastEntry()); // Z=30 sonuncu olan Z' yi sildi ama bize sildigi degeri dondurdu.
        System.out.println(deneme); // {A=10, F=20, M=25, T=30} Z' yi sildigi icin Z yok.

        System.out.println(deneme.pollFirstEntry()); // A=10 ilk olan A' yi sildi ama bize sildigi degeri dondurdu.
        System.out.println(deneme); // {F=20, M=25, T=30} A' yi sildigi icin A yok.

        System.out.println(deneme.higherKey("M")); // T     M' den daha yuksek olan key' i getirdi.
        System.out.println(deneme.higherKey("C")); // F     C olsaydi nerede olurdu ona gore getirdi.
        System.out.println(deneme.higherEntry("F")); // M=25 F' den daha yuksek olan ilkini degeriyle getirdi.

        System.out.println(deneme.lowerKey("M")); // F
        System.out.println(deneme.lowerKey("Z")); // T
        System.out.println(deneme.lowerEntry("K")); // F=20
        // verdigimiz key' den sonra gelen ilk key/entry' i dondurur.

        System.out.println(deneme.floorKey("M")); // M yukaridakiler buyuk/kucuk' du bu buyukEsit/kucukEsit gibi dusun.
        System.out.println(deneme.floorKey("K")); // F K olmadigi icin asagi dogru yuvarlar ve ilkini dondurur.

        System.out.println(deneme.ceilingKey("K")); // M M ve ilerisine bakip getiriyor.
        System.out.println(deneme.ceilingKey("T")); // T T ve ilerisine bakip getiriyor.

        System.out.println(deneme.descendingMap()); // {T=30, M=25, F=20} azalan hale cevirdi.
        // deneme = deneme.descendingMap(); atama yapamiyoruz

        System.out.println(deneme.subMap("K", "O")); // {M=25} K ve O olsaydi dedi ve arasinda olani dondurdu.
        System.out.println(deneme.subMap("F","O"));
        // {F=20, M=25} baslangic dahil(inclusive), bitis haric(exclusive) dondurdu.

    }
}
