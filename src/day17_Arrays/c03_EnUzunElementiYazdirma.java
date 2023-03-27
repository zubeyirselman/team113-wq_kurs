package day17_Arrays;

public class c03_EnUzunElementiYazdirma {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr1 = {"Melike", "Burkay", "inci", "Eda", "Emre"};
        enUzunEnKisaYazdir(arr1); // melike, eda



    }

    public static void enUzunEnKisaYazdir(String[] arr) {
        String enUzunKelime = arr[0];
        String enKisaKelime = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > enUzunKelime.length()) {
                enUzunKelime = arr[i];
            }

            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }
        }

        System.out.println("Array' deki en uzun kelime: " + enUzunKelime);
        System.out.println("Array' deki en kisa kelime: " + enKisaKelime);

    }


}
