package oop.additionalkatas;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

public class ArraysComparatorTest {

  @Test
  public void itShouldReturnTheNumberOfEqualElementsBetweenArrays() {
    List<Integer> array1 = Arrays.asList(1, 2, 3);
    List<Integer> array2 = Arrays.asList(1, 2, 3);
    List<Integer> array3 = Arrays.asList(1, 3, 4, 5);

    assertEquals(ArraysComparator.compare(array1, array2), 3);
    assertEquals(ArraysComparator.compare(array1, array3), 2);
  }

  @Test
  public void itShouldReturnTheNumberOfEqualElementsBetweenArraysV2() {
    assertEquals(ArraysComparator.getNumberOfRepeatedNumbers(new int[]{1, 2, 3}, new int[]{1, 2, 3}), 3);

  }

}
