package module1.subject;

import java.util.Scanner;
//Задача 9.1 Определить какое из трех, введенных пользователем, чисел минимальное и вывести его на экран.
public class MinNumber {
    public static void main(String[] args) {
        int     num1, num2, num3, min;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        num1 = scan.nextInt();

        System.out.println("Введите второе число");
        num2 = scan.nextInt();

        System.out.println("Введите трерье число");
        num3 = scan.nextInt();

        min = num1;

        if(min > num2) {
            min = num2;
        }
        if(min > num3)
        {
            min = num3;
        }
        System.out.println("Минимальное число: " + min);
    }
}
