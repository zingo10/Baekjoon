import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        if((A%4 == 0 && A%100 !=0) || A%400 == 0){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}