public class Range<E> {
  public E greaterThan;
  public E lessThan;

  public Range(E min,E max) {
    set(min,max);
  }
  
  public void set(E min,E max) {
    this.lessThan = max;
    this.greaterThan = min;
  }
}
