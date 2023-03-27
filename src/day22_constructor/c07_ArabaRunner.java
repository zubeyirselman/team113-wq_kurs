package day22_constructor;

public class c07_ArabaRunner {
    public static void main(String[] args) {

        c06_Araba araba1 = new c06_Araba();

        araba1.marka = "toyota";
        araba1.model = "corolla";
        araba1.hasarliMi = false;
        araba1.yil = 2017;
        araba1.fiyat = 5250;

        System.out.println(araba1);

        c06_Araba araba2 = new c06_Araba("Honda", "Jazz", true, 2010, 3000);
        System.out.println(araba2);
        // c06_Araba Ozellikleri{yil=2010, marka='Honda', model='Jazz', hasarliMi=true, fiyat=3000}

        c06_Araba araba3 = new c06_Araba("Wolksvagen", "Jetta", false, 2012, 7200);
        System.out.println(araba3);
        // c06_Araba Ozellikleri{yil=2012, marka='Wolksvagen', model='Jetta', hasarliMi=false, fiyat=7200}
    }
}
