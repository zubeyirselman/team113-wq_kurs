package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {

    public static void main(String[] args) {

        String str = "Java her gecen gum guzellesiyor";
        int[] arr = {3,4,6,3,6,7,4,2,5,7};

        // kullanicidan 0 veya pozitif bir tam sayi isteyin
        // girilen degeri index olarak kullanip
        // str ve arr' nin o indexindeki elemanlari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya pozitif bir tamsayi girin");

        /*
            birbirinden bagimsiz 3 farkli turde exception riski var
            bunlari farkli sekillerde handle edebiliriz

            1- herbirini ayrı ayrı try-catch yapariz (profesyonel degil)
            2- tek bir try, birden fazla catch yapabilirsiniz
            3- tek bir try-catch yapip tum exception' lari yakalayacak
            bir exception turu yazilabilir.
         */

        try {
            int index = scan.nextInt();

            System.out.println(str.charAt(index));

            System.out.println(arr[index]);
        } catch (RuntimeException e) {
            // System.out.println("giris hatali olabilir, index String veya arrayin disinda olabilir.");
            e.printStackTrace();
            // Biz mesaj yazacaksak genel bir mesaj yazabiliriz
            // veya javanin hata kodalrini yazdirabiliriz
        }

        try {
            int index = scan.nextInt();

            System.out.println(str.charAt(index));

            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println("tamsayi girmelisin");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index String sinirleri disinda");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("girilen index array sinirlari disinda");
        }


    }
}
