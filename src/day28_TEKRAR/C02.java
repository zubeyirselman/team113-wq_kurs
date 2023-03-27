package day28_TEKRAR;

public class C02 {
    public static void main(String[] args) {
        C01 obj = new C01();
        //System.out.println(obj.b); cunku access modifier' i private
        //System.out.println(obj.c); cunku access modifier' i private
        // kendi class' indan baska bi yerden ulasamayiz

        obj.str = "tava";

        C01.s = "Tava";

    }
}
