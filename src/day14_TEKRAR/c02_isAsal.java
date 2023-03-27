package day14_TEKRAR;

public class c02_isAsal {
    public static void main(String[] args) {

        //verilen 1'den buyuk bir tamsayi icin
        //sayi asal ise true
        //sayi asal degil ise false donen bir method olusturun

        System.out.println(isAsal(20));
        System.out.println(isAsal(43));

        boolean sonuc= isAsal(57);
        System.out.println(sonuc);
    }

    public static boolean isAsal(int sayi){

        int flag=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (sayi==2){
            return true;
        }else if (flag==0){
            return true;
        }else {
            return false;
        }
    }
}
