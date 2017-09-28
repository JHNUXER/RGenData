package john.generator.species_1;

import john.generator.*;
import john.generator.data.*;

public class GenA implements IGenerator {
  public Vocab vocab;
  public JRand random;
  public JMap variables;
  // errorFixes removed.
 
  public String parse(String input,JMap obj) {
    String k = input;
    int state = 0;
    String tok = "";
    ArrayList<String> tokens = new ArrayList<String>();
    for (int i = 0; i < k.length(); i++) {
      char c = k.charAt(i);
      if (state == 0) {
        if (c == '<') {
          state = 1;
          i--;
        }
      } else if (state == 1) {
        tok += c;
        if (tok == '>') {
          tokens.add(tok);
          tok = "";
          state = 0;
        }
      }
    }
  }
  public JMap parse(JMap map) {
    String[] keys = new ArrayList<String>(map.keySet()).toArray(new String[] {});
    for (String key:keys) {
      if (map.get(key).contains("<") && map.get(key).contains(">")) map.put(key,parse(map.get(key),map));
    }
  }

  public String getVersion() {return "0.1.0:v0.0.0";}
  public char getGen() {return 'A';}
  public Object[] generate() {
    JMap output = new JMap();
    String[] keys = new ArrayList<String>(vocab.keySet()).toArray(new String[] {});
    for (String key:keys) {
      if (key.startsWith("<") && key.endsWith(">")) {
      } else if (key.startsWith("%") && key.endsWith("%")) {
        
      } else {
        
      }
    }
  }
  public JRand getRandom() {
    return this.random;
  }
}
