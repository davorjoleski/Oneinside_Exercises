package oneinside.task1.Bonus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    TreeNode root;
    private static final char[] VALUES = "ABCDEFGHIJKL".toCharArray();
    private int currentIndex = 0;

    public Tree(int depth) {
        if (depth > 0) {
            this.root = buildTree(depth);
        }
    }

    private TreeNode buildTree(int depth) {
        if (depth == 0 || currentIndex >= VALUES.length) {
            return null;
        }

        TreeNode node = new TreeNode(VALUES[currentIndex++]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty() && depth > 1) {
            int levelSize = queue.size();
            while (levelSize > 0 && currentIndex < VALUES.length) {
                TreeNode current = queue.poll();
                current.left = new TreeNode(VALUES[currentIndex++]);
                queue.add(current.left);
                if (currentIndex < VALUES.length) {
                    current.right = new TreeNode(VALUES[currentIndex++]);
                    queue.add(current.right);
                }
                levelSize--;
            }
            depth--;
        }

        return node;
    }

    public void printLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            while (levelSize > 0) {
                TreeNode currentNode = queue.poll();
                System.out.print(currentNode.value + " ");
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                levelSize--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int depth = 4;
        Tree tree = new Tree(depth);

        tree.printLevelOrder();
    }
}
