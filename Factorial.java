import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {

    public static int fact(int n) {
      if (n <= 1)
         return 1;
      else
         return n * fact(n - 1);
    }

    public static void main(String[] args) {
      
        Scanner sc1 = new Scanner(System.in);
        int c = sc1.nextInt();
        
        for(int x=1;x<=c;x++){   
            int n = sc1.nextInt();
            System.out.println(fact(n));
            
        }
        
    }
}
