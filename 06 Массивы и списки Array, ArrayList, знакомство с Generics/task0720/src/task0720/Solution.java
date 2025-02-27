package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите число N:");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите число M:");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите строк:" + n);

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < m; i++) {
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }

        for (String s : list) {
            System.out.println(s);
        }

    }
}
