import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Task 1: Сумма двух целых чисел */
        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        */

        /* Task 2: Проверка равенства двух вещественных чисел */
        /*
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(x == y);
        */

        /* Task 3: Замена первого числа нулем, если оно меньше или равно второму */
        /*
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if (num1 <= num2) {
            num1 = 0;
        }
        System.out.println(num1 + " " + num2);
        */

        /* Task 4: Возведение в квадрат неотрицательных чисел */
        /*
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a >= 0) a *= a;
        if (b >= 0) b *= b;
        if (c >= 0) c *= c;
        System.out.println(a + " " + b + " " + c);
        */

        /* Task 5: Сумма цифр положительного целого числа */
        /*
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
        */

        /* Task 6: Числа в интервале (1, 3) */
        /*
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a > 1 && a < 3) System.out.println(a);
        if (b > 1 && b < 3) System.out.println(b);
        if (c > 1 && c < 3) System.out.println(c);
        */

        /* Task 7: Таблица умножения для числа k */
        /*
        int k = sc.nextInt();
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + " × " + k + " = " + (i * k));
        }
        */

        /* Task 8: Замена чисел в зависимости от условий */
        /*
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        if (a <= b && b <= c && c <= d) {
            a = b = c = d = Math.max(Math.max(a, b), Math.max(c, d));
        } else if (a > b && b > c && c > d) {
            // Оставить без изменений
        } else {
            a *= a;
            b *= b;
            c *= c;
            d *= d;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
        */

        /* Task 9: Существование треугольника и его тип */
        /*
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        boolean exists = (x + y > z) && (x + z > y) && (y + z > x);
        System.out.println("Треугольник существует: " + exists);
        if (exists) {
            boolean acute = (x * x + y * y > z * z) && (x * x + z * z > y * y) && (y * y + z * z > x * x);
            System.out.println("Треугольник остроугольный: " + acute);
        }
        */

        /* Task 10: Замена чисел в зависимости от суммы */
        /*
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if (x != y && y != z && x != z) {
            if (x + y + z < 1) {
                double min = Math.min(Math.min(x, y), z);
                if (min == x) x = (y + z) / 2;
                else if (min == y) y = (x + z) / 2;
                else z = (x + y) / 2;
            } else {
                if (x < y) x = (y + z) / 2;
                                else y = (x + z) / 2;
            }
        }
        System.out.println(x + " " + y + " " + z);
        */

        /* Task 11: Проверка наличия действительных корней уравнения */
        /*
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a != 0) {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Корни: " + root1 + ", " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Действительный корень: " + root);
            } else {
                System.out.println("Действительных корней нет.");
            }
        } else {
            System.out.println("a не должно быть равно 0.");
        }
        */

        /* Task 12: Двоичное представление целого положительного числа */
        /*
        int number = sc.nextInt();
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        System.out.println(binary);
        */

        /* Task 13: Прерывание ввода при условии */
        /*
        int prev = sc.nextInt();
        while (true) {
            int current = sc.nextInt();
            if (current < prev) {
                break; // Прерывание ввода
            }
            prev = current;
        }
        */
    }
}

