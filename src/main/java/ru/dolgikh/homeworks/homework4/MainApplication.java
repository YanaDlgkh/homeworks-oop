package ru.dolgikh.homeworks.homework4;

public class MainApplication {

    public static void main(String[] args) {

//        Первая часть User

        System.out.println("Пользователи: ");

        User[] users = {new User("Иванов", "Иван", "Иванович", 1985, "ivan@mail.ru"),
                new User("Петров", "Петр", "Петрович", 1996, "petr@mail.ru"),
                new User("Смирнов", "Сергей", "Васильевич", 1967, "smirnov@mail.ru"),
                new User("Цветкова", "Екатерина", "Алексеевна", 2000, "tsvetkova@mail.ru"),
                new User("Копылова", "Агата", "Никитична", 1991, "kopylova@mail.ru"),
                new User("Долгих", "Яна", "Андреевна", 2000, "yana@mail.ru"),
                new User("Асейкин", "Геннадий", "Олегович", 1973, "aseykin@gmail.com"),
                new User("Федоров", "Федор", "Федорович", 1995, "fedorov@yandex.ru"),
                new User("Долгих", "Ольга", "Геннадьевна", 1971, "olga@mail.ru"),
                new User("Сергеев", "Иван", "Петрович", 1959, "sergeev@mail.ru")
        };


        for (User user :
                users) {

            int currentYear = 2023;

            if (currentYear - user.getBirthYear() > 40) {
                user.info();
            }
        }

//         Вторая часть Box

        System.out.println("------------------------------------------");

        System.out.println("Класс Коробка");

        Box box1 = new Box(100, 50, 50, "white");

//        Информация о коробке
        box1.info();

        box1.setColor("black");

//        Информация после изменения цвета

        box1.info();

//      Положим предмет

        String item = "яблоко";

        box1.fold(item);

//        Коробку надо открыть, прежде чем положить что-то, так как по дефолту она закрыта!!!

        box1.open();

        box1.fold(item);

//        Теперь выкидываем предмет

        box1.discard(item);

//        После того, как выкинули видим, что в коробке ничего нет

        box1.discard(item);

//        Закрываем коробку

        box1.close();


    }


}
