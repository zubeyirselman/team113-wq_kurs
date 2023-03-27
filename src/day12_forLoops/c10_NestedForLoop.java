package day12_forLoops;

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

        for (int i = 1; i <=satir ; i++) { // satirlar outer loop yani Distaki Dongu
            for (int j = 1; j <=i ; j++) { // sutunlar inner loop Ic Dongu
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
