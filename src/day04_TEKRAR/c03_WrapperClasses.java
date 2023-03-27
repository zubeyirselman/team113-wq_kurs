package day04_TEKRAR;

public class c03_WrapperClasses {
    public static void main(String[] args) {

        String sonucStr= "345";
        // bu degere 10 ekleyin

        int sonuc= Integer.parseInt(sonucStr);
        System.out.println(sonuc +10);

        sonuc= Integer.valueOf(sonucStr);
        System.out.println(sonuc + 10);

        char krk= '3';
        System.out.println(Character.isDigit(krk));

        System.out.println(Character.isLetter(krk));

        System.out.println(Character.isAlphabetic(krk));


    }
}
