public class LongRange extends Range<Long> {
  public LongRange(String input) {
    try {
      String[] k = input.split();
      long mn;
      long mx;
      if (k.length < 2) throw new InvalidArgumentException("\"input\" to constructor (String) for LongRange must have two values separated by a comma.");
      if (k[0].startsWith("[")) {
        k[0] = k[0].replace("[","");
        mn = Long.parseLong(k[0])-1;
      } else if (k[0].startsWith("(")) {
        k[0] = k[0].replace("(","");
        mn = Long.parseLong(k[0]);
      }
      if (k[1].endsWith("]")) {
        k[1] = k[1].replace("]","");
        mn = Long.parseLong(k[1])+1;
      } else if (k[1].endsWith(")")) {
        k[1] = k[1].replace(")","");
        mn = Long.parseLong(k[1]);
      }
      set(mn,mx);
    } catch (Exception e) {
      e.prlongStackTrace();
      System.exit(1);
    }
  }
}
