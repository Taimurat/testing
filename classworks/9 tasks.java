import java.util.*;

// ВСЕ КЛАССЫ НАХОДЯТСЯ В РАЗНЫХ ФАЙЛАХ, ИХ НАЗВАНИЕ - НАЗВАНАНИЕ КЛАССА. Просто для удобства я все переписал в одном файле

/* Task 1

abstract class Profession {
    abstract String work();
}

class Doctor extends Profession {
    @Override
    String work() {
        return "Лечу пациентов.";
    }
}

class Teacher extends Profession {
    @Override
    String work() {
        return "Преподаю уроки.";
    }
}

public class Main {
    public static void main(String[] args) {
        Profession[] professions = {new Doctor(), new Teacher()};
        for (Profession profession : professions) {
            System.out.println(profession.work());
        }
    }
}

*/

/* Task 2

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class Main {
    public static String getWeather(Season season) {
        return switch (season) {
            case WINTER -> "Холодно";
            case SUMMER -> "Жарко";
            case SPRING, AUTUMN -> "Прохладно";
        };
    }

    public static void main(String[] args) {
        Season season = Season.SUMMER; // Пример
        System.out.println(getWeather(season));
    }
}

*/

/* Task 3

abstract class Shape {
    abstract double area();
    abstract void draw();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Рисую круг с радиусом " + radius);
    }
}

class Rectangle extends Shape {
    private double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    void draw() {
        System.out.println("Рисую прямоугольник " + width + "x" + height);
    }
}

class Triangle extends Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    void draw() {
        System.out.println("Рисую треугольник с основанием " + base + " и высотой " + height);
    }
}

*/

/* Task 4

interface Vehicle {
    void start();
    void stop();
    void speedUp(int increment);
}

class Car implements Vehicle {
    private int speed;

    @Override
    public void start() {
        System.out.println("Машина запущена.");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Машина остановлена.");
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Скорость машины: " + speed);
    }
}

class Bike implements Vehicle {
    private int speed;

    @Override
    public void start() {
        System.out.println("Велосипед запущен.");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Велосипед остановлен.");
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Скорость велосипеда: " + speed);
    }
}

*/

/* Task 5

abstract class Animal {
    String name; // Имя животного
    int age; // Возраст животного

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод для получения звука животного
    abstract String speak();
}

class Dog extends Animal {
    String breed; // Порода собаки

    Dog(String name, int age, String breed) {
        super(name, age); // Вызов конструктора родительского класса
        this.breed = breed;
    }

    @Override
    String speak() {
        return "Woof!"; // Переопределение метода speak для собаки
    }
}

class Cat extends Animal {
    String color; // Цвет кошки

    Cat(String name, int age, String color) {
        super(name, age); // Вызов конструктора родительского класса
        this.color = color;
    }

    @Override
    String speak() {
        return "Meow!"; // Переопределение метода speak для кошки
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание массива животных с восходящим преобразованием до родительского класса
        Animal[] animals = {
            new Dog("Buddy", 3, "Labrador"),
            new Cat("Whiskers", 2, "Black")
        };

        // Демонстрация полиморфизма: вызов метода speak для каждого животного
        for (Animal animal : animals) {
            System.out.println(animal.name + " говорит: " + animal.speak());
        }
    }
}

*/

/* Task 6

class Student {
    String firstName; // Имя студента
    String lastName; // Фамилия студента
    String group; // Группа студента
    double averageMark; // Средняя оценка студента

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    // Метод для получения стипендии
    double getScholarship() {
        return averageMark == 5 ? 2000 : 1900; // Условия для стипендии
    }
}

class Aspirant extends Student {
    String researchWork; // Научная работа аспиранта

    Aspirant(String firstName, String lastName, String group, double averageMark, String researchWork) {
        super(firstName, lastName, group, averageMark); // Вызов конструктора родительского класса
        this.researchWork = researchWork;
    }

    // Переопределение метода для получения стипендии
    @Override
    double getScholarship() {
        return averageMark == 5 ? 2500 : 2200; // Условия для стипендии аспиранта
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание массива студентов и аспирантов
        Student[] students = {
            new Student("Иван", "Иванов", "Группа 1", 4.5),
            new Aspirant("Петр", "Петров", "Группа 2", 5, "Научная работа 1")
        };

        // Вызов метода getScholarship для каждого студента
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " получает стипендию: " + student.getScholarship());
        }
    }
}

*/

