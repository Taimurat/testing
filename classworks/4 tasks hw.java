import everything

/* Task 1
// Абстрактный класс
abstract class Entity {
    private String name;
    private int id;

    // Конструктор с параметрами
    public Entity(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Конструктор по умолчанию
    public Entity() {
        this("Unknown", 0);
    }

    // Неабстрактный метод
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    // Неабстрактный метод
    public void performAction() {
        System.out.println(name + " is performing an action.");
    }

    // Абстрактный метод
    public abstract void specialAbility();
}

// Перечисление для типа сущности
enum EntityType {
    MONSTER, HERO
}

// Класс Monster
class Monster extends Entity {
    private EntityType type;

    public Monster(String name, int id, EntityType type) {
        super(name, id);
        this.type = type;
    }

    public Monster() {
        this("Default Monster", 1, EntityType.MONSTER);
    }

    @Override
    public void specialAbility() {
        System.out.println("Monster " + super.name + " is attacking!");
    }

    @Override
    public void performAction() {
        System.out.println("Monster " + super.name + " is roaring!");
    }
}

// Класс Hero
class Hero extends Entity {
    private String power;

    public Hero(String name, int id, String power) {
        super(name, id);
        this.power = power;
    }

    public Hero() {
        this("Default Hero", 2, "Super Strength");
    }

    @Override
    public void specialAbility() {
        System.out.println("Hero " + super.name + " is using " + power + "!");
    }

    @Override
    public void performAction() {
        System.out.println("Hero " + super.name + " is saving the day!");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        Entity[] entities = new Entity[2];
        entities[0] = new Monster("Goblin", 1, EntityType.MONSTER);
        entities[1] = new Hero("Superman", 2, "Flight");

        for (Entity entity : entities) {
            entity.displayInfo();
            entity.performAction();
            entity.specialAbility();
        }
    }
}

*/

/* Task 2

class Vector2D {
    private double x;
    private double y;

    // Конструктор 0-вектора
    public Vector2D() {
        this(0, 0);
    }

    // Конструктор с координатами
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры и сеттеры
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Сложение векторов
    public Vector2D add(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    // Вычитание векторов
    public Vector2D sub(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    // Сложение векторов (изменение текущего)
    public void add2(Vector2D v) {
        this.x += v.x;
        this.y += v.y;
    }

    // Вычитание векторов (изменение текущего)
    public void sub2(Vector2D v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    // Умножение на число
    public Vector2D mult(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    // Умножение на число (изменение текущего)
    public void mult2(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    // Строковое представление
    @Override
    public String toString() {
        return "Vector2D(" + x + ", " + y + ")";
    }

    // Длина вектора
    public double length() {
        return Math.sqrt(x * x + y * y); // Используем теорему Пифагора
    }

    // Скалярное произведение
    public double scalarProduct(Vector2D v) {
        return this.x * v.x + this.y * v.y; // Формула скалярного произведения
    }

    // Косинус угла между векторами
    public double cos(Vector2D v) {
        double cosTheta = this.scalarProduct(v) / (this.length() * v.length());
        return cosTheta; // Возвращаем косинус угла
    }

    // Сравнение векторов
    public boolean equals(Vector2D v) {
        return this.x == v.x && this.y == v.y; // Сравниваем координаты
    }
}

*/

