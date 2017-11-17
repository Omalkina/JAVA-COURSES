import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
// Game Homework Task-1 class template
    public static void main(String[] args) {
        int a = (int) (Math.random() * 6); // Переменная а равна рандому от одного да шести
        int b = (int) (Math.random() * 6); // Переменная б равна рандому от одного да шести
        System.out.println(a);
        System.out.println(b);
        if (a == b) {
            System.out.println(" Оба числа равны -- вы проиграли =(");
        }
        if (a != b) {
            System.out.println(" Числа не совпали -- вы выиграли! =)");
        }}}

// Game Homework Task-2  class template
 class Game {
    public static void main(String[] args) {
        int score = 0; //Объявляем переменные
        int alive = 1; ////Объявляем переменные
        Scanner scanner = new Scanner(System.in);//Создаем сканер для вводимых значений
        while (alive == 1) {
            System.out.println("Выбери число от 1 до 6:");
            int myChoice = scanner.nextInt(); // Как понять?
            int randomValue = (int) (Math.random() * 5) + 1; // Как понять?
            System.out.println("Я выбрала: " + myChoice + ", Количество ваших очков: " + randomValue);
            if (myChoice != randomValue) {
                score = score + 1;
            } else {
                alive = 0;
            }
        }
        System.out.println("Game Over. Счет: " + score);

    }
}


//Rectangle class template
class Rectangle {
    public static void main(String args[])
    {
        float a = 7, b = 3, s;
        s = (a * b)/2;
        System.out.println("Площадь прямоугольника со сторонами 5 см и 3 см равна " + s + " квадратных сантиметров.");
    }
}

//FreshJuice class template
class FreshJuice {

    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}
class FreshJuiceTest {

    public static void main(String args[]){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println("Вы выбрали размер: " + juice.size);
    }
}


// Enumeration class template
class Enumeration {

    public static void main (String args[]) {
        int a = 4;
        int b = 8;
        if(a == 4) System.out.println("Переменная A равна 4");
        if(b == 5) System.out.println( "Переменная B равна 5");
        if(a == b) System.out.println( "Переменная B равна A");
        if(a != b) System.out.println( "Переменная B не равна A");
        if(a <= b) System.out.println( "Переменная B больше A");
        if(a >= b) System.out.println( "Переменная B меньше A");
        else System.out.println("Fuck you all. I dont know");
    }
}



// Loop class template
class Loop {

    public static void main (String args[]) {
        int i = 0;
        while (i < 238) {
            if (i % 2 == 0) {
                System.out.println(i); }
            i++;
        }
    }
}
// Array class template
class Massive {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[9] = 10;
        for(int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Conversion class template
class ConversionNumbers {

    public static void main(String[] args) throws Exception {
        System.out.print("Введите число для конвертирования: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sNum = br.readLine();
        int i = Integer.parseInt(sNum);
        System.out.print("Выберите основание новой системы счисления: ");
        String sNu = br.readLine();
        int q = Integer.parseInt(sNu);
        System.out.println("В выбранной системе счисления " + i + " будет равно " + Integer.toString(i, q));
    }

}