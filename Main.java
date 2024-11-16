// Задача n - каждый отдельный файл
// Задача 1
import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println(firstNumber + secondNumber);
    }
}

// Задача 2
import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstValue = input.nextDouble();
        double secondValue = input.nextDouble();
        System.out.println(firstValue == secondValue);
    }
}

// Задача 3
import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x <= y) {
            x = 0;
        }
        System.out.println(x + " " + y);
    }
}

// Задача 4
import java.util.Scanner;
public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if (x > 0) {
            x *= x;
        }
        if (y > 0) {
            y *= y;
        }
        if (z > 0) {
            z *= z;
        }
        System.out.println(x + " " + y + " " + z);
    }
}

// Задача 5
import java.util.Scanner;
public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSum = 0;
        int number = input.nextInt();
        while (number != 0) {
            totalSum += (number % 10);
            number /= 10;
        }
        System.out.println(totalSum);
    }
}

// Задача 6
import java.util.Scanner;
public class TaskSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if (x > 1 && x < 3) {
            System.out.println(x);
        }
        if (y > 1 && y < 3) {
            System.out.println(y);
        }
        if (z > 1 && z < 3) {
            System.out.println(z);
        }
    }
}

// Задача 7
import java.util.Scanner;
public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiplier = input.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "*" + multiplier + "=" + (multiplier * i));
        }
    }
}

// Задача 8
import java.util.Scanner;
public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if (a <= b && b <= c && c <= d) {
            a = d;
            b = d;
            c = d;
            System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        } else if (a > b && b > c && c > d) {
            System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        } else {
            System.out.println("a=" + (a * a) + " b=" + (b * b) + " c=" + (c * c) + " d=" + (d * d));
        }
    }
}

// Задача 9
import java.util.Scanner;
public class TaskNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
            System.out.println("Треугольник существует!");
            int minSide = Math.min(side1, Math.min(side2, side3));
            int maxSide = Math.max(side1, Math.max(side2, side3));
            int midSide = side1 + side2 + side3 - minSide - maxSide;

            System.out.println(minSide + " " + midSide + " " + maxSide);
            if (maxSide * maxSide < (minSide * minSide + midSide * midSide)) {
                System.out.println("Треугольник остроугольный");
            } else if (maxSide * maxSide == (minSide * minSide + midSide * midSide)) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник тупоугольный");
            }
        } else {
            System.out.println("Треугольника не существует!");
        }
    }
}

// Задача 10
import java.util.Scanner;
public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        if (first != second && second != third && first != third) {
            int minValue = Math.min(first, Math.min(second, third));
            int maxValue = Math.max(first, Math.max(second, third));
            int sum = first + second + third;
            int midValue = sum - minValue - maxValue;

            if (sum < 1) {
                System.out.println("min = " + (midValue + maxValue) / 2);
            } else {
                if (first < second) {
                    first = (second + first) / 2;
                    System.out.println("first < second -> first = " + first);
                } else {
                    second = (third + first) / 2;
                    System.out.println("first > second -> second = " + second);
                }
            }
        } else {
            System.out.println("Три числа должны быть попарно различными!");
        }
    }
}

// Задача 11
import java.util.Scanner;
public class TaskEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Уравнение не имеет действительных корней!");
        } else if (discriminant == 0) {
            System.out.println((-b) / (2.0 * a));
        } else {
            System.out.println(((-b) + Math.sqrt(discriminant)) / (2.0 * a));
            System.out.println(((-b) - Math.sqrt(discriminant)) / (2.0 * a));
        }
    }
}

// Задача 12
import java.util.Scanner;
public class TaskTwelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        StringBuilder binaryRepresentation = new StringBuilder();

        while (number != 0) {
            if (number % 2 == 0) {
                binaryRepresentation.append("0");
                number /= 2;
            } else {
                binaryRepresentation.append("1");
                number = (number - 1) / 2;
            }
        }
        System.out.println(binaryRepresentation.reverse().toString());
    }
}

// Задача 13
import java.util.Scanner;
public class TaskThirteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        StringBuilder binaryRepresentation = new StringBuilder();

        while (number != 0) {
            if (number % 2 == 0) {
                binaryRepresentation.append("0");
                number /= 2;
            } else {
                binaryRepresentation.append("1");
                number = (number - 1) / 2;
            }
        }
        System.out.println(binaryRepresentation.reverse().toString());
    }
}
