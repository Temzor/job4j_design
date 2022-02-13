package leetcode.easy;

import java.util.*;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                result.addFirst(root.val);
                root = root.right;
            }
            root = stack.pop();
            root = root.left;
        }
        return result;
    }
}