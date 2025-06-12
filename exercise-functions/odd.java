import java.util.*;

public class odd {

  public static void printSumOfOddNumbers(int n){
    int sum =0;
    //loop
    for(int i=1;i<=n;i+=2) // increment by two  
    {
      sum +=i;
    }
    System.out.println("Sum of odd numbers from 1 to " + n + " is " + sum);
    
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int n = sc.nextInt();
    printSumOfOddNumbers(n);
  
}
}