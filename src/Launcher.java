import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            if (scanner.nextLine().equals("quit"))
            {
                break;
            }
            else
            {
                System.out.println("Unknown command");
            }
        }
    }
}
