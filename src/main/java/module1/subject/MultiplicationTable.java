package module1.subject;
//Задача 16 Построить таблицу умножения и выведите в консоль посредством вложенных циклов >:o.
// (вид должен быть как на школьной тетрадке =) ) Используйте форматированием строк для красивого вывода.
public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            for(int k = 1; k <= 10; k++){

                System.out.print(" " + i + ")" + k + " * " + i + " = " + k*i);
            }
            System.out.println("");
        }
    }
}
