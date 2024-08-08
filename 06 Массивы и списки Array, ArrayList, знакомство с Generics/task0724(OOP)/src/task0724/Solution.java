package task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grand1 = new Human("Саша", true, 60, null, null);
        Human grand2 = new Human("Петя", true, 61, null, null);
        Human granny1 = new Human("Таня", false, 59, null, null);
        Human granny2 = new Human("Даша", false, 60, null, null);
        Human father = new Human("Кирилл", true, 37,grand1,granny1);
        Human mother = new Human("Оля", false, 34, grand2, granny2);
        Human son1 = new Human("Потап", true, 14, father, mother);
        Human douther1 = new Human("Лиза", false, 11, father, mother);
        Human son2 = new Human("Дима", true, 7, father, mother);

        System.out.println(grand1);
        System.out.println(grand2);
        System.out.println(granny1);
        System.out.println(granny2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(douther1);
        System.out.println(son2);


    }

    public static class Human {
        // напишите тут ваш код
            String name;
            boolean sex;
            int age;
            Human father;
            Human mother;

            public Human (String name, boolean sex, int age, Human father, Human mother){
                this.name = name;
                this.sex = sex;
                this.age = age;
                this.father = father;
                this.mother = mother;
            }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}