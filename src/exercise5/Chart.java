package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member HashMap<Integer, Song> (reuse class Song from task 7). Its constructor must take file name as a parameter, read data from the file (sample top40pop.csv is provided), create a new Song object from each line, and put that object into a HashMap using a song position as a key. Implement method getSong that takes an integer position as a parameter and returns a Song at that position. 
 * 
 * @author yasiro01
 */

public class Chart {

  private HashMap<Integer, Song> map = new HashMap<>();
  
  public Chart(String file) throws FileNotFoundException, IOException{
      
    BufferedReader br = new BufferedReader (new FileReader(file));
    String line = br.readLine();
    while (line != null){
        String[] tune = line.split(",");
        map.put(Integer.parseInt(tune[0]), new Song (tune[1], tune[2]));
        line = br.readLine();
        
        
    }
        
  
    this.map = map;
  
  }
  
  public Song getSong(int num){
      Song song = map.get(num);
      return song;
  }
}
