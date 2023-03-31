package TakimCalismasi_03;

public class C05_Array {
    public static void main(String[] args) {

        /*
            Örnek 3: Array’in içerisindeki tüm 7 sayılarının toplamını veren metodu yazınız.
            [2,3,3,6,5,4,3] →9

         */

        int[] a = {2, 3, 3, 6, 5, 7, 7, 5, 4, 2, 7, 1};

        System.out.println(verileniTopla(a)); // 21

    }

    public static int verileniTopla(int[] a) {

        int toplam7 = 0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==7){
                toplam7 += a[i];
            }
        }

        return toplam7;
    }
}
