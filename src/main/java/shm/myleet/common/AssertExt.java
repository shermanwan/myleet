package shm.myleet.common;

import java.util.List;

import org.junit.jupiter.api.Assertions;

public class AssertExt {

  public static void assertArraysEqual(int[][] expect, int[][] actual) {
    for (int i = 0; i < expect.length; i++) {
      Assertions.assertArrayEquals(expect[i], actual[i], "row" + (i + 1));
    }
  }

  public static int[][] valueOf(List<List<Integer>> arr) {
    return arr.stream()
      .map(integers -> integers.stream()
      .mapToInt(value -> value).toArray())
      .toArray(int[][]::new);
  }

}
