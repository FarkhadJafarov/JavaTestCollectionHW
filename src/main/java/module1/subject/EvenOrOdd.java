package module1.subject;

import java.util.Scanner;

//Задача 10 Пользователь вводит число любой длины. Определить четное или нечетное число.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        for(;;){
            try{
                num = scan.nextInt();

                if(num %2!=0) {
                    System.out.println("Нечетное , остаток : " +num%2);
                }else {
                    System.out.println("Четное ");
                }


            }catch (Exception exc){
                System.out.println("Вы ввели не число");
                break;
            }
        }
    }
}

