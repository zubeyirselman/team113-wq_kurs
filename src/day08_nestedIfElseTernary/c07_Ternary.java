package day08_nestedIfElseTernary;

public class c07_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int kenar1=12;
        int kenar2=2;
        int kenar3=12;


        System.out.println(kenar1==kenar3 && kenar1==kenar2 && kenar1>0
                            ? "eskenar ucgen"
                            : "eskenar degil");





    }
}
