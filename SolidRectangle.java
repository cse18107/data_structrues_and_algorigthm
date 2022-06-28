import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int coll = scanner.nextInt();

        for(int i = 0 ;i < row ; i++){
            if(i!=0)
            System.out.println();
            for(int j = 0; j < coll ; j++){
                if(i==0 || i==(row-1))
                System.out.print("*");
                else{
                    if(j==0||j==(coll-1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
        }
    scanner.close();        
    }
}
