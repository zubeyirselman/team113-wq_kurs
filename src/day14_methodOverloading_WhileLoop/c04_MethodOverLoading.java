package day14_methodOverloading_WhileLoop;

public class c04_MethodOverLoading {
    public static void main(String[] args) {

        /*
        Java OverLoading Kurallari
        1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
        2- data turleri farkli olan parametrelerin yerlerini degistirirsek
            java yeni bir method olarak kabul eder. (int, double) (double, int)

        OverLoading olan class' larda java hangi methodun calistirilacagina su sekilde karar verir,
            1- cagrilan isimde method var mi?
            2- method call' da kullanilan arguments (parantez icine yazilanlar)
            method' lardaki parametrelerin %100 uyumlu oldugu var mi?
            3- argument ile parametre ayni olmasa bile
                verilen argumentleri kabul edecek parametre var mi?
            4- casting ile birden fazla methodu kullanabiliyorsa
                daha az casting ile calisacak methodu kullanir.
         */

        topla(3,5); // iki tamsayinin toplami: 8
        topla(3.4,2.3); // iki double sayinin toplami: 5.699999999999999

        // topla("ali", "veli");  CTE  bu argumentleri kabul edebilecek parametre yok

        topla('a', 'b'); // iki int dedi ve sonuc verdi ==> 195

        topla(3f,4f); // iki double 7.0

        topla(3f, 4); // double ve int 7.0


    }

    public static void topla(int a, int b){
        System.out.println("iki int tamsayinin toplami: " + (a+b));
    }

    public static void topla (double a, double b){
        System.out.println("iki double sayinin toplami: " + (a+b));
    }

    public static void topla(int sayi1, double sayi2){
        System.out.println("int ve double sayilarin toplami: " + (sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2){
        System.out.println("double ve int sayilarin toplami: " + (sayi1+sayi2));
    }
}
