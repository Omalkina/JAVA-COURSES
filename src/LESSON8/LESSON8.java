package LESSON8; /**
 * Пользователь: Dell
 * Дата: 05.12.2017
 * Время: 18:57
 * Проект: OMA-REPOSITIORY
 */

import java.util.Random;
import java.util.Scanner;

public class LESSON8 {

    public static void main(String[] args) {
        // firstTask();
        //  secondTask();
        //  thirdTask();
        forthTask();
//        fifthTask();
//        sixthTask();
        print();
        print("ggg");
    }

    // ПЕРВОЕ ЗАДАНИЕ
    // Todo: cont quantity of positive numbers
    //Todo: count quantity of elements >3 and <5
    static void firstTask() {

        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Ваш массив:");
        for (int i = 0; i < 10; i++) {
            System.out.println(" " + array[i]);
        }
        int countPositive = 0;
        int countFour = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
            if (array[i] > 0) {
                countPositive++;
            }
            if (array[i] > 3 && array[i] < 5) {
                countFour++;
            }

        }
        System.out.println("Количество отрицательных чисел:  " + count);
        System.out.println("Количество положительных чисел:  " + countPositive);
        System.out.println("Количество четверок:  " + countFour);


    }


//        System.out.println();
//        System.out.println("\nПоложительные числа:");
//        for (int value : array) {
//            if (value >= 0) {
//                System.out.println(value);
//            }
//        }
//        System.out.println("\nОтрицательные числа:");
//        for (int value : array) {
//            if (value <= 0) {
//                System.out.println(value);
//            }
//        }

    // ВТОРОЕ ЗАДАНИЕ
    static void secondTask() {
        int zero = 0;
        int n = 250;
        int k = 500;
        int x = 750;
        int z = 1000;
        int sum = 0;

        Random random = new Random();
        int mas[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
            mas[i] = random.nextInt(150);
            for (int element : mas)
                sum += element;
        }

        printArray(mas);
        System.out.println("Среднее арифметическое от 1- 250 = " + (sumAll(mas, 0, 250)) / 250);
        System.out.println("Среднее арифметическое 250- 500  = " + (sumAll(mas, 250, 500)) / 250);
        System.out.println("реднее арифметическое 500- 750  = " + (sumAll(mas, 500, 750)) / 250);
        System.out.println("реднее арифметическое 750- 1000  = " + (sumAll(mas, 750, 1000)) / 250);
    }

    public static void printArray(int[] a) {
        System.out.print("Массив: { ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("}");
    }

    public static int sumAll(int[] a, int from, int to) {
        int result = 0;
        for (int i = from; i < to; i++)
            result += a[i];
        return result;
    }


    // Todo: task FOUR
    public static void thirdTask() {
        NamedEntity entityOne = new NamedEntity("Первая штука");
        NamedEntity entityTwo = new NamedEntity("Вторая штука");
        NamedEntity entityThree = new NamedEntity("Третья штука");
        NamedEntity entityFour = new NamedEntity("Четвертая штука");
        NamedEntity entityFive = new NamedEntity("Пятая штука");
        NamedEntity[] arr = new NamedEntity[5];
        arr[0] = entityOne;
        arr[1] = entityTwo;
        arr[2] = entityThree;
        arr[3] = entityFour;
        arr[4] = entityFive;

        for (NamedEntity entity : arr) {
            System.out.println(entity);
        }

    }

    public static void forthTask() {

        try {
            int array[] = new int[1];
            array[2] = 2;
        } catch (ArrayIndexOutOfBoundsException exeption) {

            System.out.println("Вы за границами массива индекс равен:  " + exeption.getMessage());
        }


    }

    public static void print() {
        System.out.println("ggg");
    }

    public static void print(String message) {
        System.out.println(message);
    }}