package module1.subject;
//Задача 12 Написать метод вычисляющий и возвращающий факториал числа. тест: 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вычисляем факториал числа ?(Введите число) ");
        int number=scan.nextInt();
        int result = 1;
        for (int i = 1; i <=number; i ++){
            result = result*i;
        }
        System.out.println(result);

}
}
