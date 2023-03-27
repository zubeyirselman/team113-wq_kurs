package day09_Switch_StringManipulation;

public class c06_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(0));

        // bastan 6. harfi yazdirin

        System.out.println(str.charAt(5));

        // sondan 2. harfi yazdirin

        System.out.println(str.charAt(11 - 2)); // i

        // son harfi yazdirin

        System.out.println(str.charAt(11-1)); // r

        //System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException

        //System.out.println(str.charAt(15)); // StringIndexOutOfBoundsException

        /*
        javada 2 turlu hata ile karsilasabiliriz:
        1- syntax olarak hatali yazilan kodlari compile ederken anlar ve altini kırmızı cizer
            str = 23; String bir variable' a int bir deger atanamayacagini bilir ve altini kirmizi cizer.
            CompileTimeError (CTE) diyoruz
        2- bazende syntax de hata olmaz
            java sorunu calismaya basladiktan sonra farkeder
            str.charAt(15) : burada verilen str' dan bir karakter isteniyor
            compile time' da str' in uzunlugunu java anlamaz
            ama calisinca 15.index' in olmadigini farkeder ve exception firlatir
            RunTimeError (RTE) deriz.
         */




    }
}
