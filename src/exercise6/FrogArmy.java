package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {

  private ArrayList<Frog> frogList = new ArrayList<>();
  
  public FrogArmy(String file) throws FileNotFoundException, IOException{
      
    BufferedReader br = new BufferedReader (new FileReader(file));
    String line = br.readLine();
    while (line != null){
        String[] frog = line.split(",");
        line = br.readLine();
        if ("Frog".equals(frog[2])){
            frogList.add(new Frog (frog[0], Integer.parseInt(frog[1])));
        
        
    }
        
  

  
  }  this.frogList = frogList;
  }    

  
  public Frog getChief(){
      int oldest = 0;
      for (int i=0; i<frogList.size(); ++i){
          if (frogList.get(i).getAge() > oldest){
              oldest = frogList.get(i).getAge();
          }

      }
      for (int i=0; i<frogList.size(); ++i){
          if (frogList.get(i).getAge() == oldest){
              return frogList.get(i);
          }
      }
      return null;
}

    int size() {
        return frogList.size();
    }

}


