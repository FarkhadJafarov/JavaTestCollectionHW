package module1.subject;

import java.util.Scanner;

//Задача 3: Из двух чисел с разной четностью, вывести на экран нечетное число. Пользователь вводит четное и нечетное число.
//Последовательность их ввода может быть любой. *Пользователь не может ввести меньше 2 чисел, в противном случае выводить об этом сообщение.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        for(;;){
            System.out.println("Введите 2 числа");
            int i1,i2 ;
            try{
                i1 = scan.nextInt();
                i2 = scan.nextInt();

                if(i1%2!=0 || i2%2!=0){
                    if(i1%2!=0){
                        System.out.println("Нечетное число " + i1);
                    }
                    if(i2%2!=0){
                        System.out.println("Нечетное число " + i2);
                    }
                }else {
                    System.out.println("Нечетных чисел среди них нету");
                }

            } catch (Exception exc){
                System.out.println("Вы ввели не число");
            }
        }
        //преобразовать int в char
//        int i5 = scan.nextInt()11;
//        String mystr = String.valueOf(i5);
//        char mychr = mystr.charAt(0);
//        System.out.println(mychr);


    }
}
