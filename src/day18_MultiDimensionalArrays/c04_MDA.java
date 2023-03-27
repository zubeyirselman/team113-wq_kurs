package day18_MultiDimensionalArrays;

public class c04_MDA {
    public static void main(String[] args) {

        String[][] siniflar = {{"A", "B", "G", "M"},{"F", "P", "A", "V"},{"K", "D", "Q"}};

        // G' yi yazdirin
        System.out.println(siniflar[0][2]); // G

        // Q' yu Y yapin
        siniflar[2][2] = "Y";

        // ilk sinifin mevcudunu yazdirin
        System.out.println(siniflar[0].length); // 4 ilk sinifin mevcudu

        // siniflarda toplam kac kisi oldugunu yazdirin

        int toplamOgrenciSayisi=0;
        for (int i = 0; i <siniflar.length ; i++) {

            toplamOgrenciSayisi += siniflar[i].length;
        }

        System.out.println("toplam ogrenci sayisi: " + toplamOgrenciSayisi); // toplam ogrenci sayisi: 11



    }
}
