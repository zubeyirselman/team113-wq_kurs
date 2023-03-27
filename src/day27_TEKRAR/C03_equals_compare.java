package day27_TEKRAR;

public class C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";
        //System.out.println(sb1==str); CTE
        // Javada farkli data turune sahip nonPrimitive objeler == ile KARSILASTIRILAMAZ.

        System.out.println(sb1==sb2); // false
        System.out.println(sb1==sb1); // true

        System.out.println(sb1.equals(sb2)); // false

        /*
            StringBuilder' da icerik ayni olsa bile equals methodu false doner.
            cunku StringBuilder class' inda equals methodu yoktur.
            equals methodunu parent class' i olan Object Class' indan kullanir.
            ve bundan dolayi iceriklere bakmadan reddeder false verir.
         */

        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1)); // true

        // 2 StringBuilder' in iceriklerinin ayni oldugunu kontrol etmek icin
        // compareTo() methodu kullanilir.

        System.out.println(sb1.compareTo(sb2)); // 0
        // System.out.println(sb1.compareTo(str)); // CTE

        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // 2
        System.out.println(sb3.compareTo(sb4)); // 4
        System.out.println(sb4.compareTo(sb3)); // -4

        /*
            CompareTo() methodu karsilastirilan StringBuilder' lar ayni metne sahipse 0 doner.
            ayni degilse, bastan itibaren kontrole naslar
            farkli olan ILK HARFIN karsilastirilan kelimedeki ayni indexteki harften
            kac harf ilerde oldugunu dondurur.
         */

    }
}