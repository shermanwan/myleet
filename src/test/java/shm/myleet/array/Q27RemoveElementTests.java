package shm.myleet.array;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q27RemoveElementTests {

  Q27RemoveElement solution = new Q27RemoveElement();

  @Test
  public void test1() {
    int[] mock = new int[] { 3, 2, 2, 3 };
    Assertions.assertEquals(2, solution.removeElement(mock, 3));
    Assertions.assertArrayEquals(new int[] { 2, 2 }, Arrays.copyOf(mock, 2));
  }

  @Test
  public void test2() {
    int[] mock = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
    Assertions.assertEquals(5, solution.removeElement(mock, 2));
    Assertions.assertArrayEquals(new int[] { 0, 1, 3, 0, 4 }, Arrays.copyOf(mock, 5));
  }

  @Test
  public void test3() {
    int[] mock = new int[] {};
    Assertions.assertEquals(0, solution.removeElement(mock, 2));
    Assertions.assertArrayEquals(new int[] {}, Arrays.copyOf(mock, 0));
  }

  @Test
  public void test4() {
    int[] mock = new int[] { 1 };
    Assertions.assertEquals(0, solution.removeElement(mock, 1));
    Assertions.assertArrayEquals(new int[] {}, Arrays.copyOf(mock, 0));
  }

  @Test
  public void test5() {
    int[] mock = new int[] { 1 };
    Assertions.assertEquals(1, solution.removeElement(mock, 2));
    Assertions.assertArrayEquals(new int[] { 1 }, Arrays.copyOf(mock, 1));
  }

}
