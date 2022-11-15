package oop.measure;

public class Inch extends Measure {

  public static final double METERS_TO_INCH_FACTOR = 39.3701;

  public Inch(double inch) {
    super(inch);
  }


  public Inch add(Measure valueToAdd){
    Inch ValueToReturn = new Inch(super.getValue() + valueToAdd.getValue());
    if(valueToAdd instanceof Meter){
      ValueToReturn = new Inch(super.getValue() + (valueToAdd.getValue() * METERS_TO_INCH_FACTOR));
    }
    return ValueToReturn;
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
