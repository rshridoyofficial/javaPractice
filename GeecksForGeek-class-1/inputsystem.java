import java.util.Scanner;

public class inputsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second intefer : ");
        int b = scanner.nextInt();
        System.out.println("The sum of two numbers is : " + addMumbers(a, b));
        String name = scanner.next();
        System.out.println(name);
        scanner.close();
        
    }

    public static int addMumbers(int a, int b){
        return a+b;
    }
}
