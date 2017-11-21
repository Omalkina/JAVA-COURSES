import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
        lesson5Ex1();
        lesson5Ex2();
        lesson5Ex3();
        lesson5Ex4();
        lesson5Ex5();
    }

    static void lesson5Ex1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Задание 1:  Введите двухзначное целое число: ");
        int TestNumber = in.nextInt();
        int a = TestNumber / 10;
        int b = TestNumber % 10;
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        if (a == b) System.out.println("Оба числа равны :" + a);
        if (a > b) System.out.println("Больший модуль у числа " + a);
        else System.out.println("Больший модуль у числа " + b);
    }


    static void lesson5Ex2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Задание 2:  Введите четырехзначное целое число: ");
        long UserNumber = in.nextInt();
        long one, two, three, four;
        four = UserNumber % 10;
        three = (UserNumber / 10) % 10;
        two = (UserNumber / 100) % 10;
        one = UserNumber / 1000;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }


    static void lesson5Ex3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Задание 3:  Введите количество грамм для конверсии: ");
        float GrammNumber = in.nextInt();
        float kilos;
        kilos= (GrammNumber/1000);
        System.out.println(kilos+ "Килограмм на весах");
    }

    static void lesson5Ex4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Задание 4:  Введите двухзначное целое число: ");
        int TestNumber = in.nextInt();
        System.out.print("Задание 4:  Введите двухзначное целое число: ");
        int TestNumber1 = in.nextInt();
        int a = TestNumber;
        int b = TestNumber1;
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        if (a == b) System.out.println("Оба числа равны :" + a);
        if (a > b) System.out.println("Больший модуль у числа " + a);
        else System.out.println("Больший модуль у числа " + b);
    }

    static void lesson5Ex5() {
        Scanner in = new Scanner(System.in);
        System.out.print("Задание 5:  Введите чему равно A: ");
        long a = in.nextInt();
        System.out.print("Задание 5:  Введите чему равно B: ");
        long b = in.nextInt();
        System.out.print("Задание 5:  Введите чему равно C: ");
        long c = in.nextInt();
        long result =(a + b - c / a) + c * a * a - (a + b);
        System.out.println(  "Результат расчета по формуле: (а + b - с / а) + с * a * a - (a + b) =  " +result);
    }
}