import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        // 모든 변수가 다른 경우
        if(a != b && b != c && c != a){
            int max;
            if(a>b){
                if(c>a){
                   max = c; 
                } else{
                    max = a;
                }
            } else {
                if(c>b){
                    max = c;
                } else {
                    max = b;
                }
            }
            System.out.print(max*100);
        // 적어도 한 쌍 이상의 서로 같은 변수가 있는 경우
        } else {
            if(a==b && b==c){
                System.out.print(10000+a*1000);
            } else {
                if(a==b || a==c){
                    System.out.print(1000+a*100);
                } else {
                    // b==c
                    System.out.print(1000+b*100);
                }
            }
        }
    }
}