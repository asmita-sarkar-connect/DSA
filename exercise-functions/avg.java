import java.util.*;

public class avg{

  public static int CalculateAvg(int a, int b, int c) {

    int avg = a+b+c/2;
    return avg;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int avg = CalculateAvg(a, b, c);
    System.out.println("Average of three numbers is :" + avg);
  }
}