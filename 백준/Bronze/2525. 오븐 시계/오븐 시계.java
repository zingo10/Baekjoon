import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        
        int C = scan.nextInt();
        
        int min = A*60 + B;
        min = C + min;
        int a = min/60%24;
        int b = min%60;
        
        System.out.print(a + " " + b);
    }
}