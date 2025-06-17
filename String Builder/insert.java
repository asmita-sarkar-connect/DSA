import java.util.*;
public class insert {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Tony");

    //insert function
    sb.insert(2, 'n');
    System.out.println(sb);

    //delete the extra 'n'
    // sb.delete(2,3);
    // System.out.println(sb);

    sb.delete(2,4);
     System.out.println(sb);

  }
  }

