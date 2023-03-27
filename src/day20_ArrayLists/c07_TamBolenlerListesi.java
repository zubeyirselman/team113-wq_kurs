package day20_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c07_TamBolenlerListesi {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan main method' da pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif bolenleri bulunacak pozitif bir tamsayi igirniz: ");
        int girilenSayi = scan.nextInt();

        System.out.println(pozitifBolenleriListele(girilenSayi));
        //[1, 2, 5, 10, 25, 50]


    }

    public static List<Integer> pozitifBolenleriListele(int verilenSayi){

        List<Integer> pozitfBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=verilenSayi ; i++) {

            if (verilenSayi % i == 0){
                pozitfBolenlerListesi.add(i);
            }
        }

        return pozitfBolenlerListesi;
    }

}
