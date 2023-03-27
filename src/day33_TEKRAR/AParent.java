package day33_TEKRAR;

public class AParent {

    void method1 (){

    }

    void method2(){

    }

    Object method3(){

         /*
            overriden method ile overriding method' un
            isim ve signature' lari ayni olmalidir.

            return type ve access modifier
            signature' a dahil degildir.
            ancak overriding' de bunlarla ilgili de kurallar vardir.

            1- access modifier kurali:
                child parent' i kisitlayamaz.
                eger overridden ve overriding method' lari
                private yaparsak
                bu 2 method bagimsiz olarak calisir,
                aralarinda override islemi olmaz.
                (HERKESIN KASASI AYRI GIBI DUSUN)

            2- Return type kurali:
                return type primitive veya void ise
                iki method' un return type' i AYNI OLMALIDIR.

                non-primitive oldugunda;
                ya ayni olmali
                veya parent class' daki return type
                child class' daki return type' in parenti olmali
                (Covariant data)
         */

        return null;
    }

}
