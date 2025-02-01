package Tree;

import java.util.*;

public class VerticalOrderTraversalofaBinaryTree {
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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(verticalTraversal(root));
    }

    static class Point {
        int x, y, val;

        Point(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }


    static Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new HashMap<>();
    static int minX = 0, maxX = 0;
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        helper(root, 0, 0);
        List<List<Integer>> vertical = new ArrayList<>();
        for (int i = minX; i <= maxX; i++) {
            List<Integer> level = new ArrayList<Integer>();
            for (int key : map.get(i).keySet()) {
                while (!(map.get(i).get(key)).isEmpty()) {
                    level.add(map.get(i).get(key).poll());
                }
            }
            vertical.add(level);
        }
        return vertical;

    }

    private static void helper(TreeNode node, int x, int y) {
        if (node == null) return;
        minX = Math.min(minX, x);
        maxX = Math.max(maxX, x);
        if (map.get(x) == null) { map.put(x, new TreeMap<Integer, PriorityQueue<Integer>>()); }
        if (map.get(x).get(y) == null) { map.get(x).put(y, new PriorityQueue<Integer>()); }
        map.get(x).get(y).add(node.val);
        helper(node.left, x - 1, y + 1);
        helper(node.right, x + 1, y + 1);

    }
}

