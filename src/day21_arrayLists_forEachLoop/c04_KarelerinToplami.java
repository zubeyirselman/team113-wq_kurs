package day21_arrayLists_forEachLoop;

public class c04_KarelerinToplami {
    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {2,3,5};

        karelerToplaminiYazdir(arr); // verilen array' deki elementlerin kareleri toplami: 38



    }

    public static void karelerToplaminiYazdir(int[] arr){

        int karelerToplami = 0;

        for (int each: arr
             ) {

            karelerToplami += each*each;

        }

        System.out.println("verilen array' deki elementlerin kareleri toplami: " + karelerToplami);

    }


}
