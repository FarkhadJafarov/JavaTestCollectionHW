package module1.subject;

import java.util.Scanner;
//Задача 6 Определить, кратно ли заданное число трем; если нет, вывести остаток.
public class MultipleNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for (;;){

            try {
                double number = scan.nextDouble();
                if (number % 3!= 0){
                    System.out.println("Число не кратное 3 ,остаток : " + number % 3);
                }else {
                    System.out.println("Число кратно 3");
                }
            }catch (Exception excp){
                System.out.println("Это не число");
                break;
            }

        }
    }
}
