package day02_dataTurleri_Scanner;

public class c02_DataTurleri {
    public static void main(String[] args) {

        char ilkHarf= 'z'; //tek tırnak olacak tek karakter olacak.

        byte ogrenciYasi1=15; //en dogru karar budur cunku hafiza kullanimini optimize etmek icin bu yeterlidir.
        short OgrenciYasi2=16;
        int OgrenciYasi3=14;
        long OgrenciYasi4=15;

        double sayi1=3.1234567890123456789;
        System.out.println(sayi1);

        //double virgulden sonra 16 hane yazdirir. ama cok kucuk sayilara indigi icin
        //ondalikli kismin sonunda hatalar olabilir.

        float sayi2=45.45367543675443f;
        //float sayi tanimladigimizda double'dan farkli oldugunu belirtmek icin sonuna f veya F yazmak
        //zorundayiz.
        System.out.println(sayi2);

        //biz dersler boyunca hafiza onemli olmadigi icin
        //tam sayilar icin 'int'
        //ondalikli sayilar icin 'double' kullaniriz.


    }
}
