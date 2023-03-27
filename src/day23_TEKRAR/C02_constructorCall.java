package day23_TEKRAR;

public class C02_constructorCall {
     /*
            java' da ihtiyac olursa bir cons. icinden baska cons. cagrilabilir.
        this(ilgli parametreler) yazarak istedigimiz cons.' i cagirabiliriz.

            Cons. call icin 2 kural vardir:
        1- cons. call icinde bulundugu cons' in ilk satirinda olmalidir.
        2-
     */

    int sayi;
    String str;

    public C02_constructorCall() {
        System.out.println("parametresiz constructor calisti");
    }

    public C02_constructorCall(int sayi) {
        System.out.println("int parametreli constructor calisti");
        this.sayi = sayi;
    }

    public C02_constructorCall(String str) {
        this(5);
        System.out.println("String parametreli constructor calisti");
        this.str = str;
    }

    public C02_constructorCall(int sayi, String str) {
        // C02_constructorCall boyle yazildiginda methodCall olarak anlar.
        this(); // java syntax olarak constructor call icin bunu belirlemistir.
        this.sayi = sayi;
        this.str = "Java";
        System.out.println("iki parametreli constructor calisti");
    }

    public static void main(String[] args) {
        C02_constructorCall obj1 = new C02_constructorCall();

        C02_constructorCall obj2 = new C02_constructorCall("Java");
        System.out.println(obj2.sayi); // 5
        System.out.println(obj2.str); // Java

        C02_constructorCall obj3 = new C02_constructorCall(7, "selcuk");
        System.out.println(obj3.sayi); // 7
        System.out.println(obj3.str); // Java
    }
}
