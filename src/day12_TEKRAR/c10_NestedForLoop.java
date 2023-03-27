package day12_TEKRAR;

public class c10_NestedForLoop {
    public static void main(String[] args) {
        
        /*
                verilen satir sayisina gore asagidaki sekli olusturan kod yaziniz
         *
         * *
         * * *
         * * * *

         */

        int satir = 6;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
