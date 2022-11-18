package oop.additionalkatas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArraysComparator {

  public static int compare(List<Integer> array1, List<Integer> array2) {
    int counter = 0;
    for (Integer currentValue : array1) {
      if(array2.contains(currentValue)) {
        counter++;
      }
    }
    return counter;
  }

  public static int getNumberOfRepeatedNumbers(int[] firstArray, int[] secondArray) {
    final var seenValueMap = new HashMap<>();
    Arrays.stream(firstArray).forEach(i -> seenValueMap.put(i, 1));
    return (int) Arrays.stream(secondArray).filter(seenValueMap::containsKey).count();
  }
}
