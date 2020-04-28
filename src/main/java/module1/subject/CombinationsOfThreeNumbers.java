package module1.subject;

import java.util.Scanner;

//Задача 17 Написать программу, которая находит все комбинации из трех чисел до определенного предела, которые в сумме дают другое число.
// тест:  Предел для перебираемых чисел: 5, Искомая сумма: 10
// Вывод: 1 4 5 // 10
//       1 5 4 // 10
public class CombinationsOfThreeNumbers {
    public static void main(String[] args) {
        int limitNum,amountSought,sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Предел перебираемых чисел: ");
        limitNum=scan.nextInt();
        System.out.println("Искомая сумма");
        amountSought = scan.nextInt();
        for(int i =0 ; i<=limitNum;i++){
            for(int a = 0 ; a <= limitNum;a++){
                for(int b = 0; b <= limitNum;b++){
                    sum = i+a+b;
                    if(sum == amountSought){
                        System.out.println(i+" + " + a +" + "+ b +" = " + amountSought );
                    }
                }
            }

        }

    }
}
