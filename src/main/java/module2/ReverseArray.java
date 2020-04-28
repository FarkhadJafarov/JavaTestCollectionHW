package module2;

import java.util.Arrays;
import java.util.Scanner;

//Перестановка элементов массива в обратном порядке
public class ReverseArray {
    public static void main(String[] args){

        int quantity;
        int[] num ;
        int max = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество значений которое хотите записать в массив");
        quantity = scan.nextInt();

        num = new int[quantity];

        for(int i = 0; i < quantity; i++){
            System.out.println("Введите значение " + i + " индекса");
            num[i] = scan.nextInt();
        }

        System.out.println("Ваш массив : " + Arrays.toString(num));

        for (int i = 0, a = num.length - 1; a < num.length / 2; i++, a--)
        {
            int tmp = num[i];
            num[i] = num[a];
            num[a] = tmp;
        }
        System.out.println("Reverse Вашего  массива : " + Arrays.toString(num));

    }
}
