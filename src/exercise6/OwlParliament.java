package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Class OwlParliament
 * @author yasiro01
 */
public class OwlParliament {
  private HashSet<Owl> owlSet = new HashSet<>();
  
  public OwlParliament(String file) throws FileNotFoundException, IOException{
      
    BufferedReader br = new BufferedReader (new FileReader(file));
    String line = br.readLine();
    while (line != null){
        String[] owl = line.split(",");
        line = br.readLine();
        if ("Owl".equals(owl[2])){
            owlSet.add(new Owl (owl[0], Integer.parseInt(owl[1])));
        
        
    }
        
  

  
  }  this.owlSet = owlSet;
  }    

  
  public Owl getChief(){
      int oldest = 0;
      for ( Owl owl : owlSet){
          if (owl.getAge() > oldest){
              oldest = owl.getAge();
          }
      }
      for ( Owl owl : owlSet){
          if (owl.getAge() == oldest){
              return owl;
          }
      }
    return null;
}
      

    int size() {
        return owlSet.size();
    }

}
