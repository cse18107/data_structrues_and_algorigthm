import java.util.Scanner;

public class MailShape2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();
    int width = height;
    int left = 0;
    int right = width - 1;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (i == 0 || i == height - 1) {
          System.out.print(" * ");
        } else {
          if (j == 0 || j == width - 1) {
            System.out.print(" * ");
          } else {
            if (left <= right) {
                if(j==left || j==right)
              System.out.print(" * ");
              else {
                if(j<left || j>right){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
              }

            } else {
              System.out.print(" * ");
            }
          }
        }
      }
      left++;
      right--;
      System.out.println();
    }
    scanner.close();
  }
}
