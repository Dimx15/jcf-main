package task0702;

import java.util.Scanner;
import java.util.Arrays;

/* 
Массив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна считывать 8 строк для массива с клавиатуры.
3. Программа должна выводить на экран 10 строк, каждую с новой строки.
4. Программа должна выводить на экран массив (10 элементов) в обратном порядке.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите десять строк:");
        String [] strings = new String[10];
        for (int i = 0; i < 8; i++) {
            strings[i] = scanner.nextLine();
        }
       for (int i = strings.length-1; i>=0;i--){
           System.out.println(strings[i]);
       }

    }
}