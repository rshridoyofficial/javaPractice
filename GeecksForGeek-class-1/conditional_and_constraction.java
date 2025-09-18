import java.util.Scanner;

public class conditional_and_constraction {
    public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second intefer : ");
        int b = scanner.nextInt();
        System.out.println("The sum of two numbers is : " + addMumbers(a, b));
        String name = scanner.next();
        System.out.println(name);
        scanner.close();
        int sum =  a + b;
        if(sum <20){
            System.out.println("Sum is less then twenty!");
            
        }else{
              System.out.println("Sum is getter then twenty or equal!");
        }

        switch (name) {
            case "Hridoy":
                System.out.println("It's your name!");
                break;
        
            case "Mahim":
                System.out.println("It's your Friends name!");
                break;
            default:
                System.out.println("I don't know who is he/she! ");
        }
    }
    public static int addMumbers(int a, int b){
        return a+b;
    }
}
