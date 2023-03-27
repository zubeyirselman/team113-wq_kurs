package day10_StringManipulation;

public class c03_startsWith_endsWith {
    public static void main(String[] args) {

        // Sununla mı basliyor....
        String str= "Java harika";

        System.out.println(str.startsWith("java")); // false

        System.out.println(str.startsWith("Ja")); // true

        System.out.println(str.startsWith(str)); // true

        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("harika")); // false

        System.out.println(str.startsWith("Javaharika")); // false

        System.out.println(str.startsWith("Java harika")); // true

        System.out.println("==============================");
        // endsWith: sununla mi bitiyor...

        System.out.println(str.endsWith("a")); // true
        System.out.println(str.endsWith("ka")); // true
        System.out.println(str.endsWith("Java harika")); // true
        System.out.println(str.endsWith("")); // true

        System.out.println(str.endsWith(str.substring(str.length() - 1))); // true



    }
}
