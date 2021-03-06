package shm.myleet.tree;

import com.ciaoshen.leetcode.util.TreeNode;

import lombok.extern.slf4j.Slf4j;

/**
 * 654. 最大二叉树
 *
 * @see https://leetcode-cn.com/problems/maximum-binary-tree/
 */
@Slf4j
public class Q654ConstructMaximumBinaryTree {

  /**
   * 给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：
   *
   * 二叉树的根是数组 nums 中的最大元素。 左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。 右子树是通过数组中 最大值右边部分
   * 递归构造出的最大二叉树。 返回有给定数组 nums 构建的 最大二叉树 。
   *
   * @param nums
   * @return
   */
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    return constructSubBinaryTree(nums, 0, nums.length);
  }

  private TreeNode constructSubBinaryTree(int[] nums, int start, int end) {
    TreeNode node = null;
    if (start == end) {
      // 子树为空
      // pass
    } else {
      // 查找 nums 区间最大值
      int maxValue = Integer.MIN_VALUE;
      int maxValueIndex = -1;
      for (int i = start; i < end; i++) {
        if (maxValue < nums[i]) {
          maxValue = nums[i];
          maxValueIndex = i;
        }
      }
      // 创建 TreeNode, 递归创建左右子树
      node = new TreeNode(maxValue);
      node.left = constructSubBinaryTree(nums, start, maxValueIndex);
      node.right = constructSubBinaryTree(nums, maxValueIndex + 1, end);
    }
    return node;
  }

}
