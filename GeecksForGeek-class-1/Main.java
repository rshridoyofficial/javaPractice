public class Main{
    public static void main(String[] args){
        System.out.println("Hello, World!");


        // Data types in Java

        //   premitive data typs | defolt value
        // boolean; | 0
        // byte; | 0
        // short; | 0
        // char; | 
        // int; | 0
        // float; | 0.0
        // long; | 0.0L
        // dounle; | 0.0D
        

        //non-prinitive data type  defolt value = Null
        // string;
        // arrays;
        // Integer;
        // character
        // All User  defing=ed data types



        // syntex  
        
        // for premitive 

        // data-type-name   name-of-variable = value
        // int a = 5;
        // boolean b = true;

        // float x = 2F;
        // long l = 2L;
        // double z = 2D;


        // type casting
        // Type custing has two types
        // 1. Implicit Type Casting (Widening)
        // 2. Explicit Type Casting (Narrowing)

        // implicit Type Casting
        int a = 500;
        long l = a; // implicit type casting
        System.out.println(l);

        char z = 'A';
        int y = z;
        System.out.println(y);

        // Explicit Type Casting
        Object s = "Akibul Hasan Hridoy";
        String sb = (String) s;
        System.out.println(sb);
    }
}
