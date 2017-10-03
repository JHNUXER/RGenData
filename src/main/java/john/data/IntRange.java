public class IntRange extends Range<Integer> {
  public IntRange(String input) {
    try {
      String[] k = input.split();
      int mn;
      int mx;
      if (k.length < 2) throw new InvalidArgumentException("\"input\" to constructor (String) for IntRange must have two values separated by a comma.");
      if (k[0].startsWith("[")) {
        k[0] = k[0].replace("[","");
        mn = Integer.parseInt(k[0])-1;
      } else if (k[0].startsWith("(")) {
        k[0] = k[0].replace("(","");
        mn = Integer.parseInt(k[0]);
      }
      if (k[1].endsWith("]")) {
        k[1] = k[1].replace("]","");
        mn = Integer.parseInt(k[1])+1;
      } else if (k[1].endsWith(")")) {
        k[1] = k[1].replace(")","");
        mn = Integer.parseInt(k[1]);
      }
      set(mn,mx);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
