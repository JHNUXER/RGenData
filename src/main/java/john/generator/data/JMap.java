package john.generator.data;

import java.util.*;

public class JMap extends HashMap<String,Object> {
  public JMap(JSONObject json) {
    String[] keys = new ArrayList<String>(json.keySet()).toArray(new String[] {});
    for (String key:keys) {
      super.put(key,json.get(key));
    }
  }
}
