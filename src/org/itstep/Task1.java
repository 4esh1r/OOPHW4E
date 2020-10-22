package org.itstep;
import java.util.Random;
import java.util.Scanner;

/*1. Написать программу проверки знания таблицы умножения.
Программа должна вывести 10 примеров и выставить оценку: за
10 правильных ответов — "отлично", за 9 и 8 — "хорошо", за 7 и
6 — "удовлетворительно", за 6 и менее — "неудовлетворитель-
но". Ниже приведен рекомендуемый вид экрана программы.
*** Проверка знания таблицы умножения ***
После примера введите ответ и нажмите <Enter>.
5x3=15
7х7=49
1х4=4
4х3=12
9х4=36
8х8=64
7х8=52
Вы ошиблись! 7х8=56
4х7=28
3х5=15
2х5=10
Правильных ответов: 9
Оценка: Хорошо.*/

public class Task1 {

    public static int multTable(Scanner scanner) {
        Random rnd = new Random();
        int one = rnd.nextInt(9) + 1;
        int two = rnd.nextInt(9) + 1;
        System.out.print(one + "x" + two + "=");
        int result = scanner.nextInt();
        if (result != one * two){
            System.out.println("Вы ошиблись! " + one + "x" + two + "=" + one * two);
            return(0);
        }
        else{
            return(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        for(int i = 0; i < 10; i++){
            num += multTable(scanner);
        }
        System.out.println("Правильных ответов: " + num);
        System.out.print("Оценка:");
        if (num == 10){
            System.out.println("Отлично");
        }
        else if (num > 7){
            System.out.println("Хорошо");
        }
        else if(num > 5){
            System.out.println("Удовлетворительно");
        }
        else{
            System.out.println("Неудовлетворительно");
        }
    }
}