package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {

  private ArrayList<Crow> crowList = new ArrayList<>();
  
  public CrowMurder(String file) throws FileNotFoundException, IOException{
      
    BufferedReader br = new BufferedReader (new FileReader(file));
    String line = br.readLine();
    while (line != null){
        String[] crow = line.split(",");
        line = br.readLine();
        if ("Crow".equals(crow[2])){
            crowList.add(new Crow (crow[0], Integer.parseInt(crow[1])));
        
        
    }
        
  

  
  }  this.crowList = crowList;
  }    

  
  public Crow getChief(){
      ArrayList<Integer> ages = new ArrayList<>();
      int oldest = 0;
      for (int i=0; i<crowList.size(); ++i){
          if (crowList.get(i).getAge() > oldest){
              oldest = crowList.get(i).getAge();
          }

      }
      for (int i=0; i<crowList.size(); ++i){
          if (crowList.get(i).getAge() == oldest){
              return crowList.get(i);
          }
      }
      return null;
}

    int size() {
        return crowList.size();
    }

}
