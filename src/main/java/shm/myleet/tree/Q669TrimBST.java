package shm.myleet.tree;

import com.ciaoshen.leetcode.util.TreeNode;

import lombok.extern.slf4j.Slf4j;

/**
 * 669. 修剪二叉搜索树
 *
 * @see https://leetcode-cn.com/problems/trim-a-binary-search-tree/
 */
@Slf4j
public class Q669TrimBST {

  /**
   * 给你二叉搜索树的根节点 root ，同时给定最小边界low 和最大边界 high。通过修剪二叉搜索树，使得所有节点的值在[low, high]中。
   *
   * 修剪树不应该改变保留在树中的元素的相对结构（即，如果没有被移除，原有的父代子代关系都应当保留）。 可以证明，存在唯一的答案。
   *
   * 所以结果应当返回修剪好的二叉搜索树的新的根节点。注意，根节点可能会根据给定的边界发生改变。
   *
   * @param root
   * @param low
   * @param high
   * @return
   */
  public TreeNode trimBST(TreeNode root, int low, int high) {
    if (root == null) {
      return null;
    }

    if (root.val < low) {
      // 主节点小于low，修剪掉整个左枝，返回右枝
      return trimBST(root.right, low, high);
    } else if (root.val > high) {
      // 主节点大于high，修剪掉整个右枝，返回左枝
      return trimBST(root.left, low, high);
    } else {
      root.left = trimBST(root.left, low, high);
      root.right = trimBST(root.right, low, high);
      return root;
    }
  }

}
