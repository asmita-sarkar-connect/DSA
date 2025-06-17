import java.util.*;

public class Strings{
public static void main(String[] args) {
  StringBuilder sb = new StringBuilder("Tony");
  System.out.println(sb);

  //char at index 0
  System.out.println(sb.charAt(0));
  

  // set char at index
  sb.setCharAt(0, 'P');
  System.out.println(sb);
}}