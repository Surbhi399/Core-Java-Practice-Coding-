import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList <String>desertIslandPlaylist = new ArrayList <String>();
    //ADD METHOD
    desertIslandPlaylist.add("Sneaker Pimps - Six Underground");
    desertIslandPlaylist.add("Love you so much");
    desertIslandPlaylist.add("Like my Father");
    desertIslandPlaylist.add("At my Worst");
    desertIslandPlaylist.add("Perfect");
    desertIslandPlaylist.add("Around you");
    desertIslandPlaylist.add("Closer");


    //GET METHOD
     System.out.println(desertIslandPlaylist.get(1));
      System.out.println(desertIslandPlaylist.get(4));

     // ARRAYLIST SIZE METHOD
    System.out.println(desertIslandPlaylist.size());

//REMOVE METHOD
     System.out.println(desertIslandPlaylist.remove(6));
       System.out.println(desertIslandPlaylist.remove("Sneaker Pimps - Six Underground"));

  // ARRAYLIST SIZE METHOD
    System.out.println(desertIslandPlaylist.size());

//VARIABLES for swaping
String songA = "Love you so much";
String songB = "Perfect";
// indexOf method
 System.out.println(desertIslandPlaylist.indexOf(songA));
  System.out.println(desertIslandPlaylist.indexOf(songB));

  //  swap songs using SET METHOD

desertIslandPlaylist.set(0,songB);
desertIslandPlaylist.set(3,songA);

 // indexOf method
 System.out.println(desertIslandPlaylist.indexOf(songA));
  System.out.println(desertIslandPlaylist.indexOf(songB));

//GET METHOD
     System.out.println(desertIslandPlaylist.get(0));
      System.out.println(desertIslandPlaylist.get(3));







  }
  
}
