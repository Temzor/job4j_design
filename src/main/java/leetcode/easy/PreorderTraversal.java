package leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new LinkedList<>();
        if (root == null) {
            return preorder;
        }
        preorder.add(root.val);
        preorder.addAll(preorderTraversal(root.left));
        preorder.addAll(preorderTraversal(root.right));
        return preorder;
    }
}
