import java.util.Random;
import java.util.Scanner;

/*
2. Написать программу проверки умения складывать и вычитать
числа в пределах 100. Программа должна вывести 10 примеров,
причем в каждом примере уменьшаемое должно быть больше или
равно вычитаемому, т. е. не допускается предлагать испытуемому
примеры с отрицательным результатом. Оценка выставляется по
следующему правилу: за 10 правильных ответов — "отлично",
за 9 и 8 — "хорошо", за 7 и 6 — "удовлетворительно", за 6 и ме-
нее — "плохо". Ниже приведен рекомендуемый вид экрана про-
граммы.
Проверка умения складывать и вычитать числа.
После примера введите ответ и нажмите <Enter>
75-4=71
35-9=29
Вы ошиблись! 35-9=26
14-1=13
6-5=1
37-19=28
Вы ошиблись! 37-19=18
53-14=39
94-87=7
90-16=74
4-2=2
89-41=48
Правильных ответов: 8
Оценка: Хорошо
*/
public class Task2 {
    public static int additionSubtraction(Scanner scanner) {
        Random rnd = new Random();
        int addorsub = rnd.nextInt(2);
        int one = rnd.nextInt(100) + 1;
        int two;
        if(addorsub == 0){
            two = rnd.nextInt(one) + 1;
            System.out.print(one + "-" + two + "=");
        }
        else {
            two = rnd.nextInt(100);
            System.out.print(one + "+" + two + "=");
        }
        int result = scanner.nextInt();
        if (addorsub == 0 && result != one - two){
            System.out.println("Вы ошиблись! " + one + "-" + two + "=" + (one - two));
            return(0);
        }
        else if(addorsub == 0 && result == one - two) {
            return(1);
        }
        if(result != one + two){
            System.out.println("Вы ошиблись! " + one + "+" + two + "=" + (one + two));
            return(0);
        }
        else {
            return(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        for(int i = 0; i < 10; i++){
            num += additionSubtraction(scanner);
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