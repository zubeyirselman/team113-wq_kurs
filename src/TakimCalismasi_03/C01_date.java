package TakimCalismasi_03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class C01_date {
    public static void main(String[] args) {

        /*
            Ali'nin kaç gün yaşadığını bulan kodu yazınız.
            Ali'nin doğum tarihi 12 Mayıs 2002'dir.
         */

        LocalDate alininDT = LocalDate.of(2002,5,12);
        LocalDate an = LocalDate.now();

        System.out.println(Period.between(alininDT,an));
        System.out.println("Ali' nin yasadigi gun sayisi: " + ChronoUnit.DAYS.between(alininDT, an));
        System.out.println(7627 * (24*60));
        System.out.println("Java artistik yaparken akilli ol seni yeneriz!!!");




    }
}
