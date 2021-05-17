package shm.myleet.tree;

import com.ciaoshen.leetcode.util.TreeNode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import shm.myleet.common.TreeUtil;

public class Q654ConstructMaximumBinaryTreeTests {

  Q654ConstructMaximumBinaryTree solution = new Q654ConstructMaximumBinaryTree();

  @Test
  public void basic1() {
    int[] input = new int[] { 3, 2, 1, 6, 0, 5 };
    TreeNode output = solution.constructMaximumBinaryTree(input);
    Object[] actual = TreeUtil.levelOrder(output);
    Object[] expect = new Object[] { 6, 3, 5, null, 2, 0, null, null, 1 };
    Assertions.assertArrayEquals(expect, actual);
  }

  @Test
  public void basic2() {
    int[] input = new int[] { 3, 2, 1 };
    TreeNode output = solution.constructMaximumBinaryTree(input);
    Object[] actual = TreeUtil.levelOrder(output);
    Object[] expect = new Object[] { 3, null, 2, null, 1 };
    Assertions.assertArrayEquals(expect, actual);
  }

  @Test
  public void boundary1() {
    int[] input = new int[] { 1 };
    TreeNode output = solution.constructMaximumBinaryTree(input);
    Object[] actual = TreeUtil.levelOrder(output);
    Object[] expect = new Object[] { 1 };
    Assertions.assertArrayEquals(expect, actual);
  }

  @Test
  public void boundary2() {
    int[] input = new int[] {};
    TreeNode output = solution.constructMaximumBinaryTree(input);
    Object[] actual = TreeUtil.levelOrder(output);
    Object[] expect = new Object[] {};
    Assertions.assertArrayEquals(expect, actual);
  }

}
