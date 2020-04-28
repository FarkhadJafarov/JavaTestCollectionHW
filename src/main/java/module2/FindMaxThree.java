package module2;
//2.   Найти три наибольших числа из массива
public class FindMaxThree {
    public static void main(String[] args) {
        int maxNum1 = 2,
            maxNum2 = 2,
            maxNum3 = 2,
            element = 0;

        int[] num = {1,7,4,6,5,8,3,2,3,4,7};

        for(int i = 0 ; i < num.length; i++){
            if(num[i] > maxNum1 & num[i] > maxNum2 & num[i] > maxNum3 ){
                element = maxNum2;
                maxNum2 = maxNum3;
                maxNum1 = element;
                maxNum3 = num[i];
            }else if(num[i] > maxNum1 & num[i] > maxNum2 & num[i] < maxNum3){
                element = maxNum2;
                maxNum1 = element;
                maxNum2 = num[i];
            }else if(num[i] > maxNum1 & num[i] < maxNum2 & num[i] < maxNum3){
                maxNum1 = num[i];
            }

        }
        System.out.println(maxNum1+""+maxNum2+""+maxNum3);
    }
}
