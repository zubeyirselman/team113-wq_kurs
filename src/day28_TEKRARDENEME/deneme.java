package day28_TEKRARDENEME;

import day28_TEKRAR.C01;

public class deneme {
    public static void main(String[] args) {

        C01 obj = new C01();

        // obj.str = "Fava"; farkli package default access modifier
        // C01_.s = "Fava"; farkli package default access modifier

        // obj.b = 10; private access modifier
        // C01_.c = 30; private access modifier

        C01.a = 50;

        obj.d = 40;

    }
}
