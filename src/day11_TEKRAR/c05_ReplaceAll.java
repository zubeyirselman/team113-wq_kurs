package day11_TEKRAR;

public class c05_ReplaceAll {
    public static void main(String[] args) {

        String str = "J&ava54 C+an01dir,,,";

        // str' i Java Candir haline getirin

        str = str.replaceAll("\\d", ""); // J&ava C+andir,,,
        str = str.replaceAll(" ", "5"); // J&ava5C+andir,,,

        str = str.replaceAll("\\W", ""); // Java5Candir
        str = str.replaceAll("5", " "); // Java Candir


        System.out.println(str);


    }
}
