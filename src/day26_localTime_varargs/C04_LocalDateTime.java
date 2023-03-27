package day26_localTime_varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2023-03-09T21:52:30.899029700

        System.out.println(ldt.toLocalDate()); // 2023-03-09
        System.out.println(ldt.toLocalTime()); // 21:54:58.995546900

    }
}
