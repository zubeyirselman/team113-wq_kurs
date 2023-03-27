package day11_TEKRAR;

public class c02_nullPointer {
    public static void main(String[] args) {

        // NULL BIR DEGER DEGILDIR.
        // null bir pointer dir.
        // yanina yazildigi non-primitive variable' a deger atanmadigini isaret eder.

        String str; // str olusturuldu ama deger atanmadi

        // Java method icerisinde deger atamadan variable olusturulmasina izin verir.
        // ama deger atamadan kullanilmasina izin vermez.

        // System.out.println(str); // CTE ==> deger atamadan kullanamazsin diyor
        //str.concat("Java"); // CTE

        // bazen programlarda variable' lar olusturulur
        // ama daha sonra deger atanacagi icin deger atamasi yapilmaz
        // deger atamasi yapilmadan listeleme bile CTE verdigi icin
        // deger verilmedigini isaretleyecek ama CTE olusmasini engelleyecek
        // bir cozum olarak NULL POINTER olusturulmustur.

        str = null;  // str="null" degil.

        System.out.println(str); // null

        // System.out.println(str.concat("Java")); // NullPointerException ==> RTE

        //System.out.println(str.length()); // NullPointerException ==> RTE

        System.out.println(str + "Java"); // nullJava

        String str2 = str + "Java";
        System.out.println(str2); // nullJava

        // int sayi = null; PRIMITIVE VARIABLE' LARA NULL DEGERI OLMAZ.
        Integer sayi = null; // olur cunku Integer non-primitive' dir.

        // biz genelde String bir ifade olusturup, sonra deger atayacaksak hiclik degeri atariz.

        String str3=""; // str3' e deger atanmistir, bu da hiclik degeridir.

        System.out.println(str3.concat("Java")); // Java

        System.out.println(str.isEmpty()); // NullPointerException ==> RTE

        System.out.println(str3.isEmpty()); // true


    }
}
