package Tree;

public class RangeSumofBST {
    static class TreeNode {
        int val;

        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        int sum =0;

        if(root != null && (root.val>=low && root.val<=high)){
            sum = sum+root.val;
        }
        if(root.left!=null)
            rangeSumBST(root.left,low,high);
        if(root.right!=null)
            rangeSumBST(root.right,low,high);

        return sum;
    }

    public static void main(String[] args) {

        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.left.left = null;
        original.left.right = null;
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.left.left = null;
        cloned.left.right = null;
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);

        TreeNode target = original.right;

        System.out.println(rangeSumBST(original,7,15));

    }
}
