package module1.subject;

import java.util.Scanner;

//Задача 15 Вывести все квадраты натуральных чисел, не превосходящие данного числа N.
// Пример: N=50 | 1 4 9 16 25 36 49
public class SquaresOfNatural {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int y = 1;

        while(y*y < num){
            System.out.println((y *y++));
        }
    }
}
