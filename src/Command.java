import java.util.Scanner;

public interface Command {
    abstract String name();
    abstract Boolean run(Scanner scanner);
}
