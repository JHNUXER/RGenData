public abstract class Generator {
  public HashMap<String,ArrayList<String>> vocab = new HashMap<String,ArrayList<String>>();
  public HashMap<String,Generator> generators = new HashMap<String,Generator>();
  public JRand random = new JRand();
}
