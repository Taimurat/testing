import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Task 1: Номер максимального и минимального из чисел */
        /*
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // a) Номер максимального числа (последний)
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[maxIndex]) {
                maxIndex = i; // Обновляем индекс, если нашли большее или равное
            }
        }
        System.out.println("Номер максимального: " + (maxIndex + 1));

        // b) Номер минимального числа (первый)
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i; // Обновляем индекс, если нашли меньшее
            }
        }
        System.out.println("Номер минимального: " + (minIndex + 1));
        */

        /* Task 2: Работа с парами чисел */
        /*
        int n = sc.nextInt();
        int maxSum = Integer.MIN_VALUE;
        int minProduct = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            int product = a * b;

            if (sum > maxSum) {
                maxSum = sum; // Находим максимальную сумму
            }
            if (product < minProduct) {
                minProduct = product; // Находим минимальное произведение
            }
        }
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Минимальное произведение: " + minProduct);
        */

        /* Task 3: Соседние числа */
        /*
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int maxIndex1 = 0, maxIndex2 = 0;
        int minIndex1 = 0, minIndex2 = 0;

        for (int i = 0; i < n - 1; i++) {
            int sum = a[i] + a[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex1 = i;
                maxIndex2 = i + 1; // Сохраняем индексы
            }
            if (sum < minSum) {
                minSum = sum;
                minIndex1 = i;
                minIndex2 = i + 1; // Сохраняем индексы
            }
        }
        System.out.println("Максимальная сумма: " + maxSum + " (индексы: " + (maxIndex1 + 1) + ", " + (maxIndex2 + 1) + ")");
        System.out.println("Минимальная сумма: " + minSum + " (индексы: " + (minIndex1 + 1) + ", " + (minIndex2 + 1) + ")");
        */

        /* Task 4: Сумма положительных четных чисел */
        /*
        int sum = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == 0) break; // Завершение ввода
            if (number > 0 && number % 2 == 0) {
                sum += number; // Суммируем положительные четные числа
            }
        }
        System.out.println("Сумма положительных четных чисел: " + sum);
        */

        /* Task 5: Номер первого числа больше K */
        /*
        int K = sc.nextInt();
        int index = 0;
        int position = 0;

        while (true) {
            int number = sc.nextInt();
            if (number == 0) break; // Завершение ввода
            position++;
            if (number > K && index == 0) {
                index = position; // Сохраняем позицию первого числа больше K
            }
        }
        System.out.println("Номер первого числа больше K: " + index);
        */

        /* Task 6: Заполнение массива */
        /*
        // a) Арифметическая прогрессия
        int a = sc.nextInt(); // Первый член
        int p = sc.nextInt(); // Разность
        int[] arithmeticProgression = new int[10];
        for (int i = 0; i < 10; i++) {
            arithmeticProgression[i] = a + i * p; // Заполнение массива
        }
        System.out.println("Арифметическая прогрессия: ");
        for (int num : arithmeticProgression) {
            System.out.print(num + " ");
        }
        System.out.println();

        // b) Последовательность Фибоначчи
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 20; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Заполнение массива
        }
        System.out.println("Последовательность Фибоначчи: ");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        System.out.println();
        */

        /* Task 7: Работа с массивом */
        /*
        int[] array = {1, 2, 3, 4, 5}; // Пример массива
        int sum = 0;
        int product = 1;
        int sumOfSquares = 0;
        int sumFirstSix = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // Сумма всех элементов
            product *= array[i]; // Произведение всех элементов
            sumOfSquares += array[i] * array[i]; // Сумма квадратов
            if (i < 6) {
                sumFirstSix += array[i]; // Сумма первых шести элементов
            }
        }

        System.out.println("Сумма всех элементов: " + sum);
        System.out.println("Произведение всех элементов: " + product);
        System.out.println("Сумма квадратов всех элементов: " + sumOfSquares);
        System.out.println("Сумма первых шести элементов: " + sumFirstSix);

        // d) Сумма элементов с k1 по k2
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int sumRange = 0;
        for (int i = k1 - 1; i < k2; i++) {
            sumRange += array[i]; // Сумма элементов с k1 по k2
        }
        System.out.println("Сумма элементов с " + k1 + " по " + k2 + ": " + sumRange);

        // e) Среднее арифметическое всех элементов
        double average = (double) sum / array.length;
        System.out.println("Среднее арифметическое всех элементов: " + average);

        // f) Среднее арифметическое элементов с s1 по s2
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        double averageRange = 0;
        for (int i = s1 - 1; i < s2; i++) {
            averageRange += array[i]; // Сумма элементов с s1 по s2
        }
        averageRange /= (s2 - s1 + 1); // Делим на количество элементов
        System.out.println("Среднее арифметическое элементов с " + s1 + " по " + s2 + ": " + averageRange);
        */

        /* Task 8: Максимальный и минимальный элементы массива */
        /*
        int[] array = {3, 5, 1, 4, 2}; // Пример массива
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max; // Обновляем второй максимальный
                max = array[i]; // Обновляем максимальный
                maxIndex = i; // Сохраняем индекс максимального
            } else if (array[i] > secondMax) {
                secondMax = array[i]; // Обновляем второй максимальный
            }

            if (array[i] < min) {
                secondMin = min; // Обновляем второй минимальный
                                minIndex = i; // Сохраняем индекс минимального
            } else if (array[i] < secondMin) {
                secondMin = array[i]; // Обновляем второй минимальный
            }
        }

        System.out.println("Максимальный элемент: " + max + " (индекс: " + maxIndex + ")");
        System.out.println("Максимальный элемент без учета: " + secondMax);
        System.out.println("Минимальный элемент: " + min + " (индекс: " + minIndex + ")");
        System.out.println("Минимальный элемент без учета: " + secondMin);
        */

        /* Task 9: Сравнение и обмен элементов массива */
        /*
        int[] array = {5, 3, 8, 1, 4}; // Пример массива
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                // Обмен местами
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println("Последний элемент после сортировки: " + array[array.length - 1]);
        */

        /* Task 10: Обмен местами элементов массива */
        /*
        int[] array = {5, 3, 8, 1, 4}; // Пример массива
        // a) Обмен второго и пятого элементов
        int temp = array[1];
        array[1] = array[4];
        array[4] = temp;

        // b) Обмен m-го и n-го элементов
        int m = sc.nextInt();
        int n = sc.nextInt();
        temp = array[m - 1]; // Индексы начинаются с 0
        array[m - 1] = array[n - 1];
        array[n - 1] = temp;

        // c) Обмен третьего и максимального элементов
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i; // Находим индекс максимального
            }
        }
        temp = array[2]; // Третий элемент
        array[2] = array[maxIndex];
        array[maxIndex] = temp;

        // d) Обмен первого и минимального элементов
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i; // Находим индекс минимального
            }
        }
        temp = array[0]; // Первый элемент
        array[0] = array[minIndex];
        array[minIndex] = temp;

        System.out.println("Массив после обменов: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        */

        /* Task 11: Среднее арифметическое столбцов матрицы */
        /*
        int n = sc.nextInt(); // Количество строк
        double[][] matrix = new double[n][9];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = sc.nextDouble(); // Ввод элементов матрицы
            }
        }

        // a) Среднее арифметическое каждого столбца
        for (int j = 0; j < 9; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Среднее арифметическое столбца " + (j + 1) + ": " + (sum / n));
        }

        // b) Среднее арифметическое четных столбцов
        for (int j = 1; j < 9; j += 2) { // Четные столбцы: 2, 4, 6, 8 (индексы 1, 3, 5, 7)
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Среднее арифметическое четного столбца " + (j + 1) + ": " + (sum / n));
        }
        */

        /* Task 12: Деление элементов матрицы на наибольший по модулю элемент */
        /*
        int n = sc.nextInt(); // Количество строк
        int m = sc.nextInt(); // Количество столбцов
        double[][] matrix = new double[n][m];
        double maxElement = Double.MIN_VALUE;

        // Ввод элементов матрицы и нахождение максимального по модулю элемента
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextDouble();
                if (Math.abs(matrix[i][j]) > Math.abs(maxElement)) {
                    maxElement = matrix[i][j]; // Обновляем максимальный элемент
                }
            }
        }

        // Создание новой матрицы и деление на максимальный элемент
        double[][] newMatrix = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newMatrix[i][j] = matrix[i][j] / maxElement; // Делим каждый элемент
            }
        }

        // Вывод новой матрицы
        System.out.println("Новая матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
        */

        /* Task 13: Среднее арифметическое наибольшего и наименьшего значений матрицы */
        /*
        int n = sc.nextInt(); // Количество строк
        int m = sc.nextInt(); // Количество столбцов
        double[][] matrix = new double[n][m];
        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;

        // Ввод элементов матрицы и нахождение min и max
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextDouble();
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j]; // Обновляем минимальное значение
                }
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j]; // Обновляем максимальное значение
                }
            }
        }

        double average = (minValue + maxValue) / 2; // Среднее арифметическое
        System.out.println("Среднее арифметическое наибольшего и наименьшего значений: " + average);
        */

        /* Task 14: Поиск ненулевых элементов в квадратной матрице 15x15 */
        /*
        int[][] matrix = new int[15][15];
        boolean hasNonZero = false;

        // Ввод элементов матрицы
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] != 0) {
                    hasNonZero = true; // Обнаружен ненулевой элемент
                }
            }
        }

        if (hasNonZero) {
            // a) Индекс одного из ненулевых элементов
            System.out.println("Индекс одного из ненулевых элементов: (0, 0)");
            // b) Индексы всех ненулевых элементов
            System.out.println("Индексы всех ненулевых элементов:");
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 15; j++) {
                    if (matrix[i][j] != 0) {
                        System.out.println("Элемент: " + matrix[i][j] + " (индекс: " + i + ", " + j + ")");
                    }
                }
            }
        } else {
            System.out.println("В матрице нет ненулевых элементов.");
        }
        */
    }
}




