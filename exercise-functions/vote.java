import java.util.*;

public class vote {
  public static void CalculateEligibleToVote(int age){
    if (age >= 18){
      System.out.println("Person is eligible to vote");
    }
    else{
      System.out.println("Person is not eligible to vote");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age :");
    int age = sc.nextInt();
    CalculateEligibleToVote(age);

  }
  
}
