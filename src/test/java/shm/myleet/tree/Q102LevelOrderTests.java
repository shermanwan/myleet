package shm.myleet.tree;

import java.util.List;

import com.ciaoshen.leetcode.util.TreeNode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import shm.myleet.common.TreeUtil;

public class Q102LevelOrderTests {

  Q102LevelOrder solution = new Q102LevelOrder();

  @Test
  public void basic1() {
    TreeNode tree = TreeUtil.fromArray(new Object[] { 3, 9, 20, null, null, 15, 7 });

    int[][] expected = new int[][] { { 3 }, { 9, 20 }, { 15, 7 } };
    List<List<Integer>> actual = solution.levelOrder(tree);
    for (int i = 0; i < expected.length; i++) {
      Assertions.assertArrayEquals(expected[i], actual.get(i).stream().mapToInt(Integer::valueOf).toArray(),
          "row" + (i + 1));
    }
  }

  @Test
  public void boundary1() {
    TreeNode tree = null;

    int[][] expected = new int[][] {};
    List<List<Integer>> actual = solution.levelOrder(tree);
    for (int i = 0; i < expected.length; i++) {
      Assertions.assertArrayEquals(expected[i], actual.get(i).stream().mapToInt(Integer::valueOf).toArray(),
          "row" + (i + 1));
    }
  }

  @Test
  public void boundary2() {
    TreeNode tree = TreeUtil.fromArray(new Object[] { 3 });

    int[][] expected = new int[][] { { 3 } };
    List<List<Integer>> actual = solution.levelOrder(tree);
    for (int i = 0; i < expected.length; i++) {
      Assertions.assertArrayEquals(expected[i], actual.get(i).stream().mapToInt(Integer::valueOf).toArray(),
          "row" + (i + 1));
    }
  }

  @Test
  public void offical() {
    TreeNode tree = TreeUtil.fromArray(new Object[] { 1, 2, 3, 4, null, null, 5 });

    int[][] expected = new int[][] { { 1 }, { 2, 3 }, { 4, 5 } };
    List<List<Integer>> actual = solution.levelOrder(tree);
    for (int i = 0; i < expected.length; i++) {
      Assertions.assertArrayEquals(expected[i], actual.get(i).stream().mapToInt(Integer::valueOf).toArray(),
          "row" + (i + 1));
    }
  }

}
