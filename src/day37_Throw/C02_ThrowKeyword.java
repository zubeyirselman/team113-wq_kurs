package day37_Throw;

public class C02_ThrowKeyword {
    public static void main(String[] args) {

        String a = null;
        String b = "";
        try {
            try {
                int c = a.length() + b.length();

            } catch (NullPointerException e) {

                if (b.length() == 0) {
                    throw new RuntimeException();
                }
                System.out.println("null point vardir islem yapilamaz");
            }
            } catch (RuntimeException e) {

            System.out.println("Throw keyword calisti");
        }
    }
}
