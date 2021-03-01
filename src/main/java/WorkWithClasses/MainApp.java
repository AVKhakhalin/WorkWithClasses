package WorkWithClasses;

import java.io.IOException; // Объявление утилиты, для использования метода очистки окна в консоли
import java.util.Scanner; // Объявление утилиты для использования ввода информации в консоль

public class MainApp
{
    static Scanner scanner;

    public static void main(String[] args)
    {
        scanner = new Scanner(System.in); // Задание сканера, считывающего информацию, вводиму в консоль
        clrScreen(); // Запуска метода очистки окна

        boolean firstShow = true;
        int numberTask = -1;
        boolean errInput = false;

        while (true)
        {
            if ((numberTask != -1) && (errInput == false))
            {
                firstShow = false;
            }
            if (firstShow == true)
            {
                System.out.println("\n Добрый день!\nВашему вниманию предлагается домашняя работа №5\nстудента GeekBrains Хахалина Андрея Владимировича.\n");
                System.out.println("\n Домашнее задание включало в себя решение следующих задач:\n");
            }
            else
            {
                System.out.println("\n Решение какой следующей задачи Вы хотите проверить?\n");
            }
            System.out.println(" 1. Создать класс:");
            System.out.println("    1.1. Создать класс \"Сотрудник\" с полями: ФИО, должность, email, телефон,\n         зарплата, возраст.");
            System.out.println("    1.2. Конструктор класса должен заполнять эти поля при создании объекта.");
            System.out.println("    1.3. Внутри класса «Сотрудник» написать метод, который выводит информацию\n         об объекте в консоль.\n");
            System.out.println(" 2. Создать массив из 5 сотрудников.");
            System.out.println("    Пример:");
            System.out.println("    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов");
            System.out.println("    persArray[0] = new Person(\"Ivanov Ivan\", \"Engineer\",\n                   \"ivivan@mailbox.com\", \"892312312\", 30000, 30);\n    // потом для каждой ячейки массива задаем объект");
            System.out.println("    persArray[1] = new Person(...);");
            System.out.println("    ...");
            System.out.println("    persArray[4] = new Person(...);\n");
            System.out.println(" 3. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.");
            if ((Math.abs(numberTask) > 2) || (errInput == true))
            {
                System.out.print("\n ВАЖНО: Нужно ввести одну из цифр 0, 1, 2 или 3.\n Знак точки \".\" вводить не нужно.\n Пожалуйста, попробуйте ввести цифру ещё раз.\n");
            }
            System.out.print("\n Укажите НОМЕР ЗАДАЧИ для проверки (0 - для ВЫХОДА из программы): ");

            if (scanner.hasNextInt())
            {
                numberTask = scanner.nextInt();

                switch (numberTask)
                {
                    case 0:
                        clrScreen();
                        System.out.println("\n Спасибо Вам за потраченное время!\n Желаю хорошего дня.");
                        return;
                    case 1:
                        errInput = false;
                        firstShow = false;
                        clrScreen();
                        task1();
                        break;
                    case 2:
                        errInput = false;
                        firstShow = false;
                        clrScreen();
                        task2();
                        break;
                    case 3:
                        errInput = false;
                        firstShow = false;
                        clrScreen();
                        task3();
                        break;
                    default:
                        errInput = true;
                        clrScreen(); // Запуска метода очистки окна
                }
            }
            else
            {
                errInput = true;
                scanner.next();
                clrScreen(); // Запуска метода очистки окна
            }
        }
        // КАК ЗАКРЫТЬ ОТКРЫТЫЙ СКАНЕР
        // scanner.close(); - команда выдает сообщение об ошике "Delete unreachable statement"
    }

    //region Задача  №1
    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    // 2. Конструктор класса должен заполнять эти поля при создании объекта.
    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public static void task1()
    {
        System.out.println("\n ЗАДАНИЕ №1\n");
        System.out.println("    Создать класс:");
        System.out.println("      1. Создать класс \"Сотрудник\" с полями: ФИО, должность, email, телефон,\n         зарплата, возраст.");
        System.out.println("      2. Конструктор класса должен заполнять эти поля при создании объекта.");
        System.out.println("      3. Внутри класса «Сотрудник» написать метод, который выводит информацию\n         об объекте в консоль.\n");
        System.out.println(" РЕШЕНИЕ:\n");

    }
    //endregion

    //region Задача №2
    // 4. Создать массив из 5 сотрудников.
    //    Пример:
    //    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    //    persArray[0] = new Person("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    //    persArray[1] = new Person(...);
    //    ...
    //    persArray[4] = new Person(...);
    public static void task2()
    {
        System.out.println("\n ЗАДАНИЕ №2\n");
        System.out.println("    Создать массив из 5 сотрудников.");
        System.out.println("    Пример:");
        System.out.println("    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов");
        System.out.println("    persArray[0] = new Person(\"Ivanov Ivan\", \"Engineer\",\n                   \"ivivan@mailbox.com\", \"892312312\", 30000, 30);\n    // потом для каждой ячейки массива задаем объект");
        System.out.println("    persArray[1] = new Person(...);");
        System.out.println("    ...");
        System.out.println("    persArray[4] = new Person(...);\n");
        System.out.println(" РЕШЕНИЕ:\n");


    }
    //endregion

    //region Задача №3
    // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    public static void task3()
    {
        System.out.println("\n ЗАДАНИЕ №3\n");
        System.out.println("    С помощью цикла вывести информацию только о сотрудниках старше 40 лет.\n");
        System.out.println(" РЕШЕНИЕ:\n");


    }
    //endregion

    //region Общие методы
    //region Метод очистки консольного окна
    public static void clrScreen() // Очистка консольного окна
    {
        try
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex)
        {
        }
    }
    //endregion
}
