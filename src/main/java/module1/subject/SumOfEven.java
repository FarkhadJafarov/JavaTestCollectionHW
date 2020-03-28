package module1.subject;

import java.util.Scanner;
//Задача 11 Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
// тест: при вводе числа ""1474"" на выходе получим ""8"", так как четными являются лишь две цифры ""4"".
public class SumOfEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,sumEven,even;
        num = scan.nextInt();
        sumEven = 0;
        do{
            even = num % 10;
            num = num / 10;
            if(even%2==0){
                sumEven= sumEven + even;

            }

        }while (num!=0);
        System.out.println(sumEven);
    }
}
