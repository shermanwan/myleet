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
    TreeNode actual = solution.constructMaximumBinaryTree(input);
    Object[] expect = new Object[] { 6, 3, 5, null, 2, 0, null, null, 15 };
    Assertions.assertArrayEquals(expect, TreeUtil.levelOrder(actual));
  }

}
