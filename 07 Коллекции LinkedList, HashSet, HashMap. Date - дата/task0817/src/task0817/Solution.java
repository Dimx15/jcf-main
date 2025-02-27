package task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Фоменко", "Александр");
        map.put("Крисяк", "Михаил");
        map.put("Горинов", "Юрий");
        map.put("Мальцева", "Екатерина");
        map.put("Басков", "Владимир");
        map.put("Грачев", "Владислав");
        map.put("Дунская", "Лада");
        map.put("Федерова", "Екатерина");
        map.put("Федерова", "Екатерина");
        map.put("Федерeова", "Екатерина");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        System.out.println(map);
        for (Map.Entry<String, String> pair : copy1.entrySet()) {
            for (Map.Entry<String, String> pair2 : copy2.entrySet()) {
                if (!pair.getKey().equals(pair2.getKey()) && pair.getValue().equals(pair2.getValue()) ) {
                    removeItemFromMapByValue(map, pair.getValue());
                }
            }
        }
       System.out.println(map);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
