package day31_inheritance;

public class FMuhasebe extends EPersonel{


    String sgkNo = "calisan sgk no belirtilmedi.";
    boolean raporluMu;

    public void fazlaMesai(int fazlaMesaiSaati){

        System.out.println(fazlaMesaiSaati*200);
    }

    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*500);
    }

}
