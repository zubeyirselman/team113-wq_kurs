package day27_TEKRAR;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0

        sb1.append("zubeyir selman");
        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 14

        sb1.append("kahraman");
        System.out.println(sb1.capacity()); // 34 ==> 2*eskiCapacity(16) + 2
        System.out.println(sb1.length()); // 22

        sb1.append(" javayi cok sever, sabah aksam java calisir.");
        System.out.println(sb1.capacity()); // 70 ==> 2*eskiCapacity(34) + 2
        System.out.println(sb1.length()); // 66

        // 2. Yontem

        StringBuilder sb2 = new StringBuilder("Java Candir");

        System.out.println(sb2.capacity()); // 27
        System.out.println(sb2.length()); // 11

        // 3. Yontem

        StringBuilder sb3 = new StringBuilder(11);
        sb3.append("23457876543");
        System.out.println(sb3.capacity()); // 11
        System.out.println(sb3.length()); // 11

        sb3.append(" : TC NO");
        System.out.println(sb3); // 23457876543 : TC NO
        System.out.println(sb3.capacity()); // 24
        System.out.println(sb3.length()); // 19

        String str = "Java Candir";

        sb3.append(str,4,str.length());
        System.out.println(sb3); // 23457876543 : TC NO Candir

        sb3.trimToSize(); // fazla kapasiteyi kaldırıp birbirine esitliyor.
        System.out.println(sb3.capacity()); // 26
        System.out.println(sb3.length()); // 26

    }
}
