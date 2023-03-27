package day12_TEKRAR;

public class c06_StringiTersineCevirme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input = "Java Candir";
        // output: ridnaC avaJ

        String toplam = "";
        for (int i = input.length()-1; i >=0; i--) {
            toplam += input.charAt(i);
        }
        System.out.println(toplam);
    }
}
