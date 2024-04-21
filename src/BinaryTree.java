public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insertNode(int val) {
        root = insertRecursion(root, val);
    }

    private TreeNode insertRecursion(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRecursion(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursion(root.right, val);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    private void inOrderTraversalRec(TreeNode root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.val + " ");
            inOrderTraversalRec(root.right);
        }
    }

    public boolean search(int val) {
        return searchRecursion(root, val);
    }

    private boolean searchRecursion(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        }

        if (val < root.val) {
            return searchRecursion(root.left, val);
        } else {
            return searchRecursion(root.right, val);
        }
    }

    public int minValue(TreeNode root) {
        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.val;
    }

    public int maxValue(TreeNode root) {
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.val;
    }

    public void deleteNode(int val) {
        root = deleteRecursion(root, val);
    }

    private TreeNode deleteRecursion(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (val < root.val) {
            root.left = deleteRecursion(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRecursion(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.val = minValue(root.right);
            root.right = deleteRecursion(root.right, root.val);
        }
        return root;
    }

}
