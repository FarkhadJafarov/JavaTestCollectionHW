package module2;

import java.util.Scanner;
//6. Найти индекс числа из массива
public class FindIndexMass {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        int     number;
        boolean bool = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Индекс какого числа вы хотите найти: ");
        number = scan.nextInt();

        for(int i = 0 ; i < num.length;i++){
            if(number == num[i] ){
                System.out.println("Индекс числа " + number + " : " +i);
                bool = true;
            }

        }
        if(bool == false){
            System.out.println("Не найдено  число в массиве");
        }
    }
}
