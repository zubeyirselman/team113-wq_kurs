package day10_TEKRAR;

public class c04_IndexOf {
    public static void main(String[] args) {

        // verilen bir cumlede istenen bir string icin, asagidaki cumlelerden uygun olani yazdirin:

        // 1- "aradiginiz kelime cumlede 1 kere kullanilmis"
        // 2- "aradiginiz kelime cumlede 2 kere kullanilmis"
        // 3- "aradiginiz kelime cumlede 2 den fazla kullanilmis"
        // 4- "aradiginiz kelime hic kullanilmamis"

        String cumle = "Java olsa olsa 2 ay surer, o da olsa olsa yani...";
        String istenenKelime = ".";

        if (cumle.indexOf(istenenKelime) == (-1)) {
            System.out.println("aradiginiz kelime hic kullanilmamis");

        } else {

            int kelimeIlkIndex = cumle.indexOf(istenenKelime);

            if (cumle.indexOf(istenenKelime, (kelimeIlkIndex + 1)) == (-1)) {
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            } else {

                int ikinciKelimeIndex = cumle.indexOf(istenenKelime, (kelimeIlkIndex + 1));
                if (cumle.indexOf(istenenKelime, (ikinciKelimeIndex + 1)) == (-1)) {
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                }else {
                    System.out.println("aradiginiz kelime cumlede 2 den fazla kullanilmis");
                }

                }
            }


        }
    }
