package john.generator;

import org.json.simple.*;
import org.json.simple.parser.*;

import john.Generator;

// 0.0.1:0.0.2
public class DGen extends Generator {
  public HashMap<String,String> variables = new HashMap<String,String>();
  
  public void loadFile(String file) {
    try {
      JSONObject json = (JSONObject) new JSONParser().parse(new FileReader(Utils.path(".data.generators.")+file));
      String[] keys = new KeyArray(json.keySet()).get();
      for (String key:keys) {
        if (key.contains("IMPORT_FROM")) {
          
        } else if (key.contains("IMPORT_AS")) {
          
        } else if (key.contains("IMPORT")) {
          
        } else if (key.contains("ERRORFIXES")) {
          
        } else if (key.contains("VARS")) {
          
        } else {
          
        }
      }
      for (String key:keys) {
        for (int i = 0; i < vocab.get(key).size(); i++) {
          String tok = "";
          int state = 0;
          String input = vocab.get(key).get(i);
          for (int j = 0; j < input.size(); j++) {
            char c = input.charAt(j);
            if (state == 0) {
              if (c == '{') {
                state = 1;
                i--;
              }
            } else if (state == 1) {
              tok += c;
              if (c == '}') {
                
              } else if (c == '|') {
                String oncv = tok.replace("{","").replace("}","");
                generators.put(oncv,new DGen(new File(oncv)));
                tok = "";
                state = 0;
              }
            } else {
              throw new IllegalStateException("INVALID VOCABULARY PARSING STATE: "+state);
            }
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
