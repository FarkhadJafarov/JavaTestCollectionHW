package module1.subject;

import java.util.Scanner;
//Задача 9 Определить какое из трех, введенных пользователем, чисел максимальное и вывести его на экран.
public class MaxNumber {
    public static void main(String[] args) {
        int    num1, num2, num3,max;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        num1 = scan.nextInt();

        System.out.println("Введите второе число");
        num2 = scan.nextInt();

        System.out.println("Введите трерье число");
        num3 = scan.nextInt();

        max = num1;

        if(max < num2) {
            max = num2;
        }
        if(max < num3)
        {
            max = num3;
        }
        System.out.println("Maкс число: " + max);
    }
}
