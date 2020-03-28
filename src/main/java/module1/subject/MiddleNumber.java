package module1.subject;

import java.util.Scanner;
//Задача 9.2 Пользователь вводит от 2 чисел и больше (проверочка)
//- вывести минимальное на экран.
//- вывести максимальное на экран.+
//- вывести сумму всех чисел на экран.
//- вывести среднее значение чисел на экран.
public class MiddleNumber {
    public static void main(String[] args) {
        int     num1, num2, num3, max,min,average,sum;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Введите первое число");
            num1 = scan.nextInt();

            System.out.println("Введите второе число");
            num2 = scan.nextInt();

            System.out.println("Введите трерье число");
            num3 = scan.nextInt();

            max = num1;
            min = num1;

            //максимальное число
            if(max < num2) {
                max = num2;
            }
            if(max < num3){
                max = num3;
            }
            //минимальное число
            if(min > num2) {
                min = num2;
            }
            if(min > num3){
                min = num3;
            }
            //сумма всех чисел
            sum = num1+num2+num3;
            //среднее число
            average = (num1+num2+num3) / 3;

            System.out.println(
                "Maкс число: " + max +
                    "\nМини число: " + min +
                    "\nCуммa всех чисел: " + sum +
                    "\nCреднее значение: " + average
            );
        }catch (Exception excp){
            System.out.println("Это не число");
        }


    }
}
