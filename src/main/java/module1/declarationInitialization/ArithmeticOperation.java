package module1.declarationInitialization;

public class ArithmeticOperation {

    public static void main(String[] args) {
        // работа с int
        int i1 = 5;
        int i2 = i1 + 2;
        int i3 = i1 * 2;
        int i4 = i1 % 2;
        System.out.println("Сложение(i2) i1 + 2 = " + i2 + "\nУмножение(i3) i1 * 2 = " + i3 + "\nДеление по модулю(i4) i1 % 2 = " + i4 );

        // работа с long
        long l1 = 987;
        long l2 = l1%100;//9.87 где 87 остаток
        long l3 = l1/2;
        System.out.println(l2);
        System.out.println(l3);
    }
}
