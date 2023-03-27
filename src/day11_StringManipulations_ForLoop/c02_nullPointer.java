package day11_StringManipulations_ForLoop;

public class c02_nullPointer {
    public static void main(String[] args) {

        // null bir deger degildir
        // null bir pointer dir.
        // yanina yazildigi non-primitive variable' a deger atanmadigini isaret eder.

        String str; // str olusturuldu ama deger atanmadi

        // java method icerisinde deger atamadan variable olusturulmasina izin verir
        // ama deger atamadan kullanilmasina izin vermez.
        // !!!HICBIR METHOD' DA KULLANAMAYIZ. SADECE TOPLAMA İLE KULLANIP YAZDIRABILIYORUZ.!!!

        //System.out.println(str); CTE
        //str.concat("Java"); CTE

        // Bazen programlarda variable' lar olusturulur ama
        // daha sonra deger atanacagi icin deger atamasi yapilmaz
        // deger atamasi yapilmadan listeleme bile CTE verdigi icin
        // deger verilmedigini isaretleyecek, ama CTE olusmasini engelleyecek bir cozum olarak
        // NULLPOİNTER olusturulmustur.

        str = null; // str= "null" degil
        // null olarak isaretlenmistir, degeri null atanmıs degil yani.

        System.out.println(str); // null ==> bu bir deger DEGILDIR.
        //System.out.println(str.concat("Java")); // RTE, NullPointerException veriyor
        //System.out.println(str.length()); // RTE, NullPointerException veriyor

        System.out.println(str + "Java"); // nullJava

        String str2 = str + "Java" ;

        //int sayi= null; ===> primitive variable' lara null olmaz.

        Integer sayi= null; // ===> non-primitive variable' lara olur.

        // biz genelde String bir ifade olusturup, sonra deger atayacaksak hiclik degeri atariz.


        String str3= ""; // str3' e deger atanmistir.
                         // atanan deger hicliktir.

        System.out.println(str3.concat("Java")); // Java

        //System.out.println(str.isEmpty()); // NullPointerException verir.
        System.out.println(str3.isEmpty()); // true







    }
}
