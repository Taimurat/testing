import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        // Task 1
        /* 
        try {
            String content = new String(Files.readAllBytes(Paths.get("input.txt"))); // Чтение файла
            String[] words = content.split("\\s+"); // Разделение по пробелам
            System.out.println("Количество слов: " + words.length); // Вывод количества слов
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        */

        // Task 2
        /*
        try {
            String content = new String(Files.readAllBytes(Paths.get("input.txt"))); // Чтение файла
            String newContent = content.replace("старое_слово", "новое_слово"); // Замена слова
            Files.write(Paths.get("output.txt"), newContent.getBytes()); // Запись в новый файл
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
        }
        */

        // Task 3
        /*
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            double num1 = Double.parseDouble(sc.nextLine()); // Ввод первого числа
            System.out.print("Введите второе число: ");
            double num2 = Double.parseDouble(sc.nextLine()); // Ввод второго числа
            double result = num1 / num2; // Деление
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод числа.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль.");
        }
        */

        // Task 4
        /*
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            int lineNumber = 0;
            boolean isEmpty = true; // Флаг для проверки пустоты файла
            while ((line = br.readLine()) != null) {
                isEmpty = false; // Если хотя бы одна строка есть, файл не пуст
                lineNumber++;
                try {
                    Integer.parseInt(line); // Попытка конвертации строки в число
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка в строке: " + lineNumber);
                }
            }
            if (isEmpty) {
                throw new Exception("Файл пуст."); // Бросаем исключение, если файл пуст
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        */

        // Task 5
        /*
        Pattern pattern = Pattern.compile("\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}"); // Регулярное выражение для номера телефона
        try {
            String content = new String(Files.readAllBytes(Paths.get("input.txt"))); // Чтение файла
            Matcher matcher = pattern.matcher(content);
            List<String> phoneNumbers = new ArrayList<>();
            while (matcher.find()) {
                phoneNumbers.add(matcher.group()); // Сохранение найденных номеров
            }
            Files.write(Paths.get("output.txt"), phoneNumbers); // Запись в новый файл
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
        }
        */

        // Task 6
        /*
        Pattern datePattern = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})\\b"); // Регулярное выражение для даты
        try {
            String content = new String(Files.readAllBytes(Paths.get("input.txt"))); // Чтение файла
            Matcher matcher = datePattern.matcher(content);
            List<String> dates = new ArrayList<>();
            while (matcher.find()) {
                dates.add(matcher.group()); // Сохранение найденных дат
            }
            System.out.println("Найденные даты: " + dates);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        */

        // Task 7
        /*
        Pattern capitalLetterPattern = Pattern.compile("\\b[A-ZА-ЯЁ][a-zа-яё]*\\b"); // Регулярное выражение для слов с заглавной буквы
        try {
            String content = new String(Files.readAllBytes(Paths.get("input.txt"))); // Чтение файла
            Matcher matcher = capitalLetterPattern.matcher(content);
            List<String> capitalWords = new ArrayList<>();
            while (matcher.find()) {
                capitalWords.add(matcher.group()); // Сохранение найденных слов
            }
            System.out.println("Найденные слова с заглавной буквы: " + capitalWords);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        */

        // Task 8
        /*
        Pattern digitPattern = Pattern.compile("^\\d+$"); // Регулярное выражение для строки, состоящей только из цифр
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку для проверки: ");
        String input = sc.nextLine();
        if (digitPattern.matcher(input).matches()) {
            System.out.println("Строка состоит только из цифр.");
        } else {
            System.out.println("Строка содержит недопустимые символы.");
        }
        */
    }
}


