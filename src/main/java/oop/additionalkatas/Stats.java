package oop.additionalkatas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stats {

  public int minimumValue(int[] values) {
    return Arrays.stream(values).min().getAsInt();
  }

  public int maximumValue(int[] values) {
    return Arrays.stream(values).max().getAsInt();
  }

  public int totalSize(int[] values) {
    return values.length;
  }

  public int averageValue(int[] values) {
    return Arrays.stream(values).sum() / totalSize(values);
  }
}
