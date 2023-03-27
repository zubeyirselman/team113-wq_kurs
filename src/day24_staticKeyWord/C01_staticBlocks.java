package day24_staticKeyWord;

public class C01_staticBlocks {

    C01_staticBlocks() {
        System.out.println("Constructor Calisti.");
    }


    public static void main(String[] args) {

        System.out.println("Main Method Calisti");

        System.out.println("============");
        C01_staticBlocks obj1 = new C01_staticBlocks();
    }

    static {
        /*
            Static blok' lar class ilk calismaya basladıgında calisir.
            genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir.

            birden fazla static blok varsa,
            yukaridan asagi dogru sirali olarak calisir.
        */
        System.out.println("Static Block Calisti");
    }

    static {
        System.out.println("Alttaki Static Calisti.");
    }

    {
        /*
            static olmayan bloklar ise obje olusturulurken cons.' dan once calisir.
            obje icin yapilmasi gereken on ayarlamalar yapmak icin kullanilir.
         */

        System.out.println("Static Olmayan Block Calisti");
    }
}
