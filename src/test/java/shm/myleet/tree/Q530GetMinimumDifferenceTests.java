package shm.myleet.tree;

import com.ciaoshen.leetcode.util.TreeNode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import shm.myleet.common.TreeUtil;

public class Q530GetMinimumDifferenceTests {

  Q530GetMinimumDifference solution = new Q530GetMinimumDifference();

  @Test
  public void basic1() {
    TreeNode input = TreeUtil.fromArray(new Object[] { 1, null, 3, 2, null });
    int actual = solution.getMinimumDifference(input);
    Assertions.assertEquals(1, actual);
  }

}
