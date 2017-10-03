public class KeyArray extends ArrayList<String> {
  public String[] get() {
    return super.toArray(new String[] {});
  }
}
