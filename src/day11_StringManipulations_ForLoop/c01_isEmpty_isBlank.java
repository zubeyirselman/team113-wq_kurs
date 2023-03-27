package day11_StringManipulations_ForLoop;

public class c01_isEmpty_isBlank {
    public static void main(String[] args) {

        String str= "Java candir";

        System.out.println(str.isEmpty()); // str bos mu diye soruyor ==> false

        System.out.println(str.isBlank()); // space'lerden mi olusuyor diye soruyor ==> false

        str= "    ";

        System.out.println(str.isBlank()); // true
        System.out.println(str.isEmpty()); // false
        System.out.println(str.length()); // 4

        str="";

        System.out.println(str.isEmpty()); // true
        System.out.println(str.length()); // 0
        System.out.println(str.isBlank()); // true

    }
}
