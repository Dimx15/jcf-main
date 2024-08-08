package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map <String, String> map = new HashMap<>();
        map.put("Кузнецов", "Иван");
        map.put("Фролов", "Сергей");
        map.put("Иванов", "Сергей");
        map.put("Сидоров", "Петр");
        map.put("Нигматуллин", "Руслан");
        map.put("Лутфуллин", "Артур");
        map.put("Кузнецов", "Иван");
        map.put("Набиуллин", "Ильшат");
        map.put("Галиуллин", "Ильнур");
        map.put("Батыршин", "Ирик");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int num = 0;
        for (Map.Entry<String, String> pair:
                map.entrySet()) {
            if (name.equals(pair.getValue()))
                num ++;
        }
        return num;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int x = 0;
        for (Map.Entry<String, String> pair: map.entrySet()){
            if (lastName.equals(pair.getKey()))
                x ++;
        }
        return x;

    }

    public static void main(String[] args) {

    }
}
