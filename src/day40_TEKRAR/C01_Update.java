package day40_TEKRAR;

import day39_TEKRAR.MapMethodDepo;

import java.util.Map;

public class C01_Update {
    public static void main(String[] args) {
        // verilen map' de sube ismi M olanlarin
        // subesini N yapin

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        // {101=Ali-Cem-10-H-MF,
        // 102=Veli-Can-10-M-TM,
        // 103=Ali-Can-11-M-Soz,
        // 104=Ayse-Cem-11-H-TM,
        // 105=Ayse-Han-10-H-MF,
        // 106=Veli-Han-10-H-MF}

        System.out.println(okulMap.get(101)); // Ali-Cem-10-H-MF
        okulMap.put(101, "Ali-Cem-10-M-MF");
        okulMap.put(102, "Kemal-Can-11-M-Soz");
        System.out.println(okulMap);

        // 1- once key' leri bir set olarak kaydedelim
        // 2- her bir key' e ait value' yu split ile array' e donusturelim
        // 3- sube bilgisi eskiSube olanlari yeniSube yapalim
        // 4- array' deki bilgileri birlestirerek yeniden map' e ekleyelim
        // 5- okulMap' inin son halini return edelim


        // 6- return edilen yeni halini eski okulMap' e assign edelim

        okulMap = MapMethodDepo.topluSubeDegistirme(okulMap, "H", "N");
        System.out.println(okulMap);
    }
}
