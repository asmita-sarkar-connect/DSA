import java.util.*;
public class Hashing {
  public static void main(String[] args) {
    //country(key) , population(value)
    HashMap<String, Integer> map = new HashMap<>();

    //Insertion
    map.put("India", 120);
    map.put("US", 30);
    map.put("China", 150);

    System.out.println(map);

    map.put("China", 180 );
    System.out.println(map);

    //Search
    // if(map.containsKey("Indonesia")){
    //   System.out.println("key is present in the map");

    // }else {
    //   System.out.println("key is not present in the map");
    // }

    // //get function

    // System.out.println(map.get("China")); // key exists
    // System.out.println(map.get("Indonesia")); // key does not exist
  
    for (Map.Entry<String, Integer> e : map.entrySet()){
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }

    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println( key+ " "+ map.get(key));
    }

    map.remove("China");
    System.out.println(map);

  }

  
}