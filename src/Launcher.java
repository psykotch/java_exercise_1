
import java.util.Scanner;

public class Launcher {
    public static final String WELCOME = "Willkommen ! Bienvenue ! Bienvenido ! :)";
    public static final Command[] COMMANDS = {new Fibo(), new Freq(), new Quit()};


    public static void main(String[] args) {
        System.out.println(WELCOME);
        Scanner sc = new Scanner(System.in);
        String var = "";
        Command cmd = null;
        do {
            var = sc.nextLine();
            cmd = null;
            for(Command c : COMMANDS) if(c.name().contentEquals(var)) {
                cmd = c;
                break;
            }
            if(cmd == null) {
                System.out.println("Unkown command");
            }
        } while(cmd == null || !cmd.run(sc));
        sc.close();
    }
}
