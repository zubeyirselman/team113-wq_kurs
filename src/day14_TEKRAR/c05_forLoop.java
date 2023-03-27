package day14_TEKRAR;

public class c05_forLoop {
    public static void main(String[] args) {

        // 50 ve 100 arasindaki (sinirlar dahil)
        // sayilari toplayin

        int toplam=0;
        for (int i = 50; i <=100 ; i++) {
            toplam+= i;
        }
        System.out.println(toplam); // 3825


        // ayni soruyu whileLoop la yapalim
        // for loop da 3 seyi takip ederiz
        // 1- baslangic degeri
        // 2- bitis sarti
        // 3- artis veya azalis sekli

        toplam= 0;
        int sayi=50;
        while (sayi<=100){
            toplam+=sayi;
            sayi++;
        }
        System.out.println(toplam); // 3825
    }
}
