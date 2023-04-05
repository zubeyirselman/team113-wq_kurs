package day39_TEKRAR;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {
    public static Map<Integer, String> ornekMapOlustur(){

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

        for (String eachValue:valueCollection
             ) {
            //Ali-Cem-10-H-MF mesela ornek olarak bu geldi
            String[] valueArr = eachValue.split("-"); // [Ali, Cem, 10, H, MF]

            // 3- array' den sube' yi kontrol edip
            // eger istenen sube ise ogrencinin sinif isim ve soyismini yazdiralim
            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(siraNo + " - " +valueArr[2] + ", " + valueArr[0] + ", " + valueArr[1]);
            siraNo++;
            }
        }
    }
}
