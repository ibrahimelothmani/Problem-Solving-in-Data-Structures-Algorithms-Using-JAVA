
 //
 // Definition for a binary tree node.

 class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int max = maxDepth(root);
        return dfs(root, max, 0);
    }

    private TreeNode dfs(TreeNode root, int max, int len) {
        if (root == null) return null;
        if (max - 1 == len) return root;
        TreeNode left = dfs(root.left, max, len + 1);
        TreeNode right = dfs(root.right, max, len + 1);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}


public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
    }
}