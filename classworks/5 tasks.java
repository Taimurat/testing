import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Пример двумерного массива
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        // a) Проверка произведения элементов второго столбца
        System.out.println("Произведение элементов второго столбца трехзначное: " + isProductThreeDigit(array));

        // b) Проверка суммы элементов строки
        System.out.print("Введите номер строки для проверки: ");
        int rowNum = sc.nextInt();
        System.out.print("Введите число для сравнения: ");
        int number = sc.nextInt();
        System.out.println("Сумма элементов строки превышает заданное число: " + isRowSumExceeds(array, rowNum, number));
    }

    // a) Функция для проверки произведения элементов второго столбца
    public static boolean isProductThreeDigit(int[][] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i][1]; // Второй столбец (индекс 1)
        }
        return product >= 100 && product < 1000; // Проверка на трехзначность
    }

    // b) Функция для проверки суммы элементов строки
    public static boolean isRowSumExceeds(int[][] array, int rowNum, int number) {
        if (rowNum < 0 || rowNum >= array.length) {
            throw new IllegalArgumentException("Неверный номер строки");
        }
        int sum = 0;
        for (int j = 0; j < array[rowNum].length; j++) {
            sum += array[rowNum][j];
        }
        return sum > number; // Проверка суммы
    }
    
        // a) Проверка суммы элементов четвертой строки
    public static boolean isSumOfFourthRowTwoDigit(int[][] array) {
        if (array.length < 4) return false; // Проверка на наличие четвертой строки
        int sum = 0;
        for (int j = 0; j < array[3].length; j++) {
            sum += array[3][j]; // Четвертая строка (индекс 3)
        }
        return sum >= 10 && sum < 100; // Проверка на двузначность
    }

    // b) Проверка произведения элементов столбца
    public static boolean isColumnProductNotExceeds(int[][] array, int colNum, int limit) {
        if (colNum < 0 || colNum >= array[0].length) {
            throw new IllegalArgumentException("Неверный номер столбца");
        }
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i][colNum]; // Элементы указанного столбца
        }
        return product <= limit; // Проверка на превышение
    }
    
    public static int maxOfRowSumAndColumnSum(int[][] array, int rowNum, int colNum) {
        int rowSum = 0;
        for (int j = 0; j < array[rowNum].length; j++) {
            rowSum += array[rowNum][j]; // Сумма строки
        }

        int colSum = 0;
        for (int i = 0; i < array.length; i++) {
            colSum += array[i][colNum]; // Сумма столбца
        }

        return Math.max(rowSum, colSum); // Возвращаем максимум
    }

    // a) Проверка на столбец из нулей
    public static boolean hasZeroColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            boolean allZero = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) return true; // Столбец из нулей найден
        }
        return false; // Столбец из нулей не найден
    }

    // b) Проверка на столбец с элементами в диапазоне от 0 до b
    public static boolean hasColumnInRange(int[][] array, int b) {
        for (int j = 0; j < array[0].length; j++) {
            boolean inRange = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] < 0 || array[i][j] > b) {
                    inRange = false;
                    break;
                }
            }
            if (inRange) return true; // Столбец с элементами в диапазоне найден
        }
        return false; // Столбец с элементами в диапазоне не найден
    }

    // c) Проверка на столбец с четными элементами
    public static boolean hasEvenColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            boolean allEven = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) return true; // Столбец с четными элементами найден
        }
        return false; // Столбец с четными элементами не найден
    }

    // d) Проверка на столбец с равным количеством положительных и отрицательных элементов
    public static boolean hasEqualPosNegColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            int positiveCount = 0;
            int negativeCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] > 0) positiveCount++;
                if (array[i][j] < 0) negativeCount++;
            }
            if (positiveCount == negativeCount) return true; // Столбец с равным количеством найден
        }
        return false; // Столбец с равным количеством не найден
    }

    // e) Проверка на столбец с одинаковыми элементами
    public static boolean hasDuplicateColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            Set<Integer> seen = new HashSet<>();
            boolean hasDuplicates = false;
            for (int i = 0; i < array.length; i++) {
                if (seen.contains(array[i][j])) {
                    hasDuplicates = true;
                    break;
                }
                seen.add(array[i][j]);
            }
            if (hasDuplicates) return true; // Столбец с одинаковыми элементами найден
        }
        return false; // Столбец с одинаковыми элементами не найден
    }

    // f) Проверка на столбец с минимумом
    public static boolean hasColumnWithMinCount(int[][] array) {
        int minValue = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int value : row) {
                if (value < minValue) {
                    minValue = value; // Находим минимальное значение
                }
            }
        }

        for (int j = 0; j < array[0].length; j++) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] == minValue) {
                    count++;
                }
            }
            if (count >= 3) return true; // Столбец с минимумом найден
        }
        return false; // Столбец с минимумом не найден
    }
    
    // a) Перестановка двух строк с использованием дополнительного массива
    public static void swapRowsWithArray(int[][] array, int row1, int row2) {
        int[] temp = array[row1];
        array[row1] = array[row2];
        array[row2] = temp;
    }

    // a) Перестановка двух строк без использования дополнительного массива
    public static void swapRowsWithoutArray(int[][] array, int row1, int row2) {
        for (int j = 0; j < array[row1].length; j++) {
            int temp = array[row1][j];
            array[row1][j] = array[row2][j];
            array[row2][j] = temp;
        }
    }

    // b) Перестановка двух столбцов с использованием дополнительного массива
    public static void swapColumnsWithArray(int[][] array, int col1, int col2) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i][col1];
        }
        for (int i = 0; i < array.length; i++) {
            array[i][col1] = array[i][col2];
            array[i][col2] = temp[i];
        }
    }

    // b) Перестановка двух столбцов без использования дополнительного массива
    public static void swapColumnsWithoutArray(int[][] array, int col1, int col2) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][col1];
            array[i][col1] = array[i][col2];
            array[i][col2] = temp;
        }
    }
    
    // a) Формирование одномерного массива с первым четным элементом каждого столбца
    public static int[] firstEvenInColumns(int[][] array) {
        int[] result = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            result[j] = 0; // По умолчанию 0
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] % 2 == 0) {
                    result[j] = array[i][j]; // Находим первый четный элемент
                    break;
                }
            }
        }
        return result;
    }

    // b) Формирование одномерного массива с последним нечетным элементом каждой строки
    public static int[] lastOddInRows(int[][] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = 0; // По умолчанию 0
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (array[i][j] % 2 != 0) {
                    result[i] = array[i][j]; // Находим последний нечетный элемент
                    break;
                }
            }
        }
        return result;
    }
    
    // a) Создание третьего массива, сумма соответствующих элементов
    public static int[][] sumOfTwoArrays(int[][] array1, int[][] array2) {
        int rows = array1.length;
        int cols = array1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = array1[i][j] + array2[i][j]; // Сумма элементов
            }
        }
        return result;
    }

    // b) Создание третьего массива, проверка знаков
    public static int[][] signCheckArray(int[][] array1, int[][] array2) {
        int rows = array1.length;
        int cols = array1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((array1[i][j] >= 0 && array2[i][j] >= 0) || (array1[i][j] < 0 && array2[i][j] < 0)) {
                    result[i][j] = 100; // Одинаковый знак
                } else {
                    result[i][j] = 0; // Разные знаки
                }
            }
        }
        return result;
    }

    // a) Элементы над главной диагональю
    public static int[] elementsAboveMainDiagonal(int[][] array) {
        int n = array.length;
        int size = n * (n - 1) / 2; // Количество элементов над главной диагональю
        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                result[index++] = array[i][j]; // Заполнение массива
            }
        }
        return result;
    }

    // b) Элементы под главной диагональю
    public static int[] elementsBelowMainDiagonal(int[][] array) {
        int n = array.length;
        int size = n * (n - 1) / 2; // Количество элементов под главной диагональю
        int[] result = new int[size];
        int index = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                result[index++] = array[i][j]; // Заполнение массива
            }
        }
        return result;
    }

    // c) Элементы над побочной диагональю
    public static int[] elementsAboveSecondaryDiagonal(int[][] array) {
        int n = array.length;
        int size = n * (n - 1) / 2; // Количество элементов над побочной диагональю
        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                result[index++] = array[i][j]; // Заполнение массива
            }
        }
        return result;
    }

    // d) Элементы под побочной диагональю
    public static int[] elementsBelowSecondaryDiagonal(int[][] array) {
        int n = array.length;
        int size = n * (n - 1) / 2; // Количество элементов под побочной диагональю
        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1 - i + 1; j < n; j++) {
                result[index++] = array[i][j]; // Заполнение массива
            }
        }
        return result;
    }
    
    // a) Элементы, кратные трем
    public static int[] elementsDivisibleByThree(int[][] array) {
        List<Integer> resultList = new ArrayList<>();
        for (int[] row : array) {
            for (int value : row) {
                if (value % 3 == 0) {
                    resultList.add(value); // Добавляем элементы, кратные трем
                }
            }
        }
        return resultList.stream().mapToInt(i -> i).toArray(); // Преобразуем в массив
    }

    // b) Положительные и остальные элементы
    public static int[][] separatePositiveAndNegative(int[][] array) {
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();
        for (int[] row : array) {
            for (int value : row) {
                if (value > 0) {
                    positiveList.add(value); // Положительные элементы
                } else {
                    negativeList.add(value); // Остальные элементы
                }
            }
        }
        return new int[][]{
            positiveList.stream().mapToInt(i -> i).toArray(),
            negativeList.stream().mapToInt(i -> i).toArray()
        };
    }
    
    public static void createAndFillStaggeredArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = sc.nextInt();
        int[][] staggeredArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Введите количество столбцов в строке " + (i + 1) + ": ");
            int cols = sc.nextInt();
            staggeredArray[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                staggeredArray[i][j] = (int) (Math.random() * 101); // Заполнение случайными числами от 0 до 100
            }
        }

        // Вывод массива в виде таблицы
        System.out.println("Ступенчатый массив:");
        for (int i = 0; i < staggeredArray.length; i++) {
            for (int j = 0; j < staggeredArray[i].length; j++) {
                System.out.print(staggeredArray[i][j] + "\t");
            }
            System.out.println(); // Переход на новую строку
        }
    }
    
    public static void createTriangularArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = sc.nextInt();
        int[][] triangularArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            triangularArray[i] = new int[i + 1]; // Количество элементов в строке увеличивается на 1
            for (int j = 0; j <= i; j++) {
                triangularArray[i][j] = i * j; // Заполнение квадратами индексов
            }
        }

        // Вывод массива в виде таблицы
        System.out.println("Треугольный ступенчатый массив:");
        for (int i = 0; i < triangularArray.length; i++) {
            for (int j = 0; j < triangularArray[i].length; j++) {
                System.out.print(triangularArray[i][j] + "\t");
            }
            System.out.println(); // Переход на новую строку
        }
    }
    
    public static int sumOfStaggeredArray(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int value : row) {
                sum += value; // Суммируем все элементы
            }
        }
        return sum; // Возвращаем сумму
    }
    
    public static int[] findMaxInStaggeredArray(int[][] array) {
        int max = Integer.MIN_VALUE;
        int[] indices = new int[2]; // Для хранения индексов строки и столбца

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j]; // Обновляем максимальное значение
                    indices[0] = i; // Индекс строки
                    indices[1] = j; // Индекс столбца
                }
            }
        }
        return indices; // Возвращаем индексы максимального элемента
    }
    
    public static int[] findMaxInStaggeredArray(int[][] array) {
        int max = Integer.MIN_VALUE;
        int[] indices = new int[2]; // Для хранения индексов строки и столбца

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j]; // Обновляем максимальное значение
                    indices[0] = i; // Индекс строки
                    indices[1] = j; // Индекс столбца
                }
            }
        }
        return indices; // Возвращаем индексы максимального элемента
    }
    
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Возвращаем индекс найденного элемента
            }
        }
        return -1; // Если элемент не найден, возвращаем -1
    }
    
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Находим средний индекс
            if (array[mid] == target) {
                return mid; // Возвращаем индекс найденного элемента
            }
            if (array[mid] < target) {
                left = mid + 1; // Ищем в правой половине
            } else {
                right = mid - 1; // Ищем в левой половине
            }
        }
        return -1; // Если элемент не найден, возвращаем -1
    }
}

