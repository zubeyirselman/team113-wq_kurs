package day21_TEKRAR;

public class c04_KarelerinToplami {
    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {2,3,5};

        karelerToplami(arr);


    }

    public static void karelerToplami(int[] arr){

        int karelerToplami=0;

        for (int each: arr
             ) {
        karelerToplami +=each*each;
        }

        System.out.println("kareler toplami: " + karelerToplami);
    }

}
