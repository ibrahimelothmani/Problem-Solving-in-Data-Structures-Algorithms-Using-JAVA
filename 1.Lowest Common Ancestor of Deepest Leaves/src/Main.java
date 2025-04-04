
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
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution solution = new Solution();
        TreeNode lca = solution.lcaDeepestLeaves(root);
        System.out.println(STR."Lowest Common Ancestor of Deepest Leaves: \{lca.val}");
    }
}