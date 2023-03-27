package day15_doWhileLoop_Scope;

public class c06_ClassLevelVariable {

    /*
        bir class icinde tum methodlarin erisebilecegi variable' lar istenirse
        classLevel' da (class' in icinde ama method' larin disinda) olusturulmalidir.

            1- class level' da olusturulan variable' larin scope' u tum class' tir.
            2- class level' da olusturulan variable' lara deger atanmasa bile
                java onlar icin tanimlanmis default degerler atar. (ornegin boolean icin false)
            3- class level' da olusturulan variable' lar static veya instance (static olmayan) olabilir.
            4- static olarak tanimlanan variable' lar tum method' larda direk kullanilabilir.
            5- method static' se icerisine static olmayan hicbirsey almaz.
     */

    static int sayi = 10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;

    int in2;
    boolean bl2;


    public static void main(String[] args) {

        System.out.println(sayi);
        System.out.println("string: " + isim); // non-primitive turler icin null
        System.out.println("boolean: " + bl); // false
        System.out.println("char: " + chr); // '' hiclik
        System.out.println("int: " + in1); // sayisal turler icin 0
        staticMethod();
       // staticOlmayanMethod();
    }

    public static void staticMethod() {
        sayi++;
        System.out.println(sayi); // static
        System.out.println(chr); // static
        //System.out.println(in2); // instance
        //System.out.println(bl2); // instance

    }

    public void staticOlmayanMethod() {
        sayi--;
        System.out.println(sayi); // static oldugu icin kullanabildim
        System.out.println(bl); // static
        System.out.println(in2); // instance


    }
}
