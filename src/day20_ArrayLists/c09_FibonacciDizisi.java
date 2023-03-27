package day20_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class c09_FibonacciDizisi {
    public static void main(String[] args) {

        // Soru 4- Verilen pozitif bir n tamsayisini alarak,
        // bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

        // 0 1 1 2 3 5 8 13 21 34 55 89 .....

        System.out.println(istenenSayidaFibonacciSayisiListele(10));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
        System.out.println(istenenSayidaFibonacciSayisiListele(15));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]
        System.out.println(istenenSayidaFibonacciSayisiListele(25));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368]


    }

    public static List<Integer> istenenSayidaFibonacciSayisiListele(int sayiAdedi){

        List<Integer> fibonacciSerisi = new ArrayList<>();


        if (sayiAdedi <= 0){

            System.out.println("yanlis giris");

        } else if (sayiAdedi == 1) {
            fibonacciSerisi.add(0);
        } else if (sayiAdedi == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else {
            int ilkSayi = 0;
            fibonacciSerisi.add(ilkSayi);
            int ikinciSayi = 1;
            fibonacciSerisi.add(ikinciSayi);
            int yeniSayi = ilkSayi + ikinciSayi;
            fibonacciSerisi.add(yeniSayi);

            while (fibonacciSerisi.size()<sayiAdedi){

                ilkSayi = ikinciSayi;
                ikinciSayi = yeniSayi;
                yeniSayi = ilkSayi + ikinciSayi;
                fibonacciSerisi.add(yeniSayi);

            }

        }

        return fibonacciSerisi;
    }


}
