package day16_scope_Arrays;

public class c01_Hastane {
    public static void main(String[] args) {

        ADoktor dok1= new ADoktor();

        System.out.println(dok1.askerlikyaptimi); // false
        dok1.isim= "Kemal";
        dok1.soyisim="Yilmaz";
        dok1.dogumyili= 1980;

        System.out.println(dok1.isim);

        ADoktor dok2= new ADoktor();
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim); // Celik

        System.out.println(dok1.fakulte); // Tip

        System.out.println(dok2.fakulte); // Tip

        dok1.isim= "Burcu";
        System.out.println(dok2.isim); // null

        dok1.fakulte= "Tip fakultesi";
        System.out.println(dok2.fakulte); // Tip fakultesi

        ADoktor dok3= new ADoktor();

        System.out.println(dok3.dogumyili); // 0
        System.out.println(dok3.fakulte); // Tip fakultesi

        System.out.println(ADoktor.fakulte);
        // static variable' lar icin tavsiye edilen erisim yontemi,
        // class ismi.staticUyeIsmi seklindedir.
        // bu kullanim bicimine static yontem denir.


    }
}
