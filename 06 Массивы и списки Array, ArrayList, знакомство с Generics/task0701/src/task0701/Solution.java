package task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива


Requirements:
1. Метод initializeArray должен создавать массив из 20 целых чисел.
2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
3. Метод max должен возвращать максимальный элемент из переданного массива.
4. Метод main изменять нельзя.*/
import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите двадцать чисел:");
        int [] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
          numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Максимальное число: " + max);

        return max;
    }
}
