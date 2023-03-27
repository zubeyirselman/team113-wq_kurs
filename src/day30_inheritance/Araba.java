package day30_inheritance;

public class Araba {

    // marka gozetmeksizin tum arabalarin sahip olacagi ozellikleri
    // bu class' a koyariz

    String marka = "tum arabalarin markasi olur.";
    String model = "tum arabalarin modeli olur.";
    String vites = "tum arabalarin vitesi olur.";
    String yakit = "tum arabalar yakitla calisir.";

    public void uretimYeri (){
        System.out.println("tum arabalar fabrikada uretilir.");
    }

    public void motor(){
        System.out.println("tum arabalarin motoru olur.");
    }
}
