package john.generator;

public interface IGenerator {
  public JRand getRNG();
  public String getVersion();
  public int getGen();
  public Object[] generate();
}
