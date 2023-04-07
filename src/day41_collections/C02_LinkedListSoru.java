package day41_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {
    public static void main(String[] args) {

        // soru: Kullanicidan deger alarak 2 String liste olusturun
        // Kullanici deger girmey birakmak icin 0' a basmalidir.
        // 2 liste olustuktan sonra asagidaki gibi output hazirlayin
        //  Liste1 : .....
        //  Liste2 : .....
        //  ortak elementler : .....

        System.out.println("Once list1' i olusturalim");
        List<String> list1 = kullanicidanAlarakListOlustur();
        System.out.println("Simdi list2' yi olusturalim");
        List<String> list2 = kullanicidanAlarakListOlustur();

        System.out.println("liste1: " + list1);
        System.out.println("liste2: " + list2);
        list1.retainAll(list2);
        System.out.println("ortak elemanlar: " + list1);


    }

    public static List<String> kullanicidanAlarakListOlustur(){
        // soru: Kullanicidan deger alarak 2 String liste olusturup, main method' a dondurecek
        // Kullanici deger girmey birakmak icin 0' a basmalidir.

        List<String> isimListesi = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String isim = "";

        while (!isim.equalsIgnoreCase("0")){
            System.out.println("Listeye eklemek icin isim giriniz \n bitirmek icin 0' a basiniz");
            isim = scan.nextLine();

            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }
        }

        return isimListesi;
    }
}
