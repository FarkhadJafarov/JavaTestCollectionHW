package module1.subject;
//Задача 13 Написать метод вычисляющий все простые числа от 1 до числа введенного пользователем.
// Дополнительно вывести сумму всех найденных простых чисел.
//////////////////////////In Progress//////////////////////////
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 50;
        int sum = 0;
        boolean b = true;
        Scanner scan = new Scanner(System.in);
        for(int i = 2;i <= number;i++){

                for (int y =2 ; y < i/2;y++){
                    if(i % y != 0){
                        System.out.println(i);
                    }
                }



        }

    }
}
