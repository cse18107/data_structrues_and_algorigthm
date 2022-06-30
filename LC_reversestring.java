import java.util.Scanner;

public class LC_reversestring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] c={'H','e','l','o'};
        int l = 0;
        int r = c.length-1;
        reverse(c,l,r);
        System.out.println(c);
        scanner.close();    
    }
    public static void reverse(char[] c, int l,int r){
        if(l>r) return;
        reverse(c,l+1,r-1);
        char t = c[l];
        c[l]=c[r];
        c[r] = t; 
    }
}
