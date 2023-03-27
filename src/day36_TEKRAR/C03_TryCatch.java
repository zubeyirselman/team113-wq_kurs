package day36_TEKRAR;

public class C03_TryCatch {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 0;

        try {

            System.out.println(sayi1 / sayi2);
            System.out.println("deneme1");
            System.out.println("deneme2");
            System.out.println("deneme3");

        } catch (ArithmeticException e) {

            System.out.println("bolen sifir olmamali");

        }

        /*
            bir try blogunda exception olusursa o satirdan
            catch satirina kadar aradaki tum kodlar ignore edilir.

            eger try blogunda exception olusmazsa
            catch devreye girmez
            (if-else gibi)
         */
    }
}
