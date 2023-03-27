package takimCalismasi_01_AC;

import java.util.Scanner;

public class c08_ {
    public static void main(String[] args) {

        // 8-Soru: Bir kullanıcının bir yarışma kazanıp kazanmadığını belirlemek için bir Java programı yazın.
        // Kullanıcıdan yaşını, medeni halini (evli veya bekar),
        // eğitim durumunu (lisans veya yüksek lisans) ve yarışmada aldığı puanı alın.
        // Kullanıcının yaşının 18 ila 35 arasında,
        // bekar ve lisans mezunu olduğunu ve yarışmada en az 90 puan aldığını varsayalım.
        // Bu koşullar sağlanıyorsa, kullanıcı yarışmayı kazanmıştır.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        System.out.println("Lutfen medeni halinizi giriniz: ");
        String mdnHal = scan.next();

        scan.nextLine();
        //System.out.println();
        System.out.println("Lutfen egitim durumunuzu lisans veya yuksek lisans olarak giriniz: ");
        String egtm = scan.nextLine();


        System.out.println("Lutfen puaninizi giriniz: ");
        int puan = scan.nextInt();

        if ((yas >= 18 && yas <= 35) && (mdnHal.equalsIgnoreCase("bekar"))
                && (egtm.equalsIgnoreCase("lisans"))
                && (puan >= 90)) {
            System.out.println("Tebrikler! Yarismayi kazandiniz!");
        } else {
            System.out.println("Yaziklar olsun lanet olasi kor seytan!");
        }


    }
}
