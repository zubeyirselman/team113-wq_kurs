package day20_TEKRAR;

import java.util.ArrayList;
import java.util.List;

public class c06_BaskaClasstanCalistirma {
    public static void main(String[] args) {

        // c05' deki istenmeyenlerisil methodunu buradan kullanalım

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Cikoltali Gofret");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");

        String istenmeyenHarf = "o";
        System.out.println(c05_IstenmeyeniSil.istenmeyenHarfIcerenleriSil(urunler,istenmeyenHarf));
        // [Nutella]

        System.out.println(c05_IstenmeyeniSil.istenmeyenHarfIcerenleriSil(urunler,"a"));
        // [Cokoprens, Cokomel]

    }
}
