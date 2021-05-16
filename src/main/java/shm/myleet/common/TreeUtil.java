package shm.myleet.common;

import java.util.LinkedList;
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

}
