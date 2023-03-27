package day27_TEKRAR;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {

        // verilen bir metni tersine cevirin

        String metin = "hello world";

        StringBuilder sb = new StringBuilder(metin);

        sb.reverse();
        System.out.println(sb); // dlrow olleh

        sb.reverse();
        System.out.println(sb); // hello world

    }
}
