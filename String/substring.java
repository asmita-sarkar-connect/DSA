import java.util.*;
public class substring {

  public static void main(String[] args) {
    String sentence = "My name is Tony";
    // substring(beg index end index)
    String name = sentence.substring(11, sentence.length());
    System.out.println(name);
  

  String sentence2 = "TonyStark";
  String name2 = sentence2.substring(4);
  System.out.println(name2);

  //Strings are Immutable
  
} 
}
