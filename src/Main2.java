import java.util.Scanner;

// Game Homework Task-2  class template
public class Main2 {
    public static void main(String[] args) {
        int score = 0; //Объявляем переменные
        int alive = 1; ////Объявляем переменные
        Scanner scanner = new Scanner(System.in);//Создаем сканер для вводимых значений
        while (alive == 1) {
            System.out.println("Выбери число от 1 до 6:");
            long myChoice = scanner.nextLong(); // Как понять?
            int randomValue = (int) (Math.random() * 5) + 1; // Как понять?
            System.out.println("Я выбрала: " + myChoice + ", Количество ваших очков: " + randomValue);
            if (myChoice != randomValue) {
                score = score + 1;
            } else {
                alive = 0;
            }
        }
        System.out.println("Game Over. Счет: " + score);

    }}