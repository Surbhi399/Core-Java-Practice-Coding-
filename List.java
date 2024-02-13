import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList <String> fruits = new  ArrayList<String> ();
   System.out.println( fruits.add("orange"));
   System.out.println( fruits.add("mango"));
   System.out.println( fruits.add("banana"));
   System.out.println( fruits.add("papaya"));
    System.out.println(fruits.get(1));
     System.out.println(fruits.size());
      System.out.println(fruits.indexOf("papaya"));
        System.out.println(fruits.indexOf("pear"));
          System.out.println(fruits.set(3,"pear"));
          System.out.println(fruits.indexOf("pear"));
          System.out.println(fruits.remove("pear"));
           System.out.println(fruits.remove(1));
            System.out.println(fruits.size());


  }
  
}
