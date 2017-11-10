package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;

/**
 * Class LemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracy {

  private HashSet<Lemur> lemurSet = new HashSet<>();
  
  public LemurConspiracy(String file) throws FileNotFoundException, IOException{
      
    BufferedReader br = new BufferedReader (new FileReader(file));
    String line = br.readLine();
    while (line != null){
        String[] lemur = line.split(",");
        line = br.readLine();
        if ("Lemur".equals(lemur[2])){
            lemurSet.add(new Lemur (lemur[0], Integer.parseInt(lemur[1])));
        
        
    }
        
  

  
  }  this.lemurSet = lemurSet;
  }    

  
  public Lemur getChief(){
      int oldest = 0;
      for ( Lemur lemur : lemurSet){
          if (lemur.getAge() > oldest){
              oldest = lemur.getAge();
          }
      }
      for ( Lemur lemur : lemurSet){
          if (lemur.getAge() == oldest){
              return lemur;
          }
      }
    return null;
}
      

    int size() {
        return lemurSet.size();
    }

}
