package day30_TEKRAR;

public class CToyotaCorolla extends BToyota{

    String lastik = "Lassa 205-55-15";
    String model = "Corolla";
    String yakit = "Corolla dizel, beninli ve elektrikli olabilir.";

    public void motor(){
        System.out.println("Corolla araclar turkiyede uretilen motor kullanir.");
    }

    public void uretimYeri(){
        System.out.println("Corolla araclar turkiyede uretilir.");
    }


    public static void main(String[] args) {

        CToyotaCorolla corolla = new CToyotaCorolla();
        System.out.println(corolla.lastik); // Lassa 205-55-15
        System.out.println(corolla.model); // Corolla
        System.out.println(corolla.yakit); // Corolla dizel, beninli ve elektrikli olabilir.
        corolla.motor(); // Corolla araclar turkiyede uretilen motor kullanir.
        corolla.uretimYeri(); // Corolla araclar turkiyede uretilir.

        System.out.println(corolla.marka); // toyota
        System.out.println(corolla.aku); // Inci aku
        corolla.guvenlik(); // toyota araclar extra guvenlik onlemleri barindirir.

        System.out.println(corolla.vites); // tum arabalarin vitesi olur.

    }
}
