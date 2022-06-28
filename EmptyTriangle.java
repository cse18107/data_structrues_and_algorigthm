import java.util.Scanner;

public class EmptyTriangle {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();
    int width = (height * 2) - 1;
    int mid = Math.abs(width / 2);
    for (int i = 0; i < height; i++) {
      int left = mid - i;
      int right = mid + i;
      for (int j = 0; j < width; j++) {
        if (i == height - 1) {
          System.out.print("*");
        } else {
          if (j == right || j == left) System.out.print(
            "*"
          ); else System.out.print(" ");
        }
      }
      System.out.println();
    }
    scanner.close();
  }
}
