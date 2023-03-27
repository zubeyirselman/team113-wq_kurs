package day03_scanner_dataCasting_;

import java.util.Scanner;

public class c02_Scanner {
    public static void main(String[] args) {

        /*Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        Girilen bilgiler : J Doe, 44
         */

        Scanner scan= new Scanner(System.in);

        //isterseniz tek bir aciklamayla 3 bilgiyi de alabilirsiniz.

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz " +
                            "\n Her bilgiden sonra ENTER'e basiniz");

        char isimIlkHarf= scan.nextLine().charAt(0);

                /* scanner method'larinda nextchar yok.
                bunun icin once kullanicinin girisine gore next() veya nextline() yazip sonra
                .charAt(0) yazariz. parantez icindeki '0' almak istedigimiz char'in indexidir.
                java da index '0' ' dan baslar.
                 */

        String soyisim= scan.nextLine();
        double yas= scan.nextDouble();

        System.out.println("Girilen bilgiler : " + isimIlkHarf + " " + soyisim + ", " + yas);





    }
}
