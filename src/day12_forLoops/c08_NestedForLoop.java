package day12_forLoops;

public class c08_NestedForLoop {
    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun

        /*
            * * * * *
            * * * * *
            * * * * *
         */

        int satirSayisi= 3;
        int sutunSayisi= 5;

        for (int k=1; k<=satirSayisi ; k++) { // satir sayisini kontrol ediyor
            for (int i = 1; i <=sutunSayisi; i++) { // sutun sayisini kontrol ediyor
                System.out.print("* ");
            }
            System.out.println(""); // bir satirdaki tum sutunlar bitince alt satira geciyor
        }

        System.out.println("====================");


        for (int i = 1; i <=satirSayisi ; i++) { // i olusturcaz satirlar kadar

            for (int j = 1; j <=sutunSayisi ; j++) { // j olusturcaz sutunlar kadar

                System.out.print( "* ");
            }
            System.out.println("");
        }
    }
}
