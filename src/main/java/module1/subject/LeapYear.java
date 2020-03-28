package module1.subject;

import java.util.Scanner;
//Задача 5 Определить количество дней в году, который вводит пользователь. В високосном - 366 дней, в обычном 365.
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(;;){
            System.out.println("Какой год проверить?");

            int year = scan.nextInt();

            int leapInt = year % 4;

            int leapInt2 = year % 100;

            int leapInt3 = year % 400;

            if (leapInt < 1 & leapInt2 >= 1 || leapInt3 < 1){
                System.out.println(year + " год Високосный и имеет 366 дней");
            }else {
                System.out.println(year + " Невисокосный и имеет 365 дней");
            }
        }

    }
}