/* Task 7

class Flower {
    String name; // Название цветка
    String country; // Страна производитель
    int shelfLife; // Срок хранения в днях
    double price; // Цена цветка

    Flower(String name, String country, int shelfLife, double price) {
        this.name = name;
        this.country = country;
        this.shelfLife = shelfLife;
        this.price = price;
    }
}

class Rose extends Flower {
    Rose() {
        super("Роза", "Нидерланды", 7, 100.0);
    }
}

class Carnation extends Flower {
    Carnation() {
        super("Гвоздика", "Россия", 5, 50.0);
    }
}

class Tulip extends Flower {
    Tulip() {
        super("Тюльпан", "Турция", 10, 80.0);
    }
}

public class Main {
    static int totalSoldFlowers = 0; // Статическая переменная для подсчета проданных цветов

    public static void main(String[] args) {
        // Создание букетов
        Flower[] bouquet1 = {new Rose(), new Carnation(), new Tulip()};
        Flower[] bouquet2 = {new Tulip(), new Tulip(), new Rose()};
        Flower[] bouquet3 = {new Carnation(), new Rose()};

        // Подсчет стоимости каждого букета и добавление к общему количеству проданных цветов
        double totalCost1 = calculateBouquetCost(bouquet1);
        double totalCost2 = calculateBouquetCost(bouquet2);
        double totalCost3 = calculateBouquetCost(bouquet3);

        System.out.println("Стоимость букета 1: " + totalCost1);
        System.out.println("Стоимость букета 2: " + totalCost2);
        System.out.println("Стоимость букета 3: " + totalCost3);

        // Вывод общего количества проданных цветов
        System.out.println("Общее количество проданных цветов: " + totalSoldFlowers);
    }

    // Метод для подсчета стоимости букета
    static double calculateBouquetCost(Flower[] bouquet) {
        double totalCost = 0;
        for (Flower flower : bouquet) {
            totalCost += flower.price; // Суммируем цену каждого цветка
            totalSoldFlowers++; // Увеличиваем счетчик проданных цветов
        }
        return totalCost;
    }
}

/* Task 8

class Book {
    String title; // Название книги
    String author; // Автор книги

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Reader {
    String fullName; // ФИО читателя
    String ticketNumber; // Номер читательского билета
    String faculty; // Факультет
    String birthDate; // Дата рождения
    String phone; // Телефон

    Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    // Перегрузка метода takeBook для количества книг
    void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    // Перегрузка метода takeBook для названий книг
    void takeBook(String... titles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : titles) {
            System.out.print(title + " ");
        }
        System.out.println();
    }

    // Перегрузка метода takeBook для объектов класса Book
    void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.title + " ");
        }
        System.out.println();
    }

    // Перегрузка метода returnBook для количества книг
    void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    // Перегрузка метода returnBook для названий книг
    void returnBook(String... titles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : titles) {
            System.out.print(title + " ");
        }
        System.out.println();
    }

    // Перегрузка метода returnBook для объектов класса Book
    void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.title + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов класса Reader
        Reader reader1 = new Reader("Петров П.П.", "12345", "Физика", "01.01.1990", "123-456-789");
        Reader reader2 = new Reader("Сидоров С.С.", "67890", "Математика", "02.02.1992", "987-654-321");

        // Примеры использования перегруженных методов takeBook
        reader1.takeBook(3); // Ввод количества книг
        reader2.takeBook("Приключения", "Словарь", "Энциклопедия"); // Ввод названий книг
        reader1.takeBook(new Book("1984", "Джордж Оруэлл"), new Book("Война и мир", "Лев Толстой")); // Ввод объектов книг

        // Примеры использования перегруженных методов returnBook
        reader1.returnBook(2); // Ввод количества книг
        reader2.returnBook("Приключения", "Словарь"); // Ввод названий книг
        reader1.returnBook(new Book("1984", "Джордж Оруэлл"), new Book("Война и мир", "Лев Толстой")); // Ввод объектов книг
    }
}

*/
