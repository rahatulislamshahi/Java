import java.util.Scanner;
public class Input_From_User_D_Types {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your Name:");

        String name = Scanner.nextLine();
        int n = Scanner.nextInt();

        System.out.println(name);
        System.out.println(n);
        Scanner.close();
    }
}
