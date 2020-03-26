package module1.subject;

import java.util.Scanner;

//Задача 3.1 (Scanner) Из введенных чисел с разной четностью, вывести на экран сколько четных и сколько нечетных чисел было введено.
// Пользователь вводит четные / нечетные числа. Последовательность их ввода может быть любой.
// *Пользователь не может ввести меньше 2 чисел, в противном случае выводить об этом сообщение.
public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i1,i2;

        for(;;){
            try{
                i1=scan.nextInt();
                i2=scan.nextInt();
                if(i1%2!=0 & i2%2!=0) {
                    System.out.println("Нечетных 2 \n Четных 0");
                }else if (i1%2!=0 || i2%2!=0 ) {
                    System.out.println("Нечетных 1 \n Четных 1");
                }else if (i1%2==0 & i2%2==0){
                    System.out.println("Нечетных 0 \n Четных 2");
                }


            }catch (Exception exc){
                System.out.println("Вы ввели не число");
                break;
            }

            }
        }
    }


