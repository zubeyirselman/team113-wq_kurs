package day07_genelTekrar_IfStatements;

import java.util.Scanner;

public class c06_IfElseIf {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi
        30’dan buyukse obez,
        25-30 arasi ise kilolu,
        20-25 arasi ise normal,
        20’den kucukse zayif yazdirin.
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz :");
        double kilo= scan.nextDouble();
        System.out.println("Lutfen boyunuzu cm cinsinden giriniz :");
        double boy= scan.nextDouble();
        double vke= (kilo*10000)/(boy*boy);
        if (vke>=30){
            System.out.println("OBEZ");
        } else if (vke>=25 && vke<30) {
            System.out.println("KILOLU");
        } else if (vke>=20 && vke<25) {
            System.out.println("NORMAL");
        } else  {
            System.out.println("ZAYIF");
        }


    }
}
