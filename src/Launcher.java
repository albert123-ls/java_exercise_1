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
            if ("fibo".equals(cmd)){
                System.out.println("Enter number: ");
                int num = sc.nextInt();
                sc.nextLine();
                if (num == 0){
                    System.out.println(0);
                }
                else if (num == 1){
                    System.out.println(1);
                }
                else{
                    int n1 = 0, n2 = 1, n3, i;
                    for (i = 2; i <= num; ++i)
                    {
                        n3 = n1 + n2;
                        n1 = n2;
                        n2 = n3;
                    }
                    System.out.println("fibo: " + n2);
                }
            }
            else System.out.println("Unkown command");
        } while (true);
    }
}
