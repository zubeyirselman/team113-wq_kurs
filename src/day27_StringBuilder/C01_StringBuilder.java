package day27_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0
        sb1.append("mustafa");

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 7

        sb1.append(" yilmazturk");
        System.out.println(sb1); // mustafa yilmazturk 18 karakter
        System.out.println(sb1.capacity()); // 34 ==> 2*eski capacity + 2
        System.out.println(sb1.length()); // 18

        sb1.append(" javayi cok sever, sabah aksam java calisir.");

        System.out.println(sb1.capacity()); // 70 ==> 2*34 + 2
        System.out.println(sb1.length()); // 62


        // 2. Yontem

        StringBuilder sb2 = new StringBuilder("Java Candir");

        System.out.println(sb2.capacity()); // 27
        System.out.println(sb2.length()); // 11

        // 3. Yontem

        StringBuilder sb3 = new StringBuilder(11);
        sb3.append("23457876543");
        System.out.println(sb3.capacity()); // 27
        System.out.println(sb3.length()); // 22

        String str = "Java Candir";

        sb3.append(str, 4,str.length());
        System.out.println(sb3);

        // trim:

        sb3.trimToSize();
        System.out.println(sb3.capacity()); // 29
        System.out.println(sb3.length()); // 29
    }
}
