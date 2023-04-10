package day44_maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C04_NestedMap {
    public static void main(String[] args) {

        /*
        Asagidaki body'yi map olarak olusturun
        {
            "firstname" : "Ahmet",
            "lastname" : “Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2021-06-01",
                   "checkout" : "2021-06-10"
                      },
            "additionalneeds" : "wi-fi" }
         */

        Map<String,Object> reqBody = new HashMap();

        reqBody.put("firstname","Burcu");
        reqBody.put("lastname","Sever");
        reqBody.put("totalprice","500");
        reqBody.put("depositpaid","false");

        Map<String,String> bookingdatesMapi = new HashMap();
        bookingdatesMapi.put("checkin","2021-06-01");
        bookingdatesMapi.put("checkout","2021-06-10");

        reqBody.put("bookingdates",bookingdatesMapi);
        reqBody.put("additionalneeds","wi-fi");

        System.out.println(reqBody);
        /* {firstname=Burcu,
         additionalneeds=wi-fi,
         bookingdates={
                      checkin=2021-06-01,
                      checkout=2021-06-10},
         totalprice=500,
         depositpaid=false,
         lastname=Sever}

         */

        // bu kullanicinin bilgilerini yazdirin

        System.out.println(reqBody.get("firstname")); // Burcu
        System.out.println(reqBody.get("lastname")); // Sever
        System.out.println(reqBody.get("totalprice")); // 500
        System.out.println(reqBody.get("depositpaid")); // false
        System.out.println(reqBody.get("additionalneeds")); // wi-fi

        // checkin ve checkout inner map' in icinde
        // mecburen once inner map' i, sonra onun icinden bilgileri alacagiz

        System.out.println(((Map) reqBody.get("bookingdates")).get("checkin")); // 2021-06-01
        System.out.println(((Map) reqBody.get("bookingdates")).get("checkout")); // 2021-06-10
        // map' e cast yapinca geldi

        // ismi Selcuk yapmak istersek

        reqBody.put("firstname","Selcuk");
        System.out.println(reqBody);

        // checkout' u 2021-06-17 yapalim

        bookingdatesMapi.put("checkout","2021-06-17");
        reqBody.put("bookingdates",bookingdatesMapi);
        System.out.println(reqBody);

    }
}
