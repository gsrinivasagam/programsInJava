package Tree;

public class FlattenBinaryTreetoLinkedList {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        flatten(root);
    }

    private static TreeNode prev = null;
    public static void flatten(TreeNode root) {
        if (root == null)
            return;
        System.out.println("root val"+root.val);
        flatten(root.right);
        flatten(root.left);
        System.out.println("root val"+root.val);
        root.right = prev;
        root.left = null;
        prev = root;
    }


  }
}
