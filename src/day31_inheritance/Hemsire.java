package day31_inheritance;

public class Hemsire extends FMuhasebe{

    String unvan = "Hemsire";

    public void standartMaas(){
        System.out.println("hemsireler minimum 10bin tl maas alir.");
    }

    public void ozelSigorta(){
        System.out.println("hemsireler aylik 300 tl katki ile sigorta yaptirabilir.");
    }

    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire =new Hemsire();
        hemsire.method();
    }

    public void method() {


        System.out.println(this.unvan); // Hemsire
        System.out.println(super.unvan); // parenttaki unvani yazdirir. ==> personel unvan belirtilmemis.
        System.out.println(this.sgkNo); // calisan sgk no belirtilmedi.
        System.out.println(super.sgkNo); // calisan sgk no belirtilmedi.
        this.standartMaas(); // hemsireler minimum 10bin tl maas alir.
        this.fazlaMesai(3); // 600
        super.fazlaMesai(4); // 800 bu direk parent' a gider
        this.ozelSigorta(); // hemsireler aylik 300 tl katki ile sigorta yaptirabilir.
        super.ozelSigorta(); // personleden katki payi alinarak ozel sigorta yapilir.

    }
}
