import java.util.Scanner;
public class Main
{
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        
        int length = 10;

        int[] arr = new int[length];

        for (int i = 0; i < length; ++i)
        {
            arr[i] = i;
        }

        printarr(arr, length, sc);

    }

    public static void printarr(int[] arr, int length, Scanner sc)
    {
        for (int i = 0; i < length; ++i)
        {
            System.out.println(arr[i]);
        }
    }
}
