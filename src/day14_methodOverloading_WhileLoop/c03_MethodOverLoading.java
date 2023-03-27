package day14_methodOverloading_WhileLoop;

public class c03_MethodOverLoading {
    public static void main(String[] args) {

        /*
        bir classta ayni isme sahip
        farkli islem yapan methodlar olabilir
        Java bu methodlardan hangisinin calisacagina parametrelere gore karar verir.
        Bir classta ismi ayni parametreleri farkli methodlar olmasina
        Method Overloading denir.
         */

        String str= "Bu is olacak";

        System.out.println(str.replace("Bu is", "Java guzel")); // Java guzel olacak
        System.out.println(str.replace('u', 'e')); // Be is olacak

    }
}
