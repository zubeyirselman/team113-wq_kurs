package Ornek_Sorular;

import java.util.Arrays;

public class c04_ {
    public static void main(String[] args) {

        String str = "gold3 blue1 black4 green5 white6 orange2";

        // result: "blue orange gold black green white"

        System.out.println(renkSiralama(str));

        renkSiralama(str).toUpperCase();
        System.out.println(renkSiralama(str));
        String str2 = "ahme";
        str2.toUpperCase();
        System.out.println(str2);

      
    }

    public static String renkSiralama(String str) {

        String[] arr = str.split(" ");
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].charAt(arr[i].length() - 1) + arr[i];
        }

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i].replaceAll( arr[0-9], "");

        }

        //System.out.println(Arrays.toString(arr));

        String yeni = "";
        for (String each: arr) {
            yeni += each + " ";
        }

        return yeni;
    }


}
