package day23_Constructor;

import java.sql.SQLOutput;

public class C01_ArabaRunner {
    public static void main(String[] args) {

        Araba araba1 = new Araba();

        Araba araba2 = new Araba(10000, "BMW");
        System.out.println(araba2);

    }
}
