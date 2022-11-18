package oop.additionalkatas;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class StatsTest {

  private int[] values = new int[] {1, 2, 3};
  private Stats stats = new Stats();

  @Test
  public void itShouldReturnMinimumValue() {
    assertEquals(stats.minimumValue(values), 1);
  }

  @Test
  public void itShouldReturnMaximumValue() {
    assertEquals(stats.maximumValue(values), 3);
  }
  
  @Test
  public void itShouldReturnTotalNumberOfElement() {
    assertEquals(stats.totalSize(values), 3);
  }

  @Test
  public void itShouldReturnAverageValue() {
    assertEquals(stats.averageValue(values), 2);
  }



}