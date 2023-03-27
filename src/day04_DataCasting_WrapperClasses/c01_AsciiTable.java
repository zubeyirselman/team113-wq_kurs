package day04_DataCasting_WrapperClasses;

public class c01_AsciiTable {
    public static void main(String[] args) {

        //Char data turundeki variable ve degerler
        //sayisal data turlerine atanirsa veya
        //sayisal data turundeki datalarla isleme sokulursa
        //ASCII Table' daki degerleri ile isleme girer.

        System.out.println(5 + 'a'); // 5 + 97 = 102

        char ilkHarf= 101;

        System.out.println(ilkHarf); // e

        //kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenChar= 'f';

        System.out.println(girilenChar + 1);  //102 + 1 =103
        // biz 103'u degil, 103'un karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapariz.

        System.out.println((char)(girilenChar+1));

        // verilen bir harften 2 onceki harfi yazdirin

        girilenChar='M';
        System.out.println((char)(girilenChar-2));











    }
}
