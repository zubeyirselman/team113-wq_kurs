package day11_TEKRAR;

public class c09_ForLoop {
    public static void main(String[] args) {

        // 50' den baslayip, 100' e kadar (100 dahil) sayilari yanyana,
        // aralarinda 1 bosluk olacak sekilde yazdirin.

        for (int i = 50; i <=100 ; i++) {
            System.out.print(i + " ");
        }


        System.out.println("");
        // 3 basamakli sayilardan 23 ile bolunebilenleri
        // yan yana aralarinda 1 bosluk olacak sekilde yazdirin.

        for (int i = 100; i <1000 ; i++) {
            if (i%23==0){
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        // 20 den baslayip, 7ser artarak 100' e kadar yazdirin
        // 100 yazdirmamiz gerekiyorsa yazdirin ama 100'u gecmeyin.

        for (int i = 20; i <=100 ; i+=7) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // 100 den baslayarak 1' e kadar (100 ve 1 dahil)
        // 7 ile bolunebilen sayilari yazdirin

        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }




    }
}
