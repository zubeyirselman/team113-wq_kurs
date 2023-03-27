package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExceptions {

    public static void main(String[] args) {

        String dosyaYolu = "src/day36_exceptions/text.txt";
        FileInputStream fis = null;
        try {

            fis = new FileInputStream(dosyaYolu);
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }

        /*
            eger kodumuzda birden fazla exception ihitmali varsa
            ve bu exceptionlar arasinda parent child iliskisi varsa

            1- ya sadece parenti yazariz
               cunku parent exception, child exception' lari da kapsar
            2- veya ikisini de yazmak istiyorsak
               once child exception' i
               sonra parent exception' i yazmaliyiz
         */
    }
}
