package TakimCalismasi_01;

public class C21_ {
    public static void main(String[] args) {

        // Verilen bir String' deki istenmeyen harfi silen bir method olusturun.

        String str = "Java";

        karakterSil(str,'a');

    }

    public static String karakterSil(String girilenKelime, char silinecekHarf) {

        String yeniKelime = "";
        for (int i = 0; i <girilenKelime.length() ; i++) {
            if ( girilenKelime.charAt(i) != silinecekHarf){
                yeniKelime += girilenKelime.charAt(i);
            }
        }
        System.out.println(yeniKelime);
        return yeniKelime;
    }
}
