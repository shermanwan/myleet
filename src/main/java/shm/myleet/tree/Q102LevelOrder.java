package shm.myleet.tree;

import java.util.ArrayList;
import java.util.List;

import com.ciaoshen.leetcode.util.TreeNode;

import lombok.extern.slf4j.Slf4j;

/**
 * 151. 翻转字符串里的单词
 *
 * @see https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
@Slf4j
public class Q102LevelOrder {

  /**
   * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
   *
   * @param root
   * @return
   */
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    // 当前级 nodes
    List<TreeNode> curLevelNodes = new ArrayList<>();
    // 下一级 nodes
    List<TreeNode> subLevelNodes = new ArrayList<>();

    if (root == null) {
      return levels;
    }

    curLevelNodes.add(root);

    while (!curLevelNodes.isEmpty()) {
      List<Integer> level = new ArrayList<>();
      for (TreeNode curNode : curLevelNodes) {
        level.add(curNode.val);

        if (curNode.left != null) {
          subLevelNodes.add(curNode.left);
        }
        if (curNode.right != null) {
          subLevelNodes.add(curNode.right);
        }
      }

      if (level.size() > 0) {
        levels.add(level);
      }

      // 下一级变当前级
      curLevelNodes = subLevelNodes;
      subLevelNodes = new ArrayList<>();
    }

    return levels;
  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
