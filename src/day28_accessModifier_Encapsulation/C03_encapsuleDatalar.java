package day28_accessModifier_Encapsulation;

public class C03_encapsuleDatalar {

    static private String isim = "Yildiz Pazarlama";

    private int satisTutari;

    private int toplamSatis;

    public int a;

    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis += satisTutari;
    }

    public int getToplamSatis() {
        return toplamSatis;
    }
}
