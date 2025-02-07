import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Task 1
        String city = sc.nextLine(); // Считываем название города
        System.out.println(city.length() % 2 == 0 ? "Четное" : "Нечетное"); // Проверяем четность длины
        */

        /* Task 2
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(word1.length() > word2.length() ? word1 : word2); // Сравниваем длины слов
        */

        /* Task 3
        String city1 = sc.nextLine();
        String city2 = sc.nextLine();
        String city3 = sc.nextLine();
        String longest = city1.length() >= city2.length() ? (city1.length() >= city3.length() ? city1 : city3) : (city2.length() >= city3.length() ? city2 : city3);
        String shortest = city1.length() <= city2.length() ? (city1.length() <= city3.length() ? city1 : city3) : (city2.length() <= city3.length() ? city2 : city3);
        System.out.println("Самое длинное: " + longest + ", Самое короткое: " + shortest);
        */

        /* Task 4
        String word = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(k > 0 && k <= word.length() ? word.charAt(k - 1) : "Ошибка"); // Выводим k-й символ
        */

        /* Task 5
        String word = sc.nextLine();
        System.out.println(word.charAt(1) == word.charAt(3) ? "Одинаковы" : "Разные"); // Сравниваем второй и четвертый символы
        */

        /* Task 6
        String word = sc.nextLine();
        System.out.println(word.charAt(0) == word.charAt(word.length() - 1) ? "Да" : "Нет"); // Проверяем первую и последнюю буквы
        */

        /* Task 7
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(word1.charAt(0) == word2.charAt(word2.length() - 1) ? "Да" : "Нет"); // Сравниваем первую букву первого слова и последнюю второго
        */

        /* Task 8
        String word = sc.nextLine();
        System.out.println("" + word.charAt(1) + word.charAt(3)); // Выводим 2-й и 4-й символы
        */

        /* Task 9
        String word = sc.nextLine();
        String firstHalf = word.substring(0, word.length() / 2); // Получаем первую половину
        System.out.println(firstHalf); // Выводим первую половину
        */

        /* Task 10
        String text = sc.nextLine();
        int sum = 0;
        int maxDigit = -1;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit; // Суммируем цифры
                if (digit > maxDigit) {
                    maxDigit = digit; // Находим максимальную цифру
                }
            }
        }
        System.out.println("Сумма: " + sum + ", Максимальная цифра: " + maxDigit);
        */

        /* Task 11
        String text = sc.nextLine();
        StringBuilder digits = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c); // Собираем все цифры
            }
        }
        System.out.println(digits.toString()); // Выводим строку с цифрами
        */

        /* Task 12
        String word = "яблоко";
        String block = word.substring(1, 5); // Получаем "блок"
        String oko = word.substring(3); // Получаем "око"
        System.out.println(block + ", " + oko); // Выводим слова
        */

        /* Task 13
        String word = "информатика";
        String forma = word.substring(1, 5); // Получаем "форма"
        String tik = word.substring(5); // Получаем "тик"
        System.out.println(forma + ", " + tik); // Выводим слова
        */

        /* Task 14
        String word = sc.nextLine();
        int mid = word.length() / 2; // Находим середину слова
        String swapped = word.substring(mid) + word.substring(0, mid); // Меняем местами половины
        System.out.println(swapped); // Выводим результат

        // Способ с использованием цикла
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        for (int i = 0; i < mid; i++) {
            firstHalf.append(word.charAt(i)); // Первая половина
            secondHalf.append(word.charAt(mid + i)); // Вторая половина
        }
        System.out.println(secondHalf.toString() + firstHalf.toString()); // Выводим результат
        */

        /* Task 15
        String word = sc.nextLine();
        int k = sc.nextInt();
        String withoutFirstK = word.substring(k); // Убираем первые k букв
        String moved = withoutFirstK + word.substring(0, k); // Перемещаем первые k букв в конец
        System.out.println(moved); // Выводим результат

        // Способ с использованием цикла
        StringBuilder movedWithLoop = new StringBuilder();
        for (int i = k; i < word.length(); i++) {
            movedWithLoop.append(word.charAt(i)); // Добавляем оставшиеся буквы
        }
        for (int i = 0; i < k; i++) {
            movedWithLoop.append(word.charAt(i)); // Добавляем первые k букв в конец
        }
        System.out.println(movedWithLoop.toString()); // Выводим результат
        */

        /* Task 16
        String clubName = sc.nextLine();
        for (char c : clubName.toCharArray()) {
            System.out.println(c); // Печатаем каждую букву на новой строке
        }
        */

        /* Task 17
        String word = sc.nextLine();
        StringBuilder reversed = new StringBuilder(word).reverse(); // Переворачиваем слово
        System.out.println(reversed.toString()); // Выводим результат
        */

        /* Task 18
        String s1 = sc.nextLine();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 != 0) { // Проверяем нечетные индексы
                s2.append(s1.charAt(i)); // Добавляем нечетные буквы
            }
        }
        System.out.println(s2.toString()); // Выводим результат
        */

        /* Task 19
        char symbol = sc.next().charAt(0);
        int count = sc.nextInt();
        StringBuilder repeatedSymbols = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeatedSymbols.append(symbol); // Добавляем символ заданное количество раз
        }
        System.out.println(repeatedSymbols.toString()); // Выводим результат
        */

        /* Task 20
        String word = sc.nextLine();
        String result = "++++" + word + "-----"; // Добавляем символы в начале и конце
        System.out.println(result); // Выводим результат
        */

        /* Task 21
        String sentence = sc.nextLine();
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        int count1 = 0, count2 = 0;
        for (char c : sentence.toCharArray()) {
            if (c == char1) count1++; // Считаем вхождения первого символа
            if (c == char2) count2++; // Считаем вхождения второго символа
        }
        System.out.println("Символ '" + char1 + "' встречается " + count1 + " раз, символ '" + char2 + "' встречается " + count2 + " раз.");
        */

        /* Task 22
        String sentence = sc.nextLine();
        StringBuilder combinations = new StringBuilder();
        for (int i = 0; i < sentence.length() - 1; i++) {
            combinations.append(sentence.charAt(i)).append(sentence.charAt(i + 1)).append(" "); // Собираем буквосочетания
        }
        System.out.println(combinations.toString().trim()); // Выводим результат
        */

        /* Task 23
        String text = sc.nextLine();
        int plusCount = 0, starCount = 0;
        for (char c : text.toCharArray()) {
            if (c == '+') plusCount++; // Считаем вхождения символа '+'
            if (c == '*') starCount++; // Считаем вхождения символа '*'
        }
        System.out.println("Символ '+' встречается " + plusCount + " раз, символ '*' встречается " + starCount + " раз.");
        */

        /* Task 24
        String sentence = sc.nextLine();
        String substring1 = "ро"; // Буквосочетание для поиска
        String substring2 = sc.next(); // Вводим буквосочетание из двух букв
        String substring3 = sc.next(); // Вводим произвольное буквосочетание

        int count1 = 0, count2 = 0, count3 = 0;

        // Подсчет вхождений для первого буквосочетания
        int index = 0;
        while ((index = sentence.indexOf(substring1, index)) != -1) {
            count1++;
            index += substring1.length();
        }

        // Подсчет вхождений для второго буквосочетания
        index = 0;
        while ((index = sentence.indexOf(substring2, index)) != -1) {
            count2++;
            index += substring2.length();
        }

        // Подсчет вхождений для третьего буквосочетания
        index = 0;
        while ((index = sentence.indexOf(substring3, index)) != -1) {
            count3++;
            index += substring3.length();
        }

        System.out.println("Число вхождений '" + substring1 + "': " + count1);
        System.out.println("Число вхождений '" + substring2 + "': " + count2);
        System.out.println("Число вхождений '" + substring3 + "': " + count3);
        */

        /* Task 25
        String sentence = sc.nextLine();
        int commaIndex = sentence.indexOf(',');
        if (commaIndex != -1) {
            System.out.println(sentence.substring(0, commaIndex)); // Выводим все символы до первой запятой
        } else {
            System.out.println("Запятая не найдена."); // Если запятая отсутствует
        }
        */

        /* Task 26
        String sentence = sc.nextLine();
        int firstE = sentence.indexOf('е');
        int lastE = sentence.lastIndexOf('е');
        System.out.println("Первая 'е' на позиции: " + firstE);
        System.out.println("Последняя 'е' на позиции: " + lastE);
        */

        /* Task 27
        String sentence = sc.nextLine();
        String updatedSentence = sentence.replace("да", "не"); // Заменяем все вхождения "да" на "не"
        System.out.println(updatedSentence); // Выводим результат
        */

        /* Task 28
        String sentence = sc.nextLine();
        String s1 = sc.next(); // Подстрока для замены
        String s2 = sc.next(); // Подстрока, на которую заменяем
        String updatedSentence = sentence.replace(s1, s2); // Заменяем все вхождения s1 на s2
        System.out.println(updatedSentence); // Выводим результат
        */

        /* Task 29
        String word = sc.nextLine();
        int mid = word.length() / 2; // Находим середину слова
        StringBuilder swapped = new StringBuilder();
        for (int i = 0; i < mid; i++) {
            swapped.append(word.charAt(mid + i)); // Добавляем вторую половину
            swapped.append(word.charAt(i)); // Добавляем первую половину
        }
        System.out.println(swapped.toString()); // Выводим результат
        */

        /* Task 30
        String word = sc.nextLine();
        int k = sc.nextInt();
        int s = sc.nextInt();
        StringBuilder result = new StringBuilder(word);
        String sub = result.substring(k, s); // Получаем подстроку
        result.replace(k, s, new StringBuilder(sub).reverse().toString()); // Заменяем подстроку на перевернутую
        System.out.println(result.toString()); // Выводим результат
        */

        /* Task 31
        String text = sc.nextLine();
        int maxCount = 0;
        char maxChar = '\0'; // Переменная для хранения символа с максимальным количеством вхождений
        int currentCount = 1;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                currentCount++; // Увеличиваем счетчик, если символ повторяется
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount; // Обновляем максимальное количество
                    maxChar = text.charAt(i - 1); // Обновляем символ
                }
                currentCount = 1; // Сбрасываем счетчик
            }
        }
        // Проверка последнего символа
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxChar = text.charAt(text.length() - 1);
        }

        System.out.println("Символ '" + maxChar + "' встречается " + maxCount + " раз подряд.");
        */

        /* Task 32
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (char c : word1.toCharArray()) {
            result.append(word2.indexOf(c) != -1 ? "да " : "нет "); // Проверяем, входит ли буква в второе слово
        }
        System.out.println(result.toString().trim()); // Выводим результат
        */

        /* Task 33
        String[] words = new String[10];
        for (int i = 0; i < 10; i++) {
            words[i] = sc.nextLine(); // Заполняем массив из 10 слов
        }
        */

        /* Task 34
        String sentence1 = sc.nextLine();
        String sentence2 = sc.nextLine();
        String[] words1 = sentence1.split(" "); // Разбиваем первое предложение на слова
        StringBuilder result = new StringBuilder();

        for (String word : words1) {
            if (sentence2.contains(word)) {
                result.append(word).append(" "); // Проверяем, входит ли слово во второе предложение
            }
        }
        System.out.println(result.toString().trim()); // Выводим результат
        */
    }
}

