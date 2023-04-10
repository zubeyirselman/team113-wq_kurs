package day39_TEKRAR;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {
    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> okulMap = new HashMap<>();

        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102, "Veli-Can-10-M-TM");
        okulMap.put(103, "Ali-Can-11-M-Soz");
        okulMap.put(104, "Ayse-Cem-11-H-TM");
        okulMap.put(105, "Ayse-Han-10-H-MF");
        okulMap.put(106, "Veli-Han-10-H-MF");

        return okulMap;
    }


    public static void subeOgrenciListesiYazdir(Map<Integer, String> okulMap, String istenenSube) {

        // 1- value' lari ayri bir collection olarak kaydedelim,
        Collection<String> valueCollection = okulMap.values();

        // 2- her bir value' yu split ile bir array' e donusturelim,
        System.out.println("======= Sube Listesi =======");
        System.out.println("Sira  Sinif  Isim  Soyisim");
        int siraNo = 1;

        for (String eachValue : valueCollection
        ) {
            //Ali-Cem-10-H-MF mesela ornek olarak bu geldi
            String[] valueArr = eachValue.split("-"); // [Ali, Cem, 10, H, MF]

            // 3- array' den sube' yi kontrol edip
            // eger istenen sube ise ogrencinin sinif isim ve soyismini yazdiralim
            if (valueArr[3].equalsIgnoreCase(istenenSube)) {
                System.out.println(siraNo + " - " + valueArr[2] + ", " + valueArr[0] + ", " + valueArr[1]);
                siraNo++;
            }
        }
    }

    public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {
        // 1- once key' leri bir set olarak kaydedelim
        Set<Integer> okulKeySeti = okulMap.keySet();

        for (Integer eachKey : okulKeySeti
        ) {
            // 2- her bir key' e ait value' yu split ile array' e donusturelim
            String[] valueArr = okulMap.get(eachKey).split("-"); // [Ali, Cem, 10, H, MF]

            // 3- sube bilgisi eskiSube olanlari yeniSube yapalim
            if (valueArr[3].equalsIgnoreCase(eskiSube)) {
                valueArr[3] = yeniSube;
            }

            // 4- array' deki bilgileri birlestirerek yeniden map' e ekleyelim
            String yeniValue = "";
            for (int i = 0; i < valueArr.length - 1; i++) {
                yeniValue += valueArr[i] + "-";
            }
            yeniValue += valueArr[valueArr.length - 1];

            okulMap.put(eachKey, yeniValue);
        }

        // 5- okulMap' inin son halini return edelim
        return okulMap;
    }

    public static Map<Integer, String> yilSonuSiniflariDegistir(Map<Integer, String> okulMap) {

        // 1- key' leri bir set olarak kaydedelim
        Set<Integer> keySeti = okulMap.keySet();

        // 2- set' teki her bir key' e ait value' yu for-each loop ile ele alalim
        for (Integer eachKey : keySeti
        ) {
            // 3- her key' e ait value' yu split() ile ayirip, array olarak kaydedelim
            String[] valueArr = okulMap.get(eachKey).split("-");

            // 4- array olarak kaydettigimiz bilgilerde istenen update' i yapalim
            if (valueArr[2].equalsIgnoreCase("12")) {
                valueArr[2] = "Mezun";
            } else {
                int sinif = Integer.parseInt(valueArr[2]);
                sinif++;

                valueArr[2] = sinif + "";

            }

            // 5- array' in yeni halini String olarak birlestirip yeniValue elde edelim
            String yeniValue = "";
            for (int i = 0; i < valueArr.length - 1; i++) {
                yeniValue += valueArr[i] + "-";
            }

            yeniValue += valueArr[valueArr.length - 1];

            // 6- her bir key ve yeniValue' yu map' e ekleyerek map' i update edelim

            okulMap.put(eachKey, yeniValue);
        }

        // 7- map' in yeni halini return edelim
        return okulMap;
    }

    public static void sinifaGoreListeYazdir(Map<Integer, String> okulMap, int istenenSinif) {

        // 1- okulmap' deki entry' leri kaydedelim

        Set<Map.Entry<Integer, String>> okulEntrySeti = okulMap.entrySet();

        // 2- her bir entry' yi ele alip, istenen islemi yaptiralim

        for (Map.Entry<Integer, String> eachEntry : okulEntrySeti
        ) {

            // eachEntry ==> 101=Ali-Cem-10-H-MF


            // isim, soyisim, bolumlerini
            String value = eachEntry.getValue(); // Ali-Cem-10-H-MF
            String[] valueArr = value.split("-"); // [Ali, Cem, 10, H, MF]

            if (valueArr[2].equals(istenenSinif + "")) {
                // no,
                System.out.print(eachEntry.getKey() + " ");
                // isim, soyisim, bolumlerini
                System.out.print(valueArr[0] + " " + valueArr[1] + " " + valueArr[4]);
                System.out.println(" "); // alt satira gecmesi icin
            }
        }
    }

    public static Map<Integer, String> soyisimleriBuyukYap(Map<Integer, String> okulMap) {

        // Entry' ler ile cozelim

        Set<Map.Entry<Integer, String>> okulEntrySeti = okulMap.entrySet();

        // herbir Entry' i elden gecirip, sadece soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer, String> eachEntry : okulEntrySeti
        ) {
            // her bir entry' deki value' yu alalim
            String value = eachEntry.getValue(); // Ali-Cem-10-H-MF

            // value' yu array' e cevirelim
            String[] valueArr = value.split("-"); // [Ali, Cem, 10, H, MF]

            // array' in icinde soyismi buyuk harf yapalim
            valueArr[1] = valueArr[1].toUpperCase(); // [Ali, CEM, 10, H, MF]

            eachEntry.setValue(valueArr[0] + "-" + valueArr[1] + "-"
                             + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4] + "-");
        }
        return okulMap;
    }
}
