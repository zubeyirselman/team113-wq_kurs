package day22_TEKRAR;

public class c03_hemsireRunner {
    public static void main(String[] args) {

         /*
            bir obje olustururken parametre olarak hicbir deger girilmezse olusturulan obje,
            olusturulldugu class' daki variable' lara atanan degerleri alir.
            eger obje olusturulan class' da deger atamasi yoksa java default degerleri atar.
         */


        c02_hemsire hemsire1 = new c02_hemsire();

        System.out.println(hemsire1.isim); // isim atanmamis
        System.out.println(hemsire1.evliMi); // hiclik
        System.out.println(hemsire1.yas); // 0
        System.out.println(hemsire1.izindeMi); // false

        hemsire1.isim = "tugba";
        hemsire1.yas = 29;

        System.out.println(hemsire1.isim); // tugba
        System.out.println(hemsire1.yas); // 29
    }
}
