package day12_TEKRAR;

public class c08_NestedForLoop {
    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun

        /*
                * * * * *
                * * * * *
                * * * * *
         */

        int satirSayisi= 4;
        int sutunSayisi= 6;

        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
