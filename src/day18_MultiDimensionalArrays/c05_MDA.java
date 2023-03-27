package day18_MultiDimensionalArrays;

public class c05_MDA {
    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // toplam element sayisi kactir?

        int elementSayisi = 0;
        for (int i = 0; i <arr.length ; i++) {

            elementSayisi += arr[i].length;

        }

        System.out.println("toplam element sayisi: " + elementSayisi); // toplam element sayisi: 10

        // tum elementlerin toplamini bulun
        // MDA' larda her bir elementi elden gecirmek istiyorsak
        // kat sayisi kadar nested for-loop kullaniriz.

        int elementlerToplami = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                elementlerToplami += arr[i][j];
            }
        }

        System.out.println("elementlerin toplami: " + elementlerToplami); // elementlerin toplami: 35


    }
}
