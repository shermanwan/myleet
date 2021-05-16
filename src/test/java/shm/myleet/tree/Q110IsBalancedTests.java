package shm.myleet.tree;

import com.ciaoshen.leetcode.util.TreeNode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import shm.myleet.common.TreeUtil;

public class Q110IsBalancedTests {

  Q110IsBalanced solution = new Q110IsBalanced();

  @Test
  public void basic1() {
    TreeNode tree = TreeUtil.fromArray(new Object[] { 3, 9, 20, null, null, 15, 7 });
    Assertions.assertEquals(true, solution.isBalanced(tree));
  }

  @Test
  public void basic2() {
    TreeNode tree = TreeUtil.fromArray(new Object[] { 1, 2, 2, 3, 3, null, null, 4, 4 });
    Assertions.assertEquals(false, solution.isBalanced(tree));
  }

  @Test
  public void boundary1() {
    TreeNode tree = TreeUtil.fromArray(new Object[] {});
    Assertions.assertEquals(true, solution.isBalanced(tree));
  }

  @Test
  public void boundary2() {
    TreeNode tree = TreeUtil.fromArray(new Object[] { 1 });
    Assertions.assertEquals(true, solution.isBalanced(tree));
  }

}
