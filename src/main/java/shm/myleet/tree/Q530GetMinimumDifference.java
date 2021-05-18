package shm.myleet.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    // 中序遍历得到排序数组
    Stack<TreeNode> stack = new Stack<>();
    int previewValue = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;
    stack.push(root);
    while (!stack.empty()) {
      TreeNode node = stack.peek();
      // 中序遍历
      if (node.left != null) {
        stack.push(node.left);
      } else {
        int curValue = node.val;
        min = Math.min(min, Math.abs(previewValue - curValue));
        if (node.right != null) {
          stack.push(node.right);
        }
      }
    }

    return min;
  }

}
