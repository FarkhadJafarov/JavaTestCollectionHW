package module2;

import java.util.Arrays;

//Переставить в массиве четные в начало (по возростанию), потом нечетные (по убыванию), а нули в конец массива
public class RearrangeEvenOnes {
    public static void main(String[] args) {

        int[] num = {6,5,8,4,0,1,7,3,9,2};

        for(int i = 1; i < num.length; i++){
            for(int j = 0; j < num.length -i; j++){
                if(num[j+1] % 2 != 0 && num[j] < num[j+1] && num[j] %2 != 0){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    System.out.println(Arrays.toString(num));
                }else if(num[j+1] %2 != 0 && num[j] %2 == 0){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    System.out.println(Arrays.toString(num));
                }
                if(num[j+1] % 2 == 0 && num[j] > num[j+1] && num[j] %2 == 0){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    System.out.println(Arrays.toString(num));
                }else if(num[j+1] %2 == 0 && num[j] %2 != 0){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    System.out.println(Arrays.toString(num));
                }

                if(num[j] == 0){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(num));

    }
}
