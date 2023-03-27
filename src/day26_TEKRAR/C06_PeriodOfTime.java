package day26_TEKRAR;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1992,1,12);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));
        // P31Y2M5D ==> dogali 31yil 2ay 5d olmus.

        System.out.println("Yas: " + Period.between(dogumTarihi,bugun).getYears());
        // Yas: 31
    }
}
