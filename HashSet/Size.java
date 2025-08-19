import java.util.HashSet;
import java.util.Iterator;
public class Size {
  
  public static void main(String[] args) {
    //Create
    HashSet<Integer> set = new HashSet<>();

    //Insert
    set.add(1); 
    set.add(2);
    set.add(3);
    set.add(1);

    //Size
    System.out.println("size of set is : " +set.size());

    //print all elements
    System.out.println(set);

    //Iterator
    Iterator it = set.iterator();

    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
  
}
