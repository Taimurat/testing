import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Task 1
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        // Считываем матрицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // A) Номера строк, все элементы которых - нули
        System.out.println("Строки с нулями:");
        for (int i = 0; i < n; i++) {
            boolean allZeros = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    allZeros = false;
                    break;
                }
            }
            if (allZeros) {
                System.out.println(i);
            }
        }

        // Б) Номера строк, элементы в которых одинаковы
        System.out.println("Строки с одинаковыми элементами:");
        for (int i = 0; i < n; i++) {
            boolean allEqual = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i][0]) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual) {
                System.out.println(i);
            }
        }

        // В) Номера строк, все элементы которых нечетны
        System.out.println("Строки с нечетными элементами:");
        for (int i = 0; i < n; i++) {
            boolean allOdd = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 0) {
                    allOdd = false;
                    break;
                }
            }
            if (allOdd) {
                System.out.println(i);
            }
        }

        // Г) Номера строк, элементы которых образуют монотонную последовательность
        System.out.println("Строки с монотонной последовательностью:");
        for (int i = 0; i < n; i++) {
            boolean increasing = true;
            boolean decreasing = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][j - 1]) {
                    increasing = false;
                }
                if (matrix[i][j] > matrix[i][j - 1]) {
                    decreasing = false;
                }
            }
            if (increasing || decreasing) {
                System.out.println(i);
            }
        }

        // Д) Номера строк, элементы которых образуют палиндромы
        System.out.println("Строки с палиндромами:");
        for (int i = 0; i < n; i++) {
            boolean isPalindrome = true;
            for (int j = 0; j < n / 2; j++) {
                if (matrix[i][j] != matrix[i][n - j - 1]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(i);
            }
        }
        */

        /* Task 2
        int n = sc.nextInt();
        double[][] matrix = new double[n][n];

        // Считываем матрицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        double sumAbove = 0, sumOn = 0, sumBelow = 0;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] < 0) { // Если первый элемент строки отрицательный
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        sumOn += matrix[i][j]; // На главной диагонали
                    } else if (i < j) {
                        sumAbove += matrix[i][j]; // Выше главной диагонали
                    } else {
                        sumBelow += matrix[i][j]; // Ниже главной диагонали
                    }
                }
            }
        }

        System.out.println("Сумма на главной диагонали: " + sumOn);
        System.out.println("Сумма ниже главной диагонали: " + sumBelow);
        */

        /* Task 3
        String sentence = sc.nextLine().trim(); // Убираем начальные пробелы
        String firstWord = sentence.split(" ")[0]; // Получаем первое слово
        int countO = 0;

        for (char c : firstWord.toCharArray()) {
            if (c == 'о') {
                countO++; // Считаем буквы 'о'
            }
        }
        System.out.println("Количество букв 'о' в первом слове: " + countO);
        */

        /* Task 4
        String sequence = sc.nextLine();
        int count = 0;

        // Определяем количество одинаковых символов в начале
        char firstChar = sequence.charAt(0);
        while (count < sequence.length() && sequence.charAt(count) == firstChar) {
            count++;
        }

        System.out.println("Количество одинаковых символов в начале: " + count);
        */

        /* Task 5
        String text = sc.nextLine();
        int maxDigit = -1;
        int position = -1;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if (digit > maxDigit) {
                    maxDigit = digit;
                    position = i + 1; // Позиция с 1
                }
            }
        }
        System.out.println("Порядковый номер максимальной цифры: " + position);
        */

        /* Task 6
        String word = sc.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Слово является перевертышем: " + isPalindrome);
        */

        /* Task 7
        String sentence = sc.nextLine().trim(); // Убираем начальные пробелы
        String firstWord = sentence.split(" ")[0]; // Получаем первое слово
        int countO = 0;

        for (char c : firstWord.toCharArray()) {
            if (c == 'о') {
                countO++; // Считаем буквы 'о'
            }
        }
        System.out.println("Количество букв 'о' в первом слове: " + countO);
        */

        /* Task 8
        String word = sc.nextLine();
        int third = word.length() / 3;

        // а) Меняем местами трети
        String rearranged1 = word.substring(2 * third) + word.substring(0, third) + word.substring(third, 2 * third);
        System.out.println("Результат а): " + rearranged1);

        // б) Меняем местами трети
        String rearranged2 = word.substring(third, 2 * third) + word.substring(2 * third) + word.substring(0, third);
        System.out.println("Результат б): " + rearranged2);
        */

        /* Task 9
        String sentence = sc.nextLine(); // Считываем предложение

        // 1) Начальные и конечные пробелы отсутствуют
        String[] wordsWithoutSpaces = sentence.split(" ");
        int wordCountWithoutSpaces = wordsWithoutSpaces.length;
        System.out.println("Количество слов (без пробелов): " + wordCountWithoutSpaces);

        // 2) Начальные и конечные пробелы могут быть
        String trimmedSentence = sentence.trim(); // Убираем начальные и конечные пробелы
        String[] wordsWithSpaces = trimmedSentence.split("\\s+"); // Разбиваем по пробелам
        int wordCountWithSpaces = wordsWithSpaces.length; // Количество слов
        System.out.println("Количество слов (с пробелами): " + wordCountWithSpaces);
        */
    }
}

