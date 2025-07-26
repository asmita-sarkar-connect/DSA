public class Fibonacci {
  public static void printFib(int a, int b , int n){
    // a = first term
    // b = seconf term 
    if(n==0 ){ // base case
      return;
    }
    int c = a+b;
    System.out.println(c);
    printFib(b, c, n-1);
  }
  public static void main(String[] args) {
    int a = 0 , b = 1;
    System.out.println(a);
    System.out.println(b);
    int n =7;
    printFib(a, b, n-2);

  }
  
}
