import java.util.*;
public class greater {
  public static void CalculateGreaterNumber(int n, int m){
    if (n>m){
      System.out.println("Greater number is :"+ n);
    }
    else{
      System.out.println("Greater number is :" + m);
    }

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter first number =");
    int n = sc.nextInt();
    System.out.println("Enter second number =");
    int m = sc.nextInt();
    CalculateGreaterNumber(n, m);
  }
  
}