/* Task 3

class RationalFraction {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор для дроби равной 0
    public RationalFraction() {
        this(0, 1); // По умолчанию дробь 0/1
    }

    // Конструктор дроби со значениями
    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю!"); // Обработка исключения
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Сокращаем дробь при создании
    }

    // Сокращение дроби
    public void reduce() {
        int gcd = gcd(numerator, denominator); // Находим НОД
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) { // Обеспечиваем положительный знаменатель
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Метод для нахождения НОД
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b); // Рекурсивный алгоритм Евклида
    }

    // Сложение дробей
    public RationalFraction add(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator); // Возвращаем новую дробь
    }

    // Сложение дробей (изменение текущей)
    public void add2(RationalFraction other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator *= other.denominator;
        reduce(); // Сокращаем дробь
    }

    // Вычитание дробей
    public RationalFraction sub(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator); // Возвращаем новую дробь
    }

    // Вычитание дробей (изменение текущей)
    public void sub2(RationalFraction other) {
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator *= other.denominator;
        reduce(); // Сокращаем дробь
    }

    // Умножение дробей
    public RationalFraction mult(RationalFraction other) {
        return new RationalFraction(this.numerator * other.numerator, this.denominator * other.denominator); // Возвращаем новую дробь
    }

    // Умножение дробей (изменение текущей)
    public void mult2(RationalFraction other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        reduce(); // Сокращаем дробь
    }

    // Деление дробей
    public RationalFraction div(RationalFraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль!"); // Обработка исключения
        }
        return new RationalFraction(this.numerator * other.denominator, this.denominator * other.numerator); // Возвращаем новую дробь
    }

    // Деление дробей (изменение текущей)
    public void div2(RationalFraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль!"); // Обработка исключения
        }
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
        reduce(); // Сокращаем дробь
    }

    // Строковое представление дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator; // Форматируем дробь как "числитель/знаменатель"
    }

    // Десятичное значение дроби
    public double value() {
        return (double) numerator / denominator; // Возвращаем десятичное значение
    }

    // Целая часть дроби
    public int numberPart() {
        return numerator / denominator; // Возвращаем целую часть
    }

    // Сравнение дробей
    public boolean equals(RationalFraction other) {
        return this.numerator * other.denominator == this.denominator * other.numerator; // Сравниваем дроби
    }
}

/* Task 4

// Интерфейс Animal
interface Animal {
    void makeSound(); // Метод для издания звука
    void eat(String foodType); // Метод для кормления
}

// Класс Lion
class Lion implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Рычание льва!"); // Реализация звука
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Лев ест: " + foodType); // Реализация кормления
    }

    public void hunt() {
        System.out.println("Лев охотится!"); // Специфичный метод
    }
}

// Класс Elephant
class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Трубление слона!"); // Реализация звука
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Слон ест: " + foodType); // Реализация кормления
    }

    public void playWater() {
        System.out.println("Слон играет с водой!"); // Специфичный метод
    }
}

// Класс Monkey
class Monkey implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Крик обезьяны!"); // Реализация звука
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Обезьяна ест: " + foodType); // Реализация кормления
    }

    public void swing() {
        System.out.println("Обезьяна качается на ветвях!"); // Специфичный метод
    }
}

// Класс Zoo для управления животными
class Zoo {
    private List<Animal> animals = new ArrayList<>(); // Список животных

    public void addAnimal(Animal animal) {
        animals.add(animal); // Добавляем животное в зоопарк
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound(); // Издаем звуки всех животных
        }
    }

    public void feedAll(String foodType) {
        for (Animal animal : animals) {
            animal.eat(foodType); // Кормим всех животных
        }
    }
}

// Главный класс для тестирования
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(); // Создаем зоопарк

        // Создаем экземпляры животных
        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();

        // Добавляем животных в зоопарк
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        // Тестируем звуки и кормление
        zoo.makeAllSounds();
        zoo.feedAll("мясо");
    }
}

*/

/* Task 7

class ArrayUtils {

    // Метод для получения суммы элементов массива
    public static double getSum(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num; // Суммируем элементы
        }
        return sum; // Возвращаем сумму
    }

    // Метод для получения среднего арифметического
    public static double average(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым!"); // Обработка исключения
        }
        return getSum(array) / array.length; // Используем getSum для вычисления среднего
    }

    // Метод для получения максимального значения
    public static double max_value(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым!"); // Обработка исключения
        }
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num; // Находим максимальное значение
            }
        }
        return max; // Возвращаем максимальное значение
    }

    // Метод для получения минимального значения
    public static double min_value(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым!"); // Обработка исключения
        }
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num; // Находим минимальное значение
            }
        }
        return min; // Возвращаем минимальное значение
    }

    // Метод для получения моды
    public static double mode(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым!"); // Обработка исключения
        }
        Map<Double, Integer> frequencyMap = new HashMap<>(); // Словарь для подсчета частоты
        for (double num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); // Увеличиваем частоту
        }

        double mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue(); // Находим максимальную частоту
                mode = entry.getKey(); // Обновляем моду
            }
        }
        return mode; // Возвращаем моду
    }

    // Метод для сортировки массива по возрастанию
    public static double[] sort_ascending(double[] array) {
        double[] sortedArray = array.clone(); // Клонируем массив
        java.util.Arrays.sort(sortedArray); // Сортируем массив
        return sortedArray; // Возвращаем отсортированный массив
    }
}

// Главный класс для тестирования ArrayUtils
public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.5, 3.5, 2.5, 4.0, 1.5};

        System.out.println("Сумма: " + ArrayUtils.getSum(numbers));
        System.out.println("Среднее: " + ArrayUtils.average(numbers));
        System.out.println("Максимальное значение: " + ArrayUtils.max_value(numbers));
        System.out.println("Минимальное значение: " + ArrayUtils.min_value(numbers));
        System.out.println("Мода: " + ArrayUtils.mode(numbers));
        
        double[] sortedNumbers = ArrayUtils.sort_ascending(numbers);
        System.out.print("Отсортированный массив: ");
        for (double num : sortedNumbers) {
            System.out.print(num + " "); // Выводим отсортированный массив
        }
    }
}

*/
