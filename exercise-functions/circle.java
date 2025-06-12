import java.util.*;
public class circle {

  public static double CalculateCircumferenceOfCircle( double r){
     return 2*Math.PI*r;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius of circle:");
    double r = sc.nextDouble();
    System.out.println("Circumference of Circle:" + CalculateCircumferenceOfCircle(r));
  }
  
}
