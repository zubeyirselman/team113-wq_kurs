package TakimCalismasi_01;

import java.util.Scanner;

public class c07_Ornek {
    public static void main(String[] args) {


        // 8-Soru: Bir kullanıcının bir yarışma kazanıp kazanmadığını belirlemek için bir Java programı yazın.
        // Kullanıcıdan yaşını, medeni halini (evli veya bekar),
        // eğitim durumunu (lisans veya yüksek lisans) ve yarışmada aldığı puanı alın.
        // Kullanıcının yaşının 18 ila 35 arasında,
        // bekar ve lisans mezunu olduğunu ve yarışmada en az 90 puan aldığını varsayalım.
        // Bu koşullar sağlanıyorsa, kullanıcı yarışmayı kazanmıştır.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi, " +
                           " \n medeni halinizi, " +
                           "\negitim durumunuzu (lisans veya yüksek lisans), " +
                           "\nyarisma puaninizi giriniz: ");
        int yas= scan.nextInt();
        String medeniHal= scan.next();
        scan.nextLine();
        String egtm = scan.nextLine();
        int puan = scan.nextInt();

        if (yas>=18 && yas<=35 && medeniHal.equalsIgnoreCase("bekar")
                               && egtm.equalsIgnoreCase("lisans") && puan>=90){
            System.out.println("Tebrikler! Yarismayi Kazandiniz!");
        }else {
            System.out.println("Yarismayi kaybettiniz, lutfen uzulmeyin..");
        }




    }
}
