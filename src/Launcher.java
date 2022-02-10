import java.util.Scanner;

public class Launcher {
    public static void main (String args[]){
        System.out.println("Welcome!");
        Scanner sc = new Scanner(System.in);
        String cmd = null;
        
        do {
            System.out.println("Enter command: ");
            cmd = sc.nextLine();
            if ("quit".equals(cmd)){
                break;
            }
            else System.out.println("Unkown command");
        } while (true);
    }
}
