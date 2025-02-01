package Tree;

public class MergeTwoBinaryTrees {

    static class TreeNode {
        int val;

        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if (root1 == null) return root2;
        if (root2 == null) return root1;
        TreeNode node = new TreeNode(root1.val + root2.val);
        mergeTrees(root1.left, root2.left);
        mergeTrees(root1.right, root2.right);

        return node;
    }


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.left = null;
        root2.left.right = new TreeNode(4);
        root2.right.left = null;
        root2.right.right = new TreeNode(7);


        System.out.println(mergeTrees(root1, root2).toString());

    }


}
