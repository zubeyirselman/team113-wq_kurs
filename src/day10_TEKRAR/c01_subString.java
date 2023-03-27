package day10_TEKRAR;

public class c01_subString {
    public static void main(String[] args) {


        // substring iki farkli sekilde kullanilabilir
        // 1- tek parametre olursa, o indexten baslar sonuna kadar yazdirir.

        String str= "Java ne kadar guzel";

        System.out.println(str.substring(8)); // k

        System.out.println(str.substring(0)); // Java ne kadar guzel

        System.out.println(str.substring(str.length() - 3)); // zel

        System.out.println(str.substring(str.length())); // hiclik

        // 2- 2 parametre girilirse baslangic indexinden (dahil) baslar
        // bitis indexine (haric) kadar olan bbolumu yazdirir.

        System.out.println(str.substring(5, 7)); // ne

        System.out.println(str.substring(3, 4)); // a

        System.out.println(str.substring(0,1)); // J

        // str' in 5.indexteki karakteri yazdirin

        System.out.println(str.substring(5, 6)); // n

        System.out.println(str.substring(2,2)); // hiclik

        System.out.println(str.substring(5, 1)); // Run Time Error




    }
}
