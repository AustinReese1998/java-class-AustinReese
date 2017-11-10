package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Class KangarooMob
 * @author yasiro01
 */
public class KangarooMob {

  private HashSet<Kangaroo> kangSet = new HashSet<>();
  
  public KangarooMob(String file) throws FileNotFoundException, IOException{
      
    BufferedReader br = new BufferedReader (new FileReader(file));
    String line = br.readLine();
    while (line != null){
        String[] kang = line.split(",");
        line = br.readLine();
        if ("Kangaroo".equals(kang[2])){
            kangSet.add(new Kangaroo (kang[0], Integer.parseInt(kang[1])));
        
        
    }
        
  

  
  }  this.kangSet = kangSet;
  }    

  
  public Kangaroo getChief(){
      int oldest = 0;
      for ( Kangaroo kang : kangSet){
          if (kang.getAge() > oldest){
              oldest = kang.getAge();
          }
      }
      for ( Kangaroo kang : kangSet){
          if (kang.getAge() == oldest){
              return kang;
          }
      }
    return null;
}
      

    int size() {
        return kangSet.size();
    }

}




