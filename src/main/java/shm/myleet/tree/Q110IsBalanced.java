package shm.myleet.tree;

import com.ciaoshen.leetcode.util.TreeNode;

import lombok.extern.slf4j.Slf4j;

/**
 * 110. 平衡二叉树
 *
 * @see https://leetcode-cn.com/problems/balanced-binary-tree/
 */
@Slf4j
public class Q110IsBalanced {

  /**
   * 给定一个二叉树，判断它是否是高度平衡的二叉树。
   *
   * 本题中，一棵高度平衡二叉树定义为：
   *
   * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
   *
   * @param root
   * @return
   */
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    return getDeep(root, 0) > 0;
  }

  /**
   * 平衡树返回树深度；否则返回-1
   *
   * @param node
   * @param parentLevel
   * @return
   */
  private int getDeep(TreeNode node, int parentLevel) {
    if (node == null) {
      return parentLevel;
    }
    int leftDepth = getDeep(node.left, parentLevel + 1);
    int rightDepth = getDeep(node.right, parentLevel + 1);

    if (leftDepth < 0 || rightDepth < 0) {
      return -1;
    }

    return Math.abs(leftDepth - rightDepth) <= 1 ? Math.max(leftDepth, rightDepth) : -1;
  }

}
