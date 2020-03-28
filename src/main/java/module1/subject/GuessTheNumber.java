package module1.subject;

import java.util.Scanner;
import sun.text.normalizer.UCharacter;

//Задача 4. Угадать число, которое загадал пользователь, используя if-else.
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*for (int i = 0; i <= 110; i++) {
            System.out.println("Загадайте в уме число от 1 до 10");

            System.out.println("Ваше число  0? (y/n) ");

            String str1 = scan.next();

            char   c1   = str1.charAt(0);

            if (str1.equals("y")) {
                System.out.println("Ваше число 0");
            } else if (str1.equals("n")) {
                System.out.println("Ваше число 1?(y/n)");
                str1 = scan.next();
                if (str1.equals('y')) {
                    System.out.println("Ваше число 1");
                } else if (str1.equals("n")) {
                    System.out.println("Ваше число 2?(y/n)");
                    str1 = scan.next();
                    if (str1.equals('y')) {
                        System.out.println("Ваше число 2");
                    } else if (str1.equals("n")) {
                        System.out.println("Ваше число 3?(y/n)");
                        str1 = scan.next();
                        if (str1.equals('y')) {
                            System.out.println("Ваше число 3");
                        } else if (str1.equals("n")) {
                            System.out.println("Ваше число 4?(y/n)");
                            str1 = scan.next();
                            if (str1.equals('y')) {
                                System.out.println("Ваше число 4");
                            } else if (str1.equals("n")) {
                                System.out.println("Ваше число 5?(y/n)");
                                str1 = scan.next();
                                if (str1.equals('y')) {
                                    System.out.println("Ваше число 5");
                                } else if (str1.equals("n")) {
                                    System.out.println("Ваше число 6?(y/n)");
                                    str1 = scan.next();
                                    if (str1.equals('y')) {
                                        System.out.println("Ваше число 6");
                                    } else if (str1.equals("n")) {
                                        System.out.println("Ваше число 7?(y/n)");
                                        str1 = scan.next();
                                        if (str1.equals('y')) {
                                            System.out.println("Ваше число 7");
                                        } else if (str1.equals("n")) {
                                            System.out.println("Ваше число 8?(y/n)");
                                            str1 = scan.next();
                                            if (str1.equals('y')) {
                                                System.out.println("Ваше число 8");
                                            } else if (str1.equals("n")) {
                                                System.out.println("Ваше число 9?(y/n)");
                                                str1 = scan.next();
                                                if (str1.equals('y')) {
                                                    System.out.println("Ваше число 9");
                                                } else if (str1.equals("n")) {
                                                    System.out.println("Ваше число 10?(y/n)");
                                                    str1 = scan.next();
                                                    if (str1.equals('y')) {
                                                        System.out.println("Ваше число 10");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }else {
                System.out.println("Можно вводить только  буквы y/n");
                i++;
            }

        }*/
        System.out.println("Загадайте в уме число от 1 до 10");
        for (int i = 0; i <= 10; ){
            System.out.println("Ваше число  " +i + "? (y/n) ");
            String str1 = scan.next();
            if(str1.equals("n")){
                i++;
            }else if(str1.equals("y")){
                System.out.println("Ваше число  " +i );
                i=0;
            }else if (str1.length()>=2){
                System.out.println("Можно вводить только  буквы y/n");
                i+=0;
            }
        }
    }
}