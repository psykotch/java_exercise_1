import java.util.Scanner;

public class Quit implements Command {
    @Override
    public String name() {
        return "Type quit to exit the program";
    }

    @Override
    public Boolean run(Scanner scanner) {
        return true;
    }
}
