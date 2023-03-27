package day31_TEKRAR;

public class CToyota extends BAraba{

    protected String str2 = "Toyota";

    protected CToyota(){

        System.out.println("Parametresiz Toyota constructor' i calisti.");
    }

    protected CToyota(int sayi){

        System.out.println("int Parametreli Toyota constructor' i calisti.");
    }

    protected CToyota(String s){

        System.out.println("String Parametreli Toyota constructor' i calisti.");
    }
}
