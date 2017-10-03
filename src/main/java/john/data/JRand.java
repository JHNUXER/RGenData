public class JRand {
  private static Random r0;
  private static ArrayList<Integer> integers = new ArrayList<Integer>();
  private static int rndx;
  private static int randomMax;
  
  public static void randgen() {
    if (integers.size() < 1) {
      integers.removeAll();
      for (int i = 0; i < randomMax; i++) {
        integers.add(i);
      }
    }
    Collections.shuffle(integers);
  }

  public static int get(int mx) {
    int k = -1;
    while (k == -1 || k >= mx) {
      k = integers.get(rndx++);
    }
    return k;
  }
  public static String rands(String[] input) {
    return input[get(input.length())];
  }
  public static String rands(ArrayList<String> input) {
    return rands(input.toArray(new String[] {}));
  }
}
