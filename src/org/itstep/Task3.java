import java.util.Scanner;

/*
3. Написать программу, которая выводит на экран таблицу со-
        ответствия температуры в градусах Цельсия и Фаренгейта
        (F°= 5/9·C° + 32). Диапазон изменения температуры в градусах
        Цельсия и шаг должны вводиться во время работы программы.
        Рекомендуемый вид экрана приведен ниже.
        t1 –> 0
        t2 –> 10
        dt–> 1
        -----------------
        C F
        -----------------
        0.00 32.00
        1.00 33.80
        2.00 35.60
        3.00 37.40
        4.00 39.20
        5.00 41.00
        6.00 42.80
        7.00 44.60
        8.00 46.40
        9.00 48.20
        10.00 50.00
        -----------------
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float t1;
        float t2;
        float dt;
        System.out.print("t1 -> ");
        t1 = scanner.nextFloat();
        System.out.print("t2 -> ");
        t2 = scanner.nextFloat();
        System.out.print("dt -> ");
        dt = scanner.nextFloat();
        System.out.println("-----------------");
        System.out.println("C F");
        System.out.println("-----------------");
        while (t1 <= t2){
            System.out.println(t1 + " " + (9.0/5.0 * t1 + 32));
            t1+=dt;
        }
    }
}

