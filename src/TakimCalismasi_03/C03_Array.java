package TakimCalismasi_03;

public class C03_Array {
    public static void main(String[] args) {

        // Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız.

        int[] arr = {3,5,7,9};

        System.out.println(elemanlariToplama(arr)); // 24
    }

    public static int elemanlariToplama(int[] arr){
        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }

       return toplam;
    }
}
