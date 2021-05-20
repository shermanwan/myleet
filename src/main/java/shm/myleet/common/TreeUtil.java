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

    for (int i = 1; i < vals.length; i += 2) {
      TreeNode parent = nodeQ.poll();
      if (vals[i] != null) {
        TreeNode left = new TreeNode((int) vals[i]);
        parent.left = left;
        nodeQ.add(left);
      }
      if ((i + 1) < vals.length && vals[i + 1] != null) {
        TreeNode right = new TreeNode((int) vals[i + 1]);
        parent.right = right;
        nodeQ.add(right);
      }
    }

    return root;
  }

  public static Object[] levelOrder(TreeNode root) {

    List<Object> result = new ArrayList<Object>();
    if (root == null) {
      return result.toArray();
    }

    Queue<TreeNode> nodeQ = new LinkedList<>();
    nodeQ.add(root);

    while (!nodeQ.isEmpty()) {
      TreeNode curNode = nodeQ.poll();
      if (curNode != null) {
        result.add(curNode.val);
        // 有一个子节点不为空，就要继续向下搜索
        if (curNode.left != null || curNode.right != null) {
          nodeQ.add(curNode.left);
          nodeQ.add(curNode.right);
        }
      } else {
        // 空节点要加入 null 值，但是不再向下搜索
        result.add(null);
      }
    }

    return result.toArray();
  }

}
