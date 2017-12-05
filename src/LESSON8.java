/**
 * Пользователь: Dell
 * Дата: 05.12.2017
 * Время: 18:57
 * Проект: OMA-REPOSITIORY
 */

import java.util.Random;
import java.util.Scanner;
public class LESSON8 {

    public static void main(String[] args) {
      firstTask();
        secondTask();
//        thirdTask();
//        forthTask();
//        fifthTask();
//        sixthTask();
    }
    // ПЕРВОЕ ЗАДАНИЕ
    static void firstTask() {

        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Ваш массив:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("\nПоложительные числа:");
        for (int value : array) {
            if (value >= 0) {
                System.out.println(value);
            }
        }
        System.out.println("\nОтрицательные числа:");
        for (int value : array) {
            if (value <= 0) {
                System.out.println(value);
            }
        }
    }
    // ВТОРОЕ ЗАДАНИЕ
    static void secondTask() {
        int n = 250;
        int k = 500;
        int x = 750;
        int z = 1000;
        int sum=0;

        Random random = new Random();
        int mas[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
            mas[i] = random.nextInt(150);
            for (int element : mas)
                sum += element;
        }

        printArray(mas);
        System.out.println("Среднее арифметическое от 1- 250 = " + (sum(mas, n))/250);
        System.out.println("Среднее арифметическое 250- 500  = " + (sum2(mas, k))/250);
        System.out.println("реднее арифметическое 500- 750  = " + (sum3(mas, x))/250);
        System.out.println("реднее арифметическое 750- 1000  = " + (sum4(mas, z))/250);
    }

    public static void printArray(int[] a) {
        System.out.print("Массив: { ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("}");
    }

    public static int sum(int[] a, int n) {
        int result = 0;
        for (int i = 0; i < n; i++)
            result += a[i];
        return result;
    }

    public static int sum2(int[] a, int k) {
        int result = 0;
        for (int i = 250; i < k; i++)
            result += a[i];
        return result;
    }
    public static int sum3(int[] a, int x) {
        int result = 0;
        for (int i = 500; i < x; i++)
            result += a[i];
        return result;
    }

    public static int sum4(int[] a, int z) {
        int result = 0;
        for (int i = 750; i < z; i++)
            result += a[i];
        return result;
    }

// ТРЕТЬЕ ЗАДАНИЕ

}