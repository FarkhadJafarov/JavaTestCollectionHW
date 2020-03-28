package module1.subject;

import java.util.Scanner;
//Задача 8 (switch-case) Возрастная категория. Пользователь вводит число от 1 до 100.
// Разбить 100 летний отрезок по 10 лет образно обозначив их
public class AgeCategory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        String strAge = String.valueOf(age);

        switch (strAge){
            case  "0" : System.out.println("юнец"); break;
            case  "1": System.out.println("юнец"); break;
            case  "2": System.out.println("юнец"); break;
            case  "3" : System.out.println("юнец"); break;
            case  "4" : System.out.println("юнец"); break;
            case  "5" : System.out.println("юнец"); break;
            case  "6" : System.out.println("юнец"); break;
            case  "7" : System.out.println("юнец"); break;
            case  "8" : System.out.println("юнец"); break;
            case  "9" : System.out.println("юнец"); break;
            case "10" : System.out.println("юнец"); break;
            case  "11" : System.out.println("молодой"); break;
            case  "12" : System.out.println("молодой"); break;
            case  "13" : System.out.println("молодой"); break;
            case  "14" : System.out.println("молодой"); break;
            case  "15" : System.out.println("молодой"); break;
            case  "16" : System.out.println("молодой"); break;
            case  "17" : System.out.println("молодой"); break;
            case  "18" : System.out.println("молодой"); break;
            case  "19" : System.out.println("молодой"); break;
            case  "20" : System.out.println("молодой"); break;
            case  "21" : System.out.println("здоровый"); break;
            case  "22" : System.out.println("здоровый"); break;
            case  "23" : System.out.println("здоровый"); break;
            case  "24" : System.out.println("здоровый"); break;
            case  "25" : System.out.println("здоровый"); break;
            case  "26" : System.out.println("здоровый"); break;
            case  "27" : System.out.println("здоровый"); break;
            case  "28" : System.out.println("здоровый"); break;
            case  "29" : System.out.println("здоровый"); break;
            case  "30" : System.out.println("здоровый"); break;
            case  "31" : System.out.println("в возрасте"); break;
            case  "32" : System.out.println("в возрасте"); break;
            case  "33" : System.out.println("в возрасте"); break;
            case  "34" : System.out.println("в возрасте"); break;
            case  "35" : System.out.println("в возрасте"); break;
            case  "36" : System.out.println("в возрасте"); break;
            case  "37" : System.out.println("в возрасте"); break;
            case  "38" : System.out.println("в возрасте"); break;
            case  "39" : System.out.println("в возрасте"); break;
            case  "40" : System.out.println("в возрасте"); break;
            case  "41" : System.out.println("стареешь"); break;
            case  "42" : System.out.println("стареешь"); break;
            case  "43" : System.out.println("стареешь"); break;
            case  "44" : System.out.println("стареешь"); break;
            case  "45" : System.out.println("стареешь"); break;
            case  "46" : System.out.println("стареешь"); break;
            case  "47" : System.out.println("стареешь"); break;
            case  "48" : System.out.println("стареешь"); break;
            case  "49" : System.out.println("стареешь"); break;
            case  "50" : System.out.println("стареешь"); break;
            case  "51" : System.out.println("старик"); break;
            case  "52" : System.out.println("старик"); break;
            case  "53" : System.out.println("старик"); break;
            case  "54" : System.out.println("старик"); break;
            case  "55" : System.out.println("старик"); break;
            case  "56" : System.out.println("старик"); break;
            case  "57" : System.out.println("старик"); break;
            case  "58" : System.out.println("старик"); break;
            case  "59" : System.out.println("старик"); break;
            case  "60" : System.out.println("старик"); break;
            case  "61" : System.out.println("старый дед"); break;
            case  "62" : System.out.println("старый дед"); break;
            case  "63" : System.out.println("старый дед"); break;
            case  "64" : System.out.println("старый дед"); break;
            case  "65" : System.out.println("старый дед"); break;
            case  "66" : System.out.println("старый дед"); break;
            case  "67" : System.out.println("старый дед"); break;
            case  "68" : System.out.println("старый дед"); break;
            case  "69" : System.out.println("старый дед"); break;
            case  "70" : System.out.println("старый дед"); break;
            case  "71" : System.out.println("дедуля"); break;
            case  "72" : System.out.println("дедуля"); break;
            case  "73" : System.out.println("дедуля"); break;
            case  "74" : System.out.println("дедуля"); break;
            case  "75" : System.out.println("дедуля"); break;
            case  "76" : System.out.println("дедуля"); break;
            case  "77" : System.out.println("дедуля"); break;
            case  "78" : System.out.println("дедуля"); break;
            case  "79" : System.out.println("дедуля"); break;
            case  "80" : System.out.println("мало остаось"); break;
            case  "81" : System.out.println("мало остаось"); break;
            case  "82" : System.out.println("мало остаось"); break;
            case  "83" : System.out.println("мало остаось"); break;
            case  "84" : System.out.println("мало остаось"); break;
            case  "85" : System.out.println("мало остаось"); break;
            case  "86" : System.out.println("мало остаось"); break;
            case  "87" : System.out.println("мало остаось"); break;
            case  "88" : System.out.println("мало остаось"); break;
            case  "89" : System.out.println("мало остаось"); break;
            case  "90" : System.out.println("мало остаось"); break;
            case  "91" : System.out.println("столько не живут"); break;
            case  "92" : System.out.println("столько не живут"); break;
            case  "93" : System.out.println("столько не живут"); break;
            case  "94" : System.out.println("столько не живут"); break;
            case  "95" : System.out.println("столько не живут"); break;
            case  "96" : System.out.println("столько не живут"); break;
            case  "97" : System.out.println("столько не живут"); break;
            case  "98" : System.out.println("столько не живут"); break;
            case  "99" : System.out.println("столько не живут"); break;
            case  "100" : System.out.println("столько не живут"); break;
            default:
                System.out.println("Надо вводить от 0 до 100"); break;
        }
    }
}
