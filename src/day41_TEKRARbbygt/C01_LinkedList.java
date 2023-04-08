package day41_TEKRARbbygt;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
            Collections objeleri bir arada tutan yapilardir.
            Günlük hayatta karsilasilan durumlarla ilgili olusan ihtiyaclara gore farkli collections yapilari vardir.
            Bir uygulamada hangi collection' i kullancagimiza ozelligine gore biz karar veiririz.

            3 ana Collection' dan bahsedebiliriz:
                1- List
                2- Queue
                3- Set
                3 interface ile kurallar belirleniyor.

            interface' lerden obje olusturamadigimiz icin childclass' lardan constructor' larini kullanir.
            Ozellikleri data turu olarak belirledigimiz Collection' lar belirler.
         */

        LinkedList<String> linked1 = new LinkedList<>();
        List<String> linked2 = new LinkedList<>();
        Queue<String> linked3 = new LinkedList<>();
        Deque<String> linked4 = new LinkedList<>();
    }
}
