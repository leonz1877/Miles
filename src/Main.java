import java.util.Scanner; // импорт пакета для ввода в консоли

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Создание объекта Scanner и передача в него Sistem.in

        System.out.print("Введите стоимость билета: "); // Вывод текста запроса

        int ticketPrice = in.nextInt(); // запрос ввода стоимости билета в консоли и помещение в переменную ticketPrice

        int bonusMiles = ticketPrice / 20; // объявление переменной bonusMiles и расчет значения

        System.out.printf("Ваши бонусы: %d \n", bonusMiles); // Вывод в консоль количества бонусов
        in.close();

         // спасибо за блок ввода в консоли ресурсу https://metanit.com/java/tutorial/2.9.php

    }
}
