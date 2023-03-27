package day04_TEKRAR;

public class c01_AsciiTable {
    public static void main(String[] args) {


        System.out.println(5 + 'a'); //102

        char ilkHarf=101;

        System.out.println(ilkHarf); //e

        //kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenChar= 'f';

        System.out.println((char)(girilenChar + 1)); //g

        // verilen bir harften 2 onceki harfi yazdirin

        girilenChar='M';
        System.out.println((char) (girilenChar - 2)); // K



    }
}
