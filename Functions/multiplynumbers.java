import java.util.*;

public class multiplynumbers{

  public static int calculateProduct(int a, int b){
    // int Product = a*b;
    return a*b;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    //int Product = calculateProduct(a,b);
   // System.out.println("Product of two numbers :"+ Product);
   System.out.println("Product of 2 numbers is : " + calculateProduct(a, b));

  }
}