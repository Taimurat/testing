import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Task 1: Конвертация k-ичного числа в десятичную систему */
        /*
        int k = sc.nextInt();
        int n = sc.nextInt();
        int decimalValue = 0;
        int base = 1; // k^0
        while (n > 0) {
            int lastDigit = n % 10;
            decimalValue += lastDigit * base;
            base *= k;
            n /= 10;
        }
        System.out.println(decimalValue);
        */

        /* Task 2: Проверка на два четных локальных максимума */
        /*
        int count = 0;
        int prev = sc.nextInt();
        int current = sc.nextInt();
        int next;
        while (sc.hasNextInt()) {
            next = sc.nextInt();
            if (current > prev && current > next && current % 2 == 0) {
                count++;
            }
            prev = current;
            current = next;
        }
        System.out.println(count == 2);
        */

        /* Task 3: Сравнение дробей с π */
        /*
        const double PI = 3.141592653589793;
        int m = sc.nextInt();
        int n = sc.nextInt();
        double fraction1 = (double) m / n;
        double fraction2 = (double) n / m;
        if (Math.abs(fraction1 - PI) < Math.abs(fraction2 - PI)) {
            m *= 10;
        } else {
            n *= 2;
        }
        System.out.println("m: " + m + ", n: " + n);
        */

        /* Task 4: Проверка на два числа с длиной 3 или 5 и четными/нечетными цифрами */
        /*
        int count = 0;
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            int length = String.valueOf(Math.abs(number)).length();
            if ((length == 3 || length == 5) && areAllDigitsEvenOrOdd(number)) {
                count++;
            }
        }
        System.out.println(count == 2);
        }

        // Эта функция реализована чуть выше
        private static boolean areAllDigitsEvenOrOdd(int number) {
            boolean isEven = (Math.abs(number) % 2 == 0);
            while (number != 0) {
                if ((Math.abs(number % 10) % 2 == 0) != isEven) {
                    return false;
                }
                number /= 10;
            }
            return true;
        }
        */

        /* Task 5: Изменение последовательности чисел */
        /*
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
            if (a[i] < 0) {
                a[i] += 0.5;
            } else {
                a[i] = 0.1;
            }
        }
        for (double num : a) {
            System.out.println(num);
        }
        */

        /* Task 6: Вычисления с действительным числом a и натуральным n */
        /*
        double a = sc.nextDouble();
        int n = sc.nextInt();

        // a) 1/a + 1/a^2 + 1/a^4 + ... + 1/a^(2^n)
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 1 / Math.pow(a, Math.pow(2, i));
        }
        System.out.println(sum);

        // b) a(a - n)(a - 2n)...(a - n^2)
        double product = a;
        for (int i = 1; i <= n; i++) {
            product *= (a - i * n);
        }
        System.out.println(product);
        */

        /* Task 7: Работа с натуральным числом n */
        /*
        int n = sc.nextInt();
        int digitCount = String.valueOf(n).length();
        int sumOfDigits = 0;
        int firstDigit = Integer.parseInt(String.valueOf(String.valueOf(n).charAt(0)));
        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;

        for (char digit : String.valueOf(n).toCharArray()) {
            sumOfDigits += Character.getNumericValue(digit);
        }

        System.out.println("Количество цифр: " + digitCount);
        System.out.println("Сумма цифр: " + sumOfDigits);
        System.out.println("Первая цифра: " + firstDigit);
        if (n >= 10) {
            System.out.println("Предпоследняя цифра: " + secondLastDigit);
        }
        */

        /* Task 8: Заполнение массива */
        /*
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (i % 2 == 0) ? (1 + (i / 2) * 2) : -((i + 1) * 2);
        }
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
        */

        /* Task 9: Вычисление функции f(a) */
        /*
        double a = sc.nextDouble();
        // a) f(x) = 0 при x <= 0, x при 0 < x <= 1, x^4 в остальных случаях
        double f1;
        if (a <= 0) {
            f1 = 0;
        } else if (a <= 1) {
            f1 = a;
        } else {
            f1 = Math.pow(a, 4);
        }
        System.out.println("f1(a): " + f1);

        // b) f(x) = 0 при x <= 0, x^2 - x при 0 < x <= 1, x^2 - sin(pi*x^2) в остальных случаях
        double f2;
        if (a <= 0) {
            f2 = 0;
        } else if (a <= 1) {
            f2 = Math.pow(a, 2) - a;
        } else {
            f2 = Math.pow(a, 2) - Math.sin(Math.PI * Math.pow(a, 2));
        }
        System.out.println("f2(a): " + f2);
        */

        /* Task 10: Определение наименования возраста */
        /*
        int n = sc.nextInt();
        if (n % 10 == 1 && n % 100 != 11) {
            System.out.println(n + " год");
        } else if ((n % 10 >= 2 && n % 10 <= 4) && (n % 100 < 10 || n % 100 >= 20)) {
            System.out.println(n + " года");
        } else {
            System.out.println(n + " лет");
        }
        */
    }
}


