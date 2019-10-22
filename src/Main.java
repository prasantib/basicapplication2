import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println(" Please enter a number");
            num = key.nextInt();
            if (num > 0) {
                System.out.print((num + 5) * 2 - 7);
            }
            else {
                System.out.print(num);
            }
        } while (num > 0);

    }
} 