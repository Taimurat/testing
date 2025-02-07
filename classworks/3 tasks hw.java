import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Перестановка элементов массива
        /*
        int[] array = new int[15];
        System.out.println("Введите 15 элементов массива:");
        for (int i = 0; i < 15; i++) {
            array[i] = sc.nextInt(); // Ввод элементов массива
        }

        // a) Перестановка элементов между 2-м и 10-м
        reverseSubArray(array, 2, 10);
        System.out.println("Массив после перестановки между 2-м и 10-м элементами: " + Arrays.toString(array));

        // b) Перестановка между k-м и s-м элементами
        System.out.println("Введите значения k и s (k < s):");
        int k = sc.nextInt();
        int s = sc.nextInt();
        reverseSubArray(array, k, s);
        System.out.println("Массив после перестановки между " + k + "-м и " + s + "-м элементами: " + Arrays.toString(array));

        // c) Перестановка между максимальным и минимальным элементами
        reverseBetweenMinMax(array);
        System.out.println("Массив после перестановки между максимальным и минимальным элементами: " + Arrays.toString(array));
        */
        
        // Task 2: Поменять местами первый отрицательный и последний положительный элементы
        /*
        swapFirstNegativeLastPositive(array);
        System.out.println("Массив после замены первого отрицательного и последнего положительного: " + Arrays.toString(array));
        */

        // Task 3: Работа с последовательностью чисел
        /*
        System.out.println("Введите количество элементов последовательности:");
        int n = sc.nextInt();
        int[] sequence = new int[n];
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt(); // Ввод элементов последовательности
        }

        // a) Получить все числа, которые входят в последовательность по одному разу
        System.out.println("Числа, входящие в последовательность по одному разу: " + getUniqueNumbers(sequence));

        // b) Получить числа, взятые по одному из каждой группы равных членов
        System.out.println("Числа, взятые по одному из каждой группы равных членов: " + getOneFromEachGroup(sequence));

        // c) Найти число различных членов последовательности
        System.out.println("Количество различных членов последовательности: " + countDistinctMembers(sequence));

        // d) Узнать, сколько чисел входит в последовательность более чем по одному разу
        System.out.println("Количество чисел, входящих более чем по одному разу: " + countMoreThanOnce(sequence));

        // e) Узнать, имеется ли в последовательности хотя бы одна пара совпадающих чисел
        System.out.println("Имеется ли хотя бы одна пара совпадающих чисел: " + hasDuplicate(sequence));
        */

        // Task 4: Сумма наибольших значений элементов строк матрицы
        /*
        System.out.println("Введите размеры матрицы (m x n):");
        int m = sc.nextInt();
        int nCols = sc.nextInt();
        int[][] matrix = new int[m][nCols];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < nCols; j++) {
                matrix[i][j] = sc.nextInt(); // Ввод элементов матрицы
            }
        }
        System.out.println("Сумма наибольших значений элементов строк матрицы: " + sumOfMaxInRows(matrix));
        */

        // Task 5: Заполнение массива цифрами числа n в обратном порядке
        /*
        System.out.println("Введите натуральное число n (n <= 999999):");
        int number = sc.nextInt();
        int[] digitsArray = new int[6]; // Максимум 6 цифр для n <= 999999
        fillDigitsInReverse(number, digitsArray);
        System.out.println("Цифры числа в обратном порядке: " + Arrays.toString(digitsArray));
        */
    }

    // Метод для перестановки подмассива
    private static void reverseSubArray(int[] array, int start, int end) {
        for (int i = start; i < (end + start) / 2; i++) {
            int temp = array[i];
            array[i] = array[end - 1 - (i - start)];
            array[end - 1 - (i - start)] = temp; // Перестановка элементов
        }
    }

    // Метод для перестановки между максимальным и минимальным элементами
    private static void reverseBetweenMinMax(int[] array) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i; // Находим индекс минимального элемента
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i; // Находим индекс максимального элемента
            }
        }
        if (minIndex > maxIndex) { // Убедимся, что minIndex меньше maxIndex
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        reverseSubArray(array, minIndex, maxIndex + 1); // Перестановка между min и max
    }

    // Метод для замены первого отрицательного и последнего положительного элементов
    private static void swapFirstNegativeLastPositive(int[] array) {
        int firstNegativeIndex = -1;
        int lastPositiveIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && firstNegativeIndex == -1) {
                firstNegativeIndex = i; // Находим первый отрицательный элемент
            }
            if (array[i] > 0) {
                lastPositiveIndex = i; // Обновляем индекс последнего положительного элемента
            }
        }

        // Меняем местами, если оба индекса найдены
        if (firstNegativeIndex != -1 && lastPositiveIndex != -1) {
            int temp = array[firstNegativeIndex];
            array[firstNegativeIndex] = array[lastPositiveIndex];
            array[lastPositiveIndex] = temp;
        }
    }

    // Метод для получения уникальных чисел
    private static List<Integer> getUniqueNumbers(int[] sequence) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : sequence) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }
        return uniqueNumbers;
    }

    // Метод для получения одного числа из каждой группы равных членов
    private static List<Integer> getOneFromEachGroup(int[] sequence) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : sequence) {
            if (!seen.contains(num)) {
                result.add(num);
                seen.add(num);
            }
        }
        return result;
    }

    // Метод для подсчета различных членов последовательности
    private static int countDistinctMembers(int[] sequence) {
        Set<Integer> distinctMembers = new HashSet<>();
        for (int num : sequence) {
            distinctMembers.add(num);
        }
        return distinctMembers.size();
    }

    // Метод для подсчета чисел, входящих более чем по одному разу
    private static int countMoreThanOnce(int[] sequence) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : sequence) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int value : countMap.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }

    // Метод для проверки наличия хотя бы одной пары совпадающих чисел
    private static boolean hasDuplicate(int[] sequence) {
        Set<Integer> seen = new HashSet<>();
        for (int num : sequence) {
            if (seen.contains(num)) {
                return true; // Если число уже встречалось, есть дубликат
            }
            seen.add(num);
        }
        return false; // Дубликатов нет
    }

    // Метод для нахождения суммы наибольших значений элементов строк матрицы
    private static int sumOfMaxInRows(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            int max = Integer.MIN_VALUE;
            for (int value : row) {
                if (value > max) {
                    max = value; // Находим максимальное значение в строке
                }
            }
            sum += max; // Добавляем максимальное значение в сумму
        }
        return sum; // Возвращаем общую сумму
    }

    // Метод для заполнения массива цифрами числа n в обратном порядке
    private static void fillDigitsInReverse(int number, int[] digitsArray) {
        int index = 0;
        while (number > 0 && index < digitsArray.length) {
            digitsArray[index] = number % 10; // Получаем последнюю цифру
            number /= 10; // Убираем последнюю цифру
            index++;
        }
        // Остальные элементы массива остаются равными 0 по умолчанию
    }
}



