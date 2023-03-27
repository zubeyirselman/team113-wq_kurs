package day22_TEKRAR;

public class C07_ArabaRunner {
    public static void main(String[] args) {

        C06_Araba araba1 = new C06_Araba();

        araba1.marka = "toyota";
        araba1.model = "corolla";
        araba1.hasarliMi = false;
        araba1.yil = 2017;
        araba1.fiyat = 5250;

        System.out.println("marka: " + araba1.marka + ", " + "model: " + araba1.model);

        System.out.println(araba1);

        C06_Araba araba2 =new C06_Araba("Honda", "Jazz", true, 2010, 3000);
        System.out.println(araba2);
        C06_Araba araba3= new C06_Araba("Ford", "Focus", false, 2021, 5000);
        System.out.println(araba3);
    }
}
