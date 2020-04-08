package module1.subject;

import java.util.Scanner;

//Задача 14 Дано число. Найти сумму и произведение его цифр.
public class SummAndProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0,
            product = 1,
            balance;
        System.out.println("Введите число");
        int num = scan.nextInt();
        do{
            balance = num % 10;
            sum = sum + balance;
            product = product*balance;
            num = num / 10;

        }while(num!=0);
        System.out.println("Cумма цифр : " + sum+ "" +
            "\nПроизведение цифр : " +product );
    }
}
