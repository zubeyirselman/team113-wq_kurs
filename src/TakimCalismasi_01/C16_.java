package TakimCalismasi_01;

import java.util.Scanner;

public class C16_ {
    public static void main(String[] args) {
        // Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
        // gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
        // Kinlenmek true
        // Kin tutmak true
        // Ekin ektim true
        // Keskin ilçesinden geçiyorum false
        // Neden kin tutuyorsun false

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime = scan.next();

        System.out.println(kinVarMi(kelime));
    }
    public static boolean kinVarMi (String str){

        str = str.toLowerCase();
        if (str.startsWith("kin") || str.indexOf("kin")>=1){
            return  true;
        }else {
            return false;
        }
    }
}
