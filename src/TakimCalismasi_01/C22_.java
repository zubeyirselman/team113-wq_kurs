package TakimCalismasi_01;

public class C22_ {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
        // almıyorsa false yazdırın.
        // Ankara false
        // Kafka true
        // Salsa true
        // Saksı false

        String kelime = "ardamar";

        String ilkIkıHarf = kelime.substring(0,2);

       String sonIkiHarf = kelime.substring(kelime.length()-2);

        System.out.println(ilkIkıHarf.equals(sonIkiHarf));

    }
}
