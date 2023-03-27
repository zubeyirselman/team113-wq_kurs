package day31_inheritance;

public class DCorolla extends CToyota{

    String str3 = "Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constructor' i calisti.");
    }

    DCorolla(int sayi) {
        super(8);
        System.out.println("int Parametreli Corolla constructor' i calisti.");
    }

    public static void main(String[] args) {

        DCorolla obj1 = new DCorolla(5);

    }
}

/*
    biz gorunur bir constructor olusturdugumuzda
    javanin default constructor' i silmesine benzer olarak,

    extends keyword kullanilmis bir class' daki
    herhangi bir constructor' in ilk satirinda
    gozle gorunur bir constructor call yazilmissa,
    java default olarak koydugu super constructor call' u siler.


    Bir constructor' in icinde sadece 1 tane constructor call olabilir.
    o da ilk satirda olmak ZORUNDADIR.


    Eger this(parametreler) veya super(parametreler) ile
    constructor call yaptigimizda
    yazdigimiz argument ile uyumlu parametreye sahip bir constructor yoksa
    java CTE verir.
 */