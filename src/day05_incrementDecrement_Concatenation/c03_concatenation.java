package day05_incrementDecrement_Concatenation;

public class c03_concatenation {
    public static void main(String[] args) {

        //bir String baska bir String veya baska data turunden bir variable ile
        // + isareti ile birlestirilebilir.

        String a= "Java";
        String b= "Guzeldir";
        System.out.println(a + b); //JavaGuzeldir
        System.out.println(a + " " + b); // Java Guzeldir

        int c=10;
        int d=20;

        System.out.println(a+c+d); // Java1020

        //eger String ile baska data turundeki bir deger toplanirsa java sonucu String yapar.

        // peki Java30 yazmak istersek

        System.out.println(a+ (c+d)); // Java30

        System.out.println(a+c*d); // Java200

        System.out.println(d+c+a); // 30Java






    }
}
