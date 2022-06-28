// Print number from 1 to 5
import java.util.Scanner;


public class PrintNumberBacktracking {
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
        printNumber(n-1);
        System.out.println(n);
    }
}
