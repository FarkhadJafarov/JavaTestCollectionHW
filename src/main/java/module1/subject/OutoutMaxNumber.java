package module1.subject;

import java.util.Scanner;
//Задача 1: Определить какое из трех, введенных пользователем, чисел максимальное и вывести его на экран.
public class OutoutMaxNumber {
    public static void main(String[] args) {
        //создаем 3 переменные
        int i1,i2,i3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        i1 = scan.nextInt();

        System.out.println("Введите второе число");
        i2 = scan.nextInt();

        System.out.println("Введите трерье число");
        i3 = scan.nextInt();

        if(i1 > i2 & i1 > i3 ) {
            System.out.println(i1);
        }else if(i2 > i1 & i2 > i3)
        {
            System.out.println(i2);
        }else if(i3 > i1 & i3 > i2)
        {
            System.out.println(i3);
        }

    }
}
