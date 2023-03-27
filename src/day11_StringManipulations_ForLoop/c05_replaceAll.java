package day11_StringManipulations_ForLoop;

public class c05_replaceAll {
    public static void main(String[] args) {

        String str = "J&ava54 C+an01dir,,,";

        //str' i Java Candir haline getirin.

        str = str.replaceAll("\\d", ""); // J&ava C+andir,,,
        str = str.replaceAll(" ", "5"); // J&ava5C+andir,,,

        str = str.replaceAll("\\W", ""); // JavaCandir
        str = str.replaceAll("5", " "); // Java Candir

        System.out.println(str);


    }
}
