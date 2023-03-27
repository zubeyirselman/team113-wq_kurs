package day38_exceptions_GarbageCollector;

public class C01_ThrowKeyword {
    public static void main(String[] args) {

        // sayi 0 dan kucukse sartli satirlar calismasin

        int sayi = -10;

        try {


            if (sayi<0){
                throw new IllegalArgumentException("sayi negatif olmamali");
            }

            System.out.println("sartli calisacak satir1");
            System.out.println("sartli calisacak satir2");
            System.out.println("sartli calisacak satir3");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


        System.out.println("yola devam");
    }
}
