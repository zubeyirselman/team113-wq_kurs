package day36_TEKRAR;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {


        String str = null;

        System.out.println(str); // null

        // System.out.println(str.concat("Java")); // nullPointerExcepton


        String str1 = "34";
        String str2 = "23a";

        // String olarak verilen sayilarin toplamini yazdirin

        // System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
        // NumberFormatException


        String str4 = "Java Candir";

        Object obj = str4;

        Integer a = (Integer) obj; // ClassCastException

    }
}
