import java.io.*;
import java.util.*;

public class FibonacciNo {

    public static int fibonacci(int n) {
     if ((n == 0) || (n == 1))
        return n;
     else
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        
        Scanner sc1= new Scanner(System.in);
        int n = sc1.nextInt();
        
        System.out.println(fibonacci(n));
        
    }
}
