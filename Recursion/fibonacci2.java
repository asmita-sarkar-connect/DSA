public class fibonacci2 {
  public static void printFib(int a , int b,int n){
    //base case 
    int i =0;
    if(i==n){
      return;
    }
    int c = a+b;
    System.out.println(c);
    printFib(b, c, n-1);


    }
    public static void main(String[] args) {
      int a = 0 , b=1;
      System.out.println(a);
      System.out.println(b);
      int n =7;
      printFib(a, b, n-2);
    }
  
}
