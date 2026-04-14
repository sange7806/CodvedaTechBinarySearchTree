public class BinarySearchTree {

    TreeNode root;

    // Insert node
    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Search node
    public boolean search(TreeNode root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    // InOrder Traversal
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Find minimum value
    public TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete node
    public TreeNode delete(TreeNode root, int key) {

        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        }
        else if (key > root.data) {
            root.right = delete(root.right, key);
        }
        else {

            if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;

            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }

        return root;
    }
}