package oop.measure;

public class Inch extends Measure {

  public Inch(double inch) {
    super(inch);
  }

  @Override
  public int hashCode() {
    return (int) super.getValue();
  }

  @Override
  public boolean equals(Object obj) {
    return this.hashCode() == obj.hashCode();
  }
}
