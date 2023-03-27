package TakimCalismasi_01;

import java.util.Scanner;

public class c08_Ornek {
    public static void main(String[] args) {


        //İki tamsayıyı değiştirmek için bir kod yazınız.
        //Scanner scan = new Scanner(System.in);
        //System.out.println("2 sayi giriniz :");
        //double n1 = scan.nextDouble();
        //double n2 = scan.nextDouble();
        //System.out.println("Degistirmeden once : " + n1 + " - " + n2);

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz: ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        double temp = 0;

        temp= sayi1;
        sayi1= sayi2;
        sayi2= temp;

        System.out.println("Yeni durumda sayi1: " + sayi1 + " sayi2: " + sayi2);

        //sayi1 = 10; sayi2 = 20; temp = 10;
        //sayi1 = 20; sayi2 = 20; temp = 10;
        //sayi1 = 20; sayi2 = 20; temp = 10;
        //sayi1 = 20; sayi2 = 10; temp = 10;

        // kaldigimiz yer: String Manipulation



    }
}
