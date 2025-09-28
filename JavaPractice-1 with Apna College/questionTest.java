


// Qs. Take 2 variables 'a' & 'b' and print their sum.

import java.util.*;

public class questionTest {
    public static void main(String[] args){
        Scanner se = new Scanner(System.in);
        System.out.print("a = ");
        int a = se.nextInt();

        System.out.print("b = ");
        int b = se.nextInt();

        int sum = a+b;
        System.out.print(sum);

        se.close();
    }
}
