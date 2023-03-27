package day28_TEKRAR;

public class C01 {

    String str; // Class level' daki her class uyesinin access modifier' i olur.
                // Eger access modifier gorunmuyorsa
                // Java o class uyesini default access modifier olarak isaretler.
    static String s;
    public int sayi;

    private int b;
    private static int c;

    public static int a;
    public int d;

    public static void main(String[] args) {
        int sayi = 10;
        // public int sayi2 = 20;
        // static String b;
        // bir method icerisinde public, protected, private gibi access modifier' lar
        // veya static keyword KULLANILAMAZ.
        // System.out.println(b);  // System.out.println(b); b' ye ulasamiyorum, sadece access modifier' la karar vermiyoruz staticle beraber bakıyoruz.
        System.out.println(c); // c' ye ulasabiliyorum

        //  str = "Java"; // cunku str static degil
                          // ama icinde oldugu main method static oldugu icin
        s = "Hava";
        // d =20; staticden kabul etmedi
    }

    void method1(){
        System.out.println(b); // ulasabiliyorum
        System.out.println(c); // ulasabiliyorum

        str = "Java";
        s = "Hava";
        a = 10;
        d = 20;
    }

    static void method2(){

    }

    public void method3(){

    }
}
