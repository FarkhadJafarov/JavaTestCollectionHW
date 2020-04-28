package module2;

import java.util.Scanner;

//1.   Найти максимальное значение из массива
public class MaxArrayValue {
    public static void main(String[] args) {
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
            if(max <= num[i]){
                max = num[i];
                System.out.println(max);
            }
        }
        System.out.println("Максимальное значение массива : " + max);

    }
}
