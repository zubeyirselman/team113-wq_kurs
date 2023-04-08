package day42_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1 = new LinkedList<>();

        dq1.add("K");
        dq1.add("B"); // [K, B]
        dq1.addLast("F"); // [K, B, F]
        dq1.addFirst("A"); // [A, K, B, F]

        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast()); // F

        System.out.println(dq1.remove()); // A ==> hem siliyor hem getiriyor.
        System.out.println(dq1.poll()); // K
        System.out.println(dq1.pollLast()); // F
        System.out.println(dq1.remove()); // B ==> artik deque bos

        // dq1.remove(); ==> exception firlatir cunku deque bos

        System.out.println(dq1.poll()); // null
        // bos deque olmasina ragmen exception firlatmaz.
        // eleman silemedigi icin bize null dondurur.

        dq1.add("K");
        dq1.add("B"); // [K, B]

        dq1.push("F"); // [F, K, B]
        // deque' in basina element ekler. eger deque ile ilgili sinirlandirma varsa ve yer kalmamissa,
        //illegalStateException verir.

        System.out.println(dq1.pop()); // F ==> ilk elementi silip bize dondurur. removeFirst() ile aynidir.

        System.out.println(dq1.element()); // K ==> ilk elementi silmeden bize dondurur.
        // bos deque' de calisirsa exception firlatir.

        System.out.println(dq1.peek()); // K ==> ilk elementi silmeden bize dondurur.
        // bos deque' de calisirsa null dondurur, exception firlatmaz.
        System.out.println(dq1.peekFirst()); // K
        System.out.println(dq1.peekLast()); // B

        System.out.println(dq1.offer("C")); // true, [K, B, C] ==> ekledigini gostermek icin true doner,
        // ekleyemezse false doner. en sona ekler.

        System.out.println(dq1.offerFirst("M")); // true, [M, K, B, C]


        System.out.println(dq1);

    }
}
