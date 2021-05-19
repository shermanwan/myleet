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

}
