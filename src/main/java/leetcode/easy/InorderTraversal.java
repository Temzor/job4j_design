package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        return list;
    }

    public void helper(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        helper(list, node.left);
        list.add(node.val);
        helper(list, node.right);
    }
}