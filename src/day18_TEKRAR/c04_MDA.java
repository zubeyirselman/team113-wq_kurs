package day18_TEKRAR;

public class c04_MDA {
    public static void main(String[] args) {

        String[][] siniflar = {{"A", "B", "G", "M"},{"F", "P", "A", "V"},{"K", "D", "Q"}};

        // G' yi yazdirin
        System.out.println(siniflar[0][2]); // G

        // Q' yu Y yapin
        siniflar[2][2]= "Y"; // Y

        // ilk sinifin mevcudunu yazdirin
        System.out.println(siniflar[0].length); // 4

        // siniflarda toplam kac kisi oldugunu yazdirin
        int sinifMevcuduToplami = 0;
        for (int i = 0; i <siniflar.length ; i++) {

            sinifMevcuduToplami += siniflar[i].length;
        }

        System.out.println("siniflardaki toplam kisi sayisi: " + sinifMevcuduToplami);
        // siniflardaki toplam kisi sayisi: 11



    }
}
