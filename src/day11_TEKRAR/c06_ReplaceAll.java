package day11_TEKRAR;

public class c06_ReplaceAll {
    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” ,
        // input2 : “11.40 €”,
        // output : 26.70 €

        String input1 = "15.30 €";
        String input2 = "11.40 €";

        input1 = input1.replaceAll("\\D", "");
        input2 = input2.replaceAll("\\D", "");

        double inp1 = Double.parseDouble(input1);
        double inp2 = Double.parseDouble(input2);

        System.out.println((inp1+inp2)/100 + " €");
    }
}
