package day10_TEKRAR;

public class c05_ornek {
    public static void main(String[] args) {

        // verilen bir cumlede istenen bir string icin, asagidaki cumlelerden uygun olani yazdirin:

        // 1- "aradiginiz kelime cumlede 1 kere kullanilmis"
        // 2- "aradiginiz kelime cumlede 2 kere kullanilmis"
        // 3- "aradiginiz kelime cumlede 2 den fazla kullanilmis"
        // 4- "aradiginiz kelime hic kullanilmamis"

        String cumle = "Java cok ama cok iyi bro!";
        String kelime = "cok";

        if (cumle.indexOf(kelime)==(-1)){
            System.out.println("aradiginiz kelime hic kullanilmamis");
        } else {
            int ilkKelime = cumle.indexOf(kelime);
            if (cumle.indexOf(kelime,(ilkKelime+1))==(-1)){
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            }else {
                int ikinciKelime= cumle.indexOf(kelime,(ilkKelime+1));
                if (cumle.indexOf(kelime, (ikinciKelime+1))==(-1)){
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                }else {
                    System.out.println("aradiginiz kelime cumlede 2 den fazla kullanilmis");
                }
            }
        }





    }
}
