package day36_TEKRAR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked excepitons, kod yazilir yazilmaz, daha run etmeden
            javanin riskli kodlari tanimlayip
            calistirmadan once bana bir yol gostermelisin dedigi
            exception turleridir.

            Checked Exceptions genelde dosya okuma ve yazma IO(input-output) islemlerinde olusur.

            IO exception olusma ihitmaline karsi
            kodu yazar yazmaz java altini kirmizi cizer

            Checked exception kodun altini kirmizi cizdiginden
            kodumuzun calisir hale gelmesi icin kirmizi cizgiyi kaldirmamiz lazim

            1- try-catch blogu kullanarak
               exception handle edilebilir.
               Ve javaya exception olustugunda ne yapmasini istedigimiz gosterilebilir.

            2- Eger exception' i handle etmek istemiyorsak
               sadece kodumuzun calismasini istiyorsak
               method deklerasyonuna bu exception ihtimalini yazarak
               kodu calisir hale getirebiliriz

               method signature' ini throws keyword' u ile
               beklenen exception turunu yazarsak kod calisir duruma gelir
               ANCAK exception olusursa javaya cozum yolu sunulmadigindan
               kodun calismasi durur.
         */

        String dosyaYolu = "src/day36_TEKRARBITMEDI/text1.txt";
        FileInputStream fis = new FileInputStream(dosyaYolu);
    }
}
