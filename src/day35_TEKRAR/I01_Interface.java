package day35_TEKRAR;

public interface I01_Interface {

    int sayi = 10;
    final String str = "Java Candir";
    public static final boolean b = true;

    // interface' de tum variable' lar (yazilmasa bile) public, stat,c ve final' dir.
    // final oldugu icin sonradan degistirme imkani yoktur, olustururken deger atanmalidir.
    // Bu ozellikler standart olarak tum variable' lara tanimlandigindan
    // bu tanimlamalari yapmak gerekli degildir. (intellij gri yapti)

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();

    // tum methodlarda standart olarak public ve abstract' dir. ( yazilmasa bile )



}
