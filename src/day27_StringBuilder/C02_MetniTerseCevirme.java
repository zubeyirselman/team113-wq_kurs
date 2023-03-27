package day27_StringBuilder;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {

        // verilen bir metni tersine cevirin

        String str = "Java Candir.";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        System.out.println(sb); // .ridnaC avaJ

        sb.reverse();
        System.out.println(sb); // Java Candir.

    }
}
