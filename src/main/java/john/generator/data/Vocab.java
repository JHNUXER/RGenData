public class Vocab extends JMap {
  private IGenerator generator;
  
  public Vocab(IGenerator generator) {
    this.generator = generator;
  }
  
  public String rands(String key) {
    if (!(this.get(key) instanceof ArrayList<String>)) {
      System.out.println("Invalid Key \""+key+"\". Value is not an ArrayList<String> object.");
      System.exit(1);
    }
    
  }
  
  public IGenerator getGenerator() {
    return this.generator;
  }
}
