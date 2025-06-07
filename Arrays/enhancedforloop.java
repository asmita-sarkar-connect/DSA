public class enhancedforloop {

  public static void main (String []args) {

    // int nums [] = {5,4,7,8};

    // for (int n : nums)
    // {
    //   System.out.println(n);
    // }

    int nums[][] = {
      {5,2,3,6},
      {7,8,9},
      {2,7,5,4}

    };
    for (int a[] : nums)
    {
      for (int b: a)
      {
        System.out.print(b+ " ");
      }
      System.out.println();
    }
  }
  
}
