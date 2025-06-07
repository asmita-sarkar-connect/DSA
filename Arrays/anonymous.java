

  class Calc{

    public int add(int nums[])
    {
      int result= 0;
      for (int n : nums) //enhanced for loop
      {
  
        result = result +n;
      }
      return result;

    }
  }

   public class anonymous {

    public static void main(String[] args) {
      
      Calc obj = new Calc();
      int nums[] = {5,3,4,7};
      int result = obj.add(nums);
      System.out.println(result);
       }
   }
