import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        
        int a = A*(B%10);
        int b = A*(B%100/10);
        int c = A*(B/100);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b*10+c*100);
    }
}