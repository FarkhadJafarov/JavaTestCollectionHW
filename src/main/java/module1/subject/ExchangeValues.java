package module1.subject;

import java.util.Scanner;

//Задача 2: Обменять значения двух переменных, используя третью (буферную) переменную.
public class ExchangeValues {
    public static void main(String[] args) {
        int i1,i2,i3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число i1");
        i1=scan.nextInt();
        System.out.println("Введите число i2");
        i2=scan.nextInt();
        System.out.println("Получилось i1 = " + i1 + ", i2 = " + i2);
        i3 = i1;
        i1 = i2;
        i2 = i3;

        System.out.println("Стало i1 = " + i1 + ", i2 = " + i2);
    }
}
