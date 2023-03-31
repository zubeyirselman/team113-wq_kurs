package TakimCalismasi_03;

public class C04_Array {
    public static void main(String[] args) {

        // Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

        int[] arr = {3,5,4,8,10,7,9};

        System.out.println(ciftSayilariTopla(arr)); //
    }

    public static int ciftSayilariTopla(int[] arr){

        int ciftToplam = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==0){
                ciftToplam += arr[i];
            }
        }

        return ciftToplam;
    }

}
