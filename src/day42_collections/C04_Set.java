package day42_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {

        Set<Integer> sayilar = new HashSet<>();

        sayilar.add(12);
        sayilar.add(15);

        Set<Integer> siraliSet = new TreeSet<>();

        siraliSet.add(23);
        siraliSet.add(34);
        siraliSet.addAll(sayilar);

        System.out.println(siraliSet); // [12, 15, 23, 34] ==> otomatik siraladi

        // bir hashset ve bir tree set olusturalim
        // ikisine de random 1000 tane sayi ekleyip
        // islem surelerini kiyaslayalim

        Random rnd = new Random();
        int sayi;

        LocalTime hashBaslangic = LocalTime.now();
        for (int i = 0; i <8000 ; i++) {

            sayi = rnd.nextInt(100000);
            sayilar.add(sayi);

        }
        LocalTime hashBitis = LocalTime.now();



        LocalTime treeBaslangic = LocalTime.now();
        for (int i = 0; i <8000 ; i++) {

            sayi = rnd.nextInt(100000);
            siraliSet.add(sayi);

        }
        LocalTime treeBitis = LocalTime.now();

        System.out.println("HashSet baslangic: " + hashBaslangic + "Bitis: " + hashBitis);
        System.out.println("treeSet baslangic: " + hashBaslangic + "Bitis: " + hashBitis);

        System.out.println("Hash suresi: " + (hashBitis.getNano() - hashBaslangic.getNano()));
        System.out.println("tree suresi: " + (treeBitis.getNano() - treeBaslangic.getNano()));

    }
}
