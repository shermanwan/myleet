package shm.myleet.tree;

import com.ciaoshen.leetcode.util.TreeNode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import shm.myleet.common.TreeUtil;

public class Q669TrimBSTTests {

  Q669TrimBST solution = new Q669TrimBST();

  @Test
  public void basic1() {
    TreeNode input = TreeUtil.fromArray(new Object[] { 1, 0, 2 });
    TreeNode actual = solution.trimBST(input, 1, 2);
    Assertions.assertArrayEquals(new Object[] { 1, null, 2 }, TreeUtil.levelOrder(actual));
  }

  @Test
  public void basic2() {
    TreeNode input = TreeUtil.fromArray(new Object[] { 3, 0, 4, null, 2, null, null, 1 });
    TreeNode actual = solution.trimBST(input, 1, 3);
    Assertions.assertArrayEquals(new Object[] { 3, 2, null, 1, null }, TreeUtil.levelOrder(actual));
  }

  @Test
  public void basic3() {
    TreeNode input = TreeUtil.fromArray(new Object[] { 1 });
    TreeNode actual = solution.trimBST(input, 1, 2);
    Assertions.assertArrayEquals(new Object[] { 1 }, TreeUtil.levelOrder(actual));
  }

  @Test
  public void basic4() {
    TreeNode input = TreeUtil.fromArray(new Object[] { 1, null, 2 });
    TreeNode actual = solution.trimBST(input, 1, 3);
    Assertions.assertArrayEquals(new Object[] { 1, null, 2 }, TreeUtil.levelOrder(actual));
  }

  @Test
  public void basic5() {
    TreeNode input = TreeUtil.fromArray(new Object[] { 1, null, 2 });
    TreeNode actual = solution.trimBST(input, 2, 4);
    Assertions.assertArrayEquals(new Object[] { 2 }, TreeUtil.levelOrder(actual));
  }

}
