package com.example.drupp_driver.Utils;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class CountryCodes {

    private static CountryCodes countryCodes;
    public static Map<String, String> country2phone;
    CountryCodes(){
        country2phone = new HashMap<String, String>();
        generateCountryCodes();
    }
    public static CountryCodes getCountryCodes(){
        if(countryCodes==null){
            countryCodes=new CountryCodes();
        }
        return countryCodes;

    }


    public static void generateCountryCodes() {
        if (country2phone.size() == 0) {
            Log.d("CountryCodes","Codes generated");
            country2phone.put( "+93","AF");
            country2phone.put( "+355","AL");
            country2phone.put("+213","DZ");
            country2phone.put("+376","AD" );
            country2phone.put( "+244","AO");
            country2phone.put( "+1-268","AG");
            country2phone.put( "+54","AR");
            country2phone.put( "+374","AM");
            country2phone.put( "+61","AU");
            country2phone.put( "+43","AT");
            country2phone.put( "+994","AZ");
            country2phone.put( "+1-242","BS");
            country2phone.put( "+973","BH");
            country2phone.put( "+880","BD");
            country2phone.put( "+1-246","BB");
            country2phone.put( "+375","BY");
            country2phone.put( "+32","BE");
            country2phone.put( "+501","BZ");
            country2phone.put("+229","BJ");
            country2phone.put("+975","BT");
            country2phone.put("+591","BO");
            country2phone.put("+387","BA");
            country2phone.put("+267","BW");
            country2phone.put("+55","BR");
            country2phone.put("+673","BN");
            country2phone.put("+359","BG");
            country2phone.put("+226","BF");
            country2phone.put("+257","BI");
            country2phone.put("+855","KH");
            country2phone.put("+237","CM");
            country2phone.put("+1","CA");
            country2phone.put("+238","CV");
            country2phone.put("+236","CF");
            country2phone.put("+235","TD");
            country2phone.put("+56","CL");
            country2phone.put("+86","CN");
            country2phone.put("+57","CO");
            country2phone.put("+269","KM");
            country2phone.put("+243","CD");
            country2phone.put("+242","CG");
            country2phone.put("+506","CR");
            country2phone.put("+225","CI");
            country2phone.put("+385","HR");
            country2phone.put("+53","CU");
            country2phone.put("+357","CY");
            country2phone.put("+420","CZ");
            country2phone.put("+45","DK");
            country2phone.put("+253","DJ");
            country2phone.put("+1-767","DM");
            country2phone.put("+1-809and1-829","DO");
            country2phone.put("+593","EC");
            country2phone.put("+20","EG");
            country2phone.put("+503","SV");
            country2phone.put("+240","GQ");
            country2phone.put("+291","ER");
            country2phone.put("+372","EE");
            country2phone.put("+251","ET");
            country2phone.put("+679","FJ");
            country2phone.put("+358","FI");
            country2phone.put("+33","FR");
            country2phone.put("+241","GA");
            country2phone.put("+220","GM");
            country2phone.put("+995","GE");
            country2phone.put("+49","DE");
            country2phone.put("+233","GH");
            country2phone.put("+30","GR");
            country2phone.put("+1-473","GD");
            country2phone.put("+502","GT");
            country2phone.put("+224","GN");
            country2phone.put("+245","GW");
            country2phone.put("+592","GY");
            country2phone.put("HT","+509");
            country2phone.put("+504","HN");
            country2phone.put("+36","HU");
            country2phone.put("+354","IS");
            country2phone.put("+91","IN");
            country2phone.put("+62","ID");
            country2phone.put("+98","IR");
            country2phone.put("+964","IQ");
            country2phone.put("+353","IE");
            country2phone.put("+972","IL");
            country2phone.put("+39","IT");
            country2phone.put("+1-876","JM");
            country2phone.put("+81","JP");
            country2phone.put("+962","JO");
            country2phone.put("+7","KZ");
            country2phone.put("+254","KE");
            country2phone.put("+686","KI");
            country2phone.put("+850","KP");
            country2phone.put("+82","KR");
            country2phone.put("+965","KW");
            country2phone.put("+996","KG");
            country2phone.put("+856","LA");
            country2phone.put("+371","LV");
            country2phone.put("+961","LB");
            country2phone.put("+266","LS");
            country2phone.put("+231","LR");
            country2phone.put("+218","LY");
            country2phone.put("+423","LI");
            country2phone.put("+370","LT");
            country2phone.put("+352","LU");
            country2phone.put("+389","MK");
            country2phone.put("+261","MG");
            country2phone.put("+265","MW");
            country2phone.put("+60","MY");
            country2phone.put("+960","MV");
            country2phone.put("+223","ML");
            country2phone.put("+356","MT");
            country2phone.put("+692","MH");
            country2phone.put("+222","MR");
            country2phone.put("+230","MU");
            country2phone.put("+52","MX");
            country2phone.put("+691","FM");
            country2phone.put("+373","MD");
            country2phone.put("+377","MC");
            country2phone.put("+976","MN");
            country2phone.put("+382","ME");
            country2phone.put("+212","MA");
            country2phone.put("+258","MZ");
            country2phone.put("+95","MM");
            country2phone.put("+264","NA");
            country2phone.put("+674","NR");
            country2phone.put("+977","NP");
            country2phone.put("+31","NL");
            country2phone.put("+64","NZ");
            country2phone.put("+505","NI");
            country2phone.put("+227","NE");
            country2phone.put("+234","NG");
            country2phone.put("+47","NO");
            country2phone.put("+968","OM");
            country2phone.put("+92","PK");
            country2phone.put("+680","PW");
            country2phone.put("+507","PA");
            country2phone.put("+675","PG");
            country2phone.put("+595","PY");
            country2phone.put("+51","PE");
            country2phone.put("+63","PH");
            country2phone.put("+48","PL");
            country2phone.put("+351","PT");
            country2phone.put("+974","QA");
            country2phone.put("+40","RO");
            country2phone.put("+7","RU");
            country2phone.put("+250","RW");
            country2phone.put("+1-869","KN");
            country2phone.put("+1-758","LC");
            country2phone.put("+1-784","VC");
            country2phone.put("+685","WS");
            country2phone.put("+378","SM");
            country2phone.put("+239","ST");
            country2phone.put("+966","SA");
            country2phone.put("+221","SN");
            country2phone.put("+381","RS");
            country2phone.put("+248","SC");
            country2phone.put("+232","SL");
            country2phone.put("+65","SG");
            country2phone.put("+421","SK");
            country2phone.put("+386","SI");
            country2phone.put("+677","SB");
            country2phone.put("+252","SO");
            country2phone.put("+27","ZA");
            country2phone.put("+34","ES");
            country2phone.put("+94","LK");
            country2phone.put("+249","SD");
            country2phone.put("+597","SR");
            country2phone.put("+268","SZ");
            country2phone.put("+46","SE");
            country2phone.put("+41","CH");
            country2phone.put("+963","SY");
            country2phone.put("+992","TJ");
            country2phone.put("+255","TZ");
            country2phone.put("+66","TH");
            country2phone.put("+670","TL");
            country2phone.put("+228","TG");
            country2phone.put("+676","TO");
            country2phone.put("+1-868","TT");
            country2phone.put("+216","TN");
            country2phone.put("+90","TR");
            country2phone.put("+993","TM");
            country2phone.put("+688","TV");
            country2phone.put("+256","UG");
            country2phone.put("+380","UA");
            country2phone.put("+971","AE");
            country2phone.put("+44","GB");
            country2phone.put("+1","US");
            country2phone.put("+598","UY");
            country2phone.put("+998","UZ");
            country2phone.put("+678","VU");
            country2phone.put("+379","VA");
            country2phone.put("+58","VE");
            country2phone.put("+84","VN");
            country2phone.put("+967","YE");
            country2phone.put("+260","ZM");
            country2phone.put("+263","ZW");
            country2phone.put("+886","TW");
            country2phone.put("+61","CX");
            country2phone.put("+61","CC");
            country2phone.put("+672","NF");
            country2phone.put("+687","NC");
            country2phone.put("+689","PF");
            country2phone.put("+262","YT");
            country2phone.put("+508","PM");
            country2phone.put("+681","WF");
            country2phone.put("+682","CK");
            country2phone.put("+683","NU");
            country2phone.put("+690","TK");
            country2phone.put("+44","GG");
            country2phone.put("+44","IM");
            country2phone.put("+44","JE");
            country2phone.put("+1-264","AI");
            country2phone.put("+1-441","BM");
            country2phone.put("+246","IO");
            country2phone.put("+357","CY");
            country2phone.put("VG","+1-284");
            country2phone.put( "+1-345","KY");
            country2phone.put("+500","KY");
            country2phone.put("+350","GI");
            country2phone.put("+1-664","MS");
            country2phone.put("+290","SH");
            country2phone.put("+1-649","TC");
            country2phone.put("+1-670","MP");
            country2phone.put("+1-787","PR");
            country2phone.put("+1-939","PR");
            country2phone.put("+1-684","AS");
            country2phone.put("+1-671","GU");
            country2phone.put("+1-340","VI");
            country2phone.put("+852","HK");
            country2phone.put("+853","MO");
            country2phone.put("+298","FO");
            country2phone.put("+299","GL");
            country2phone.put("+594","GF");
            country2phone.put("+590","GP");
            country2phone.put("+596","MQ");
            country2phone.put("+262","RE");
            country2phone.put("+358-18","AX");
            country2phone.put("+297","AW");
            country2phone.put("+599","AN");
            country2phone.put("+47","SJ");
            country2phone.put("+247","AC");
            country2phone.put("+290","TA");
            country2phone.put("+381","CS");
            country2phone.put("+970","PS");
            country2phone.put("+212","EH");
        }
    }
}
