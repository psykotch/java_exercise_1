import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibo implements Command {
    @Override
    public String name() {
        return ("Type fibo to have fibonnacci of a number");
    }

    @Override
    public Boolean run(Scanner scanner) {
        System.out.println("Index fibonacci n = ?");
        try {
            int i = scanner.nextInt();
            if(i < 2) {
                System.out.println("n must be greater than 2 !");
                scanner.close();
                return false;
            }
            int u = 1, v = 1;
            for(int j = 2; j < i; j++) {
                int temp = u+v;
                u = v;
                v = temp;
            }
            System.out.println(v);
        } catch (InputMismatchException e) {
            System.out.println("You need to input a valid number");
        }
        scanner.close();
        return false;
    }
}
