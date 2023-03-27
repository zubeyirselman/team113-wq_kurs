package day27_TEKRAR;

public class C04_StringBuilderdaStringMethodlari {
    public static void main(String[] args) {

        /*
            StringBuilder Class' inda olmayip String Class' inda olan methodlari kullanmak istersek
            sb.toString() kullanarak StringBuilder' i once stringe cevirir
            sonra istedigimiz String method' larini kullaniriz.

            Burada dikkat etmemiz gereken konu
            String donduren methodlar
            veya String Class' indan kullanacagimiz methodlar
            KALICI DEGISIKLIK YAPMAZ.
         */

        StringBuilder sb1 = new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("Java candir");

        sb1.substring(5);
        System.out.println(sb1); // Java Candir

        // sb1 = sb1.substring(5);

        System.out.println(sb1.compareTo(sb2));
        // -32 ==> acii degerlerin farki; ascii' de buyuk harfle kucuk harf arasinda 32 fark vardir.

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3,6);
        System.out.println(sb1); // Java Candir

    }
}
