package day26_TEKRAR;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        // 2023-03-17

        System.out.println(tarih.isLeapYear());
        // false ==> Artik yil mi?

        LocalDate tarih2 = LocalDate.of(1992,01,12);
        System.out.println(tarih2.isLeapYear());

        System.out.println(tarih.plusWeeks(20).plusDays(2));

        System.out.println(tarih.minusMonths(3).minusDays(3));

        System.out.println(tarih.withYear(1992).withMonth(1));

        System.out.println(tarih.getDayOfYear());
        // yilin kacinci gunu oldugunu verir.

        System.out.println(tarih.getMonth());
        // hangi ay oldugunu verir.

        System.out.println(tarih.getMonthValue());
        // ayin ismini degil numarasini verir.

        LocalDate tarih3 = LocalDate.of(1992,1,12);
        System.out.println(tarih3.getDayOfWeek());
        // yukarida girilen tarihinde haftanin hangi gunu oldugunu verdi.

        System.out.println(tarih.isBefore(tarih3));
        // false
        System.out.println(tarih.isAfter(tarih3));
        // true

    }
}
