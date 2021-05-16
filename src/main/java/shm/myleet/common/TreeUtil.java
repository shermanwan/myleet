package shm.myleet.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.ciaoshen.leetcode.util.TreeNode;

public class TreeUtil {

  public static TreeNode fromArray(Object[] vals) {
    Queue<TreeNode> nodeQ = new LinkedList<>();

    if (vals == null || vals.length == 0) {
      return null;
    }

    TreeNode root = new TreeNode((int) vals[0]);
    nodeQ.add(root);

    for (int i = 1; i + 1 < vals.length; i += 2) {
      TreeNode parent = nodeQ.poll();
      if (vals[i] != null) {
        TreeNode left = new TreeNode((int) vals[i]);
        parent.left = left;
        nodeQ.add(left);
      }
      if (vals[i + 1] != null) {
        TreeNode right = new TreeNode((int) vals[i + 1]);
        parent.right = right;
        nodeQ.add(right);
      }
    }

    return root;
  }

  public static Object[] levelOrder(TreeNode root) {
    List<Object> levels = new ArrayList<Object>();
    if (root == null) {
      return levels.toArray();
    }

    // 当前级 nodes
    List<TreeNode> curLevelNodes = new ArrayList<>();
    // 下一级 nodes
    List<TreeNode> subLevelNodes = new ArrayList<>();

    curLevelNodes.add(root);

    // 是否还有下层非空元素
    boolean hasSub = true;
    while (hasSub) {
      hasSub = false;

      for (TreeNode curNode : curLevelNodes) {
        if (curNode != null) {
          levels.add(curNode.val);
          subLevelNodes.add(curNode.left);
          subLevelNodes.add(curNode.right);
          if (curNode.left != null || curNode.right != null) {
            hasSub = true;
          }
        } else {
          levels.add(null);
          subLevelNodes.add(null);
          subLevelNodes.add(null);
        }
      }

      // 下一级变当前级
      curLevelNodes = subLevelNodes;
      subLevelNodes = new ArrayList<>();
    }

    return levels.toArray();
  }

}
