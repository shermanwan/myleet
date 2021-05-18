package shm.myleet.tree;

import com.ciaoshen.leetcode.util.TreeNode;

import lombok.extern.slf4j.Slf4j;

/**
 * 530. 二叉搜索树的最小绝对差
 *
 * @see https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 */
@Slf4j
public class Q530GetMinimumDifference {

  /**
   * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
   *
   * @param root
   * @return
   */
  public int getMinimumDifference(TreeNode root) {
    if (root == null) {
      return 0;
    }

    Visitor visitor = new Visitor();
    visitor.min = Integer.MAX_VALUE;
    visitor.previewValue = Integer.MAX_VALUE;

    visit(root, visitor);

    return visitor.min;
  }

  // 中序遍历
  private void visit(TreeNode node, Visitor visitor) {
    if (node == null) {
      return;
    }

    visit(node.left, visitor);

    // 更新全局 previewValue 和 min
    int curValue = node.val;
    visitor.min = Math.min(visitor.min, Math.abs(visitor.previewValue - curValue));
    visitor.previewValue = curValue;

    visit(node.right, visitor);
  }

  class Visitor {
    public int min;
    public int previewValue;
  }

}
