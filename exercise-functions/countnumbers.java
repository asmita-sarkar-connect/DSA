import java.util.*;
public class countnumbers {
  public static void main(String[] args) {
    int positive = 0;
    int negative = 0;
    int zeros = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your number :");
      int number = sc.nextInt();
      if (number>0){
        positive++;
      }
      else if (number<0){
        negative++;
      }
      else {
        zeros++;
      }
      System.out.println("Positives = "+ positive);
      System.out.println("Negativess = "+ negative);
      System.out.println("Zeros = "+ zeros);
    }

  }
