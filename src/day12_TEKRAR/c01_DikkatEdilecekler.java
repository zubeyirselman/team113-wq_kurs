package day12_TEKRAR;

public class c01_DikkatEdilecekler {
    public static void main(String[] args) {

        for (int i = 20; i <10 ; i++) {
            System.out.println(i + " ");
        }

        // for loop calisti ancak ilk deger icin bitis sarti FALSE verdiginden,
        // loop body' si HIC DEVREYE girmedi.
        // Yani; LOOP CALISTI FAKAT LOOP BODY' SI HIC DEVREYE GIRMEDI


        for (int i = 0; i <10 ; i--) {
            System.out.println(i + " ");
        }

        // LOOP basladiktan sonra artis-azalis yontemi sebebiyle,
        // bitis degerinden uzaklasiyorsa LOOP teorik olarak sonsuza kadar calisir.
        // BUNA SONSUZ LOOP DENIR.

    }
}
