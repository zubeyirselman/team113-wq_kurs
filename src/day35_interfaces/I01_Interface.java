package day35_interfaces;

public interface I01_Interface {

    static int sayi = 10;
    final String str = "Java Candir";
    public static final boolean b = true;

    // Interface' de tum variable' lar (yazilmasa bile) public, static ve final' dir.
    // final oldugu icin sonradan degistirme imkani yoktur, olustururken deger atanmalidir.
    // Bu ozellikler standart olarak tum variable' lara tanimlandigindani
    // bu tanimlamalari yapmak gerekli degildir. (intellij gri yapti)

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();

    // tum methodlarda standart olarak (yazilmasa bile) public ve abstract' dir. (intellij gri yapti)

}
