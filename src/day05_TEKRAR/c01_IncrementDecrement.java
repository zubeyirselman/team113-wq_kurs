package day05_TEKRAR;

public class c01_IncrementDecrement {
    public static void main(String[] args) {

        int a=20;

        //a'nin degerini 3 artirin ve yeni degerini olusturacaginiz b variable'ina atayin

        a+=3;
        int b=a;

        System.out.println("a : " + a + ", b : " + b); // a : 23, b : 23

        a=20;

        // a'nin degerini b'ye atayin sonra a'nin degerini 3 artirin.

        b=a;
        a+=3;

        System.out.println("a : " + a + ", b : " + b); // a : 23, b : 20

        System.out.println("=================");

        a=20;

        //a'nin degerini yazdirin sonra a'yi 5 artirin.

        System.out.println("a : " +a);

        a+=5;

        System.out.println("=================");

        a=20;

        //a'nin degerini 2 azaltin ve sonra a'nin degerini yazdirin

        a-=2;

        System.out.println("a : " +a);





























    }
}
