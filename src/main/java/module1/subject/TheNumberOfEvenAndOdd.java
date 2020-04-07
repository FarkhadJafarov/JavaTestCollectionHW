package module1.subject;

import java.util.Scanner;

//Задача 11.1 Написать программу, подсчитывающую количество четных и нечетных цифр в числе.
public class TheNumberOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int forEven = 0 ,
            forOdd = 0;

        System.out.println("Введите число от 1 до 1000");
        int num = scan.nextInt();
        if(num >= 1 || num <= 1000){
        while(num > 0) {

            if (num%2==0)
            {
                forEven++;
            }
            else {
                forOdd++;
            }
            num /= 10;
        }
        System.out.println("Четных "+ forEven +"\n Нечетных"+ forOdd);

        }else{
            System.out.println("Написанное вами число не находится в диапазоне от 1 до 1000");
        }



    }
}
