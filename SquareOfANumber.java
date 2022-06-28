import java.util.Scanner;


public class SquareOfANumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = square(n,1);
        System.out.println(res);
        scanner.close();
    }
    public static int square(int n,int m){
        if(m==0)return n;
        return n*square(n,m-1);
    }
}
