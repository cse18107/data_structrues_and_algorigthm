// Print numbers from 5 to 1
import java.util.Scanner;

public class PrintNumbers1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumber(n);
        scanner.close();
    }
    public static void printNumber(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNumber(n-1);
    }
}
