package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1992,1,12);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P31Y1M25D

        System.out.println("Yas: " + Period.between(dogumTarihi,bugun).getYears()); // Yas: 31

    }
}
