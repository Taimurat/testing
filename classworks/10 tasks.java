import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Task 1
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Выводим каждую строку файла
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        */

        /* Task 2
        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            while (br.readLine() != null) {
                lineCount++; // Считаем количество строк
            }
            System.out.println("Количество строк: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        */

        /* Task 3
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line); // Выводим номер строки и её содержимое
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        */

        /* Task 4
        System.out.print("Введите слово для поиска: ");
        String word = sc.nextLine();
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\b" + Pattern.quote(word) + "\\b").length - 1; // Считаем вхождения слова
            }
            System.out.println("Количество вхождений слова '" + word + "': " + count);
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        */

        /* Task 5
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line); // Считываем и записываем содержимое
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        */

        /* Task 6
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length; // Считаем количество слов
            }
            System.out.println("Количество слов: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        */

        /* Task 7
        System.out.print("Введите слово для замены: ");
        String oldWord = sc.nextLine();
        System.out.print("Введите новое слово: ");
        String newWord = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.replace(oldWord, newWord)); // Заменяем слово и записываем
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        */

        /* Task 8
        System.out.print("Введите два числа: ");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Результат: " + (a / b)); // Деление
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!"); // Обработка исключения
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Некорректный ввод!"); // Обработка исключения
        }
        */

        /* Task 9
        Scanner sc = new Scanner(System.in);
        String path;

        while (true) {
            System.out.print("Введите путь к файлу: ");
            path = sc.nextLine(); // Считываем путь к файлу
            File file = new File(path); // Создаем объект файла

            if (file.exists()) { // Проверяем, существует ли файл
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line); // Выводим содержимое файла
                    }
                } catch (IOException e) {
                    e.printStackTrace(); // Обработка исключений
                }
                break; // Выход из цикла, если файл найден
            } else {
                System.out.println("Файл не найден. Пожалуйста, укажите другой путь."); // Сообщение об ошибке
            }
        }
        
        */
        
        /* Task 10
        System.out.print("Введите два числа: ");
        try {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            System.out.println("Результат: " + (a / b)); // Деление
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный ввод числа!"); // Обработка исключения
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!"); // Обработка исключения
        }
        */

        /* Task 11
        String[] strings = {"123", "456", "abc", "789"};
        for (String str : strings) {
            try {
                int number = Integer.parseInt(str); // Преобразуем строку в число
                System.out.println("Преобразовано: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: '" + str + "' не является числом."); // Обработка исключения
            }
        }
        */

        /* Task 12
        class NegativeNumberException extends Exception {
            public NegativeNumberException(String message) {
                super(message);
            }
        }

        System.out.print("Введите число: ");
        int number = sc.nextInt();
        try {
            if (number < 0) {
                throw new NegativeNumberException("Ошибка: Введено отрицательное число!"); // Вызываем исключение
            }
            System.out.println("Вы ввели: " + number);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage()); // Выводим сообщение об ошибке
        }
        */

        /* Task 13
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            int lineNumber = 1;
            boolean isEmpty = true; // Флаг для проверки пустоты файла
            while ((line = br.readLine()) != null) {
                isEmpty = false; // Если хотя бы одна строка прочитана, файл не пуст
                try {
                    int number = Integer.parseInt(line); // Пробуем конвертировать строку в число
                    System.out.println("Строка " + lineNumber + ": " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: Строка " + lineNumber + " не может быть конвертирована в число.");
                }
                lineNumber++;
            }
            if (isEmpty) {
                throw new Exception("Файл пуст!"); // Бросаем исключение, если файл пуст
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден."); // Обработка исключения
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Выводим сообщение об ошибке
        }
        */

        /* Task 14
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String testEmail = "example@mail.ru"; // Пример тестового email
        if (testEmail.matches(emailRegex)) {
            System.out.println("Email корректен: " + testEmail);
        } else {
            System.out.println("Email некорректен: " + testEmail);
        }
        */

        /* Task 15
        String phoneRegex = "^\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}$";
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("phones.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.matches(phoneRegex)) {
                    bw.write(line); // Записываем корректные номера телефонов
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        */

        /* Task 16
        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})$";
        String text = "Сегодня 01.01.2023 и 31.12.2022"; // Пример текста
        Matcher matcher = Pattern.compile(dateRegex).matcher(text);
        while (matcher.find()) {
            System.out.println("Найдена дата: " + matcher.group()); // Выводим найденные даты
        }
        */

        /* Task 17
        String capitalWordRegex = "\\b[A-ZА-ЯЁ][a-zа-яё]*\\b"; // Регулярное выражение для слов с заглавной буквы
        String text = "Сегодня отличный День для прогулки"; // Пример текста
        Matcher matcher = Pattern.compile(capitalWordRegex).matcher(text);
        while (matcher.find()) {
            System.out.println("Найдено слово: " + matcher.group()); // Выводим найденные слова
        }
        */

        /* Task 18
        String digitRegex = "^\\d+$"; // Регулярное выражение для проверки строки на цифры
        String testString1 = "12345"; // Пример строки
        String testString2 = "123a45"; // Пример строки
        System.out.println(testString1 + " соответствует: " + testString1.matches(digitRegex)); // Проверка
        System.out.println(testString2 + " соответствует: " + testString2.matches(digitRegex)); // Проверка
        */
    }
}

