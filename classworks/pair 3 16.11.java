import java.util.Scanner;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /* Task 1
        int k;
        k = sc.nextInt();

        String s = "гениально";
        switch(k)
        {
            case 1:
                s = "плохо";
                break;
            case 2:
                s = "неудовлетворительно";
                break;
            case 3:
                s = "удовлетворительно";
                break;
            case 4:
                s = "хорошо";
                break;
            case 5:
                s = "отлично";
                break;
        }
        System.out.println(s);
        */
        /* Task 2
        int hours;
        hours = sc.nextInt();

        String hello = switch(hours)
        {
            case 4, 5, 6, 7, 8, 9, 10 -> "Доброе утро";
            case 11, 12, 13, 14, 15, 16, 17 -> "Добрый день";
            case 18, 19, 20, 21, 22, 23 -> "Добрый вечер";
            case 24, 0, 1, 2, 3 -> "Доброй ночи";
            default -> "Доброго времени суток";
        };
       
        System.out.println(hello);
        */

        /* Task 3
        double k;
        k = sc.nextDouble();
        int AdelEnikeeva;
        AdelEnikeeva = sc.nextInt();

        System.out.println(switch(AdelEnikeeva)
                {
                    case 1 -> k * k;
                    case 2 -> Math.pow(k, 0.5);
                    case 3 -> Math.sin(k);
                    case 4 -> Math.cos(k);
                    default -> k;
                });
        */

        /* Task 4
        try 
        {
            System.out.println((char) (System.in.read() - 32));
        }
        catch (IOException e) 
        {

        }
        */


        /* Task 5
        int month;
        month = sc.nextInt();

        System.out.println(12 - month);
        */

        /* Task 6
        int n, m;
        n = sc.nextInt(); m = sc.nextInt();

        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j)
            {
                System.out.print(1 + " ");
            }
            System.out.println();
        }
        */

        /* Task 7
        int a, b; double x, z;
        a = sc.nextInt(); b = sc.nextInt(); x = a % b; z = sc.nextDouble();

        if (x == 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(z / x);
        }
        */

        /* Task 8
        int prev = Integer.MAX_VALUE, curr = Integer.MAX_VALUE, next; boolean isans = false;
        int temp;
        System.out.println("Введите последовательность. Окончание последовательности - любой нечисловой литерал");
        while (sc.hasNextInt())
        {
            next = sc.nextInt(); 
            if (curr % 2 == 0 && prev < curr && curr > next)
            {
                isans = true;
                break;
            }

            temp = curr;
            curr = next;
            prev = temp;

        }
        System.out.println(isans);
        */

        /* Task 9
        int n = sc.nextInt(), count = 0, sum = 0;
        for (int i = 0; i < n; ++i)
        {
            int a = sc.nextInt();
            if (a % 5 == 0 && a % 7 != 0)
            {
                ++count;
                sum += a;
            }
        }
        System.out.println(count + " " + sum);
        */
        
        /* Task 10
        int n = sc.nextInt(), count = 0; double sum = 0;
        for (int i = 0; i < n; ++i)
        {
            double a = sc.nextDouble();
            if (a > 0) 
            {
                sum += 2 * a;
            }
        }
        System.out.println(sum);
        */

        
        /* Task 11
        int n = sc.nextInt(), count = 0, sum = 1;
        for (int i = 0; i < n; ++i)
        {
            int a = sc.nextInt();
            if (a % 7 == 0) 
            {
                sum *= a;
            }
        }
        System.out.println(sum);
        */

        /* Task 12
        double a = sc.nextDouble();
        System.out.println(-2 <= a && a < 2 ? a * a : 4);
        */


        // Task 13
        //double a = sc.nextDouble(); int n = sc.nextInt();
        /* a)
        System.out.println(Math.pow(a, n));
        */
        /* b)
        int sum = 1;
        for (int i = a; i <= a + n - 1; ++i)
        {
        sum *= i;
        }
        */
        /* c)
        double sum = 0, mult = 1;
        for (double i = a; i <= a + n + 1; ++i)
        {
            mult *= i;
            sum += 1 / mult;
        }
        System.out.println(sum);
        */

        /* Task 14
        int n = sc.nextInt(), j = sc.nextInt(); double a;
        double sum = 0; int count = 0;
        for (int i = 0; i < n; ++i)
        {
            a = sc.nextDouble();
            if (i + 1 != j)
            {
                sum += a;
            }
        }
        System.out.println(sum / n);
        */
    }
}
