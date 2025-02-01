package Tree;

public class SumofRootToLeafBinaryNumbers {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        System.out.println(sumRootToLeaf(root));
    }

    static int sum = 0;

    public static int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum;
    }


    public static void dfs(TreeNode root, int val) {
        if (root == null) return;
        val = val << 1 | root.val;
        if (root.left == null && root.right == null) sum += val;
        dfs(root.left, val);
        dfs(root.right, val);
    }
}
