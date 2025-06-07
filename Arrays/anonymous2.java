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
  }public class anonymous2 {

    public static void main (String []args){

    //anonymous array
    Calc obj = new Calc();
    int result = obj.add (new int []{5,3,4,7});
    System.out.println(result);
    }


  
}
