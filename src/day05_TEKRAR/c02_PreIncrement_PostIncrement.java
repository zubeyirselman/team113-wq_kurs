package day05_TEKRAR;

public class c02_PreIncrement_PostIncrement {
    public static void main(String[] args) {


        //a'nin degerini 1 artirin ve yeni degerini olusturacaginiz b variable'ina atayin


        int a=20;

        /*a++;
        int b=a;*/

        int b=++a;

        System.out.println("a : " + a + ", b : " + b); // a : 21, b : 21


        // a'nin degerini b'ye atayin sonra a'nin degerini 1 artirin.

        a=20;
        /*b=a;
        a++;*/
        b=a++;



        System.out.println("a : " + a + ", b : " + b); // a : 21, b : 20


        //bu islemleri istersek tek satirda yapabiliriz.


        //a'nin degerini yazdirin sonra a'yi 1 artirin.

        a=20;
        System.out.println("a : " +a); // a: 20

        a++;
        System.out.println("=================");
        a=20;
        System.out.println("a : " + a++); // a : 20
        System.out.println("bir sonraki satirda a : " + a); // bir sonraki satirda a : 21


        //a'nin degerini 1 azaltin ve sonra a'nin degerini yazdirin

        a=20;
        System.out.println("a : " + --a); // a : 19
        System.out.println("bir sonraki satirda a : " + a); // bir sonraki satirda a : 19






    }
}
