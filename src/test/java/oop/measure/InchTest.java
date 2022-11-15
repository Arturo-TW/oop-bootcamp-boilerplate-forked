package oop.measure;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class InchTest {

  @Test
  public void itShouldAddInches() {
    final Measure inch1 = new Inch(3);
    final Measure inch2 = new Inch(4);
    final Measure inchResult = inch1.add(inch2);
    assertEquals(inchResult, new Inch(7));
  }

  @Test
  public void itShouldAddInchesAndMeters() {
    final Measure inch1 = new Inch(2);
    final Measure meters1 = new Meter(1);
    final Measure inchResult = inch1.add(meters1);
    assertEquals(inchResult, new Inch(41.37008));
  }

}