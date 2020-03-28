package module1.subject;

import java.util.Scanner;
//Задача 7 Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
public class Triangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int side1,side2,side3;
        System.out.println("Введите сторону 1 ");
        side1 = scan.nextInt();

        System.out.println("Введите сторону 2 ");
        side2 = scan.nextInt();

        System.out.println("Введите сторону 3 ");
        side3 = scan.nextInt();

        if(side1+side2 > side3 & side1+side3 > side2 & side3+side2 > side1){
            System.out.println("Треугольник существует " );
        }else{
            System.out.println("Сумма 2 сторон треугольника меньше третьей");
        }

    }
}
