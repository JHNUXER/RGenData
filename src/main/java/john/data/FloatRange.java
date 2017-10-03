public class FloatRange extends Range<Float> {
  public FloatRange(String input) {
    try {
      String[] k = input.split();
      float mn;
      float mx;
      if (k.length < 2) throw new InvalidArgumentException("\"input\" to constructor (String) for FloatRange must have two values separated by a comma.");
      if (k[0].startsWith("[")) {
        k[0] = k[0].replace("[","");
        mn = Float.parseFloat(k[0])-1;
      } else if (k[0].startsWith("(")) {
        k[0] = k[0].replace("(","");
        mn = Float.parseFloat(k[0]);
      }
      if (k[1].endsWith("]")) {
        k[1] = k[1].replace("]","");
        mn = Float.parseFloat(k[1])+1;
      } else if (k[1].endsWith(")")) {
        k[1] = k[1].replace(")","");
        mn = Float.parseFloat(k[1]);
      }
      set(mn,mx);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
