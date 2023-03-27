package TakimCalismasi_01;

import java.util.Scanner;

public class c04_Ornek {
    public static void main(String[] args) {

        // 4-Kullanıcının girdiği bir karakterin, harf olup olmadığını kontrol eden bir program yazın.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
        char krk = scan.next().charAt(0);

        if ((krk>='a' && krk<='z') || (krk>='A' && krk<='Z')){
            System.out.println("girilen karakter harftir.");
        }else{
            System.out.println("girilen karakter harf degildir.");
        }



    }
}
