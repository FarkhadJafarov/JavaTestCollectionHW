package module1.subject;

import java.util.Scanner;

//Задача 15 Вывести все квадраты натуральных чисел, не превосходящие данного числа N.
// Пример: N=50 | 1 4 9 16 25 36 49
public class SquaresOfNatural {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int num = scan.nextInt();
        int i = 1;

        while(i*i < num){
            System.out.println((i *i++));
        }
    }
}
