package day33_TEKRAR;

public class BChild extends AParent{


    @Override
    void method1() {
        super.method1();
        // burada super. olursa hem child class' daki method1
        // hem de super class' daki method1 calisir.
    }

    void method2(){
        /*
            bir method override edildiginde
            chil class' da @Override notasyonu KULLANILABILIR.

            Kullanmakla kullanmamak arasinda
            pratikte soyle bir sonuc olusur;

            eger notasyon kullanilirsa
            iki method arasindaki iliski takip edilir.
            Parent class' daki method silinirse
            notasyon CTE verir.

            notasyon yoksa
            parent class' daki overriden method silinirse
            bir uyari vermez, CTE olusmaz.

         */
    }

    Double method3 (){

        return 5.0;
    }
}
