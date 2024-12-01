class Node {
    int value;
    Node left, right;

    Node(int item) {
        value = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Insert a new value into the tree
    void insert(int value) {
        root = insertingNode(root, value);
    }

    Node insertingNode(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertingNode(root.left, value);
        } else if (value > root.value) {
            root.right = insertingNode(root.right, value);
        }
        return root;
    }

    // Delete a value from the tree
    void delete(int value) {
        root = deletingNode(root, value);
    }

    Node deletingNode(Node root, int value) {
        if (root == null) return root;

        if (value < root.value) {
            root.left = deletingNode(root.left, value);
        } else if (value > root.value) {
            root.right = deletingNode(root.right, value);
        } else {
            // Node with only one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = deletingNode(root.right, root.value);
        }
        return root;
    }

    int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    // Search for a value in the tree
    boolean search(int value) {
        return searchingNode(root, value);
    }

    boolean searchingNode(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        return value < root.value ? searchingNode(root.left, value) : searchingNode(root.right, value);
    }

    // Inorder traversal
    void inorder() {
        inordering(root);
        System.out.println();
    }

    void inordering(Node root) {
        if (root != null) {
            inordering(root.left);
            System.out.print(root.value + " ");
            inordering(root.right);
        }
    }

    // Preorder traversal
    void preorder() {
        preordering(root);
        System.out.println();
    }

    void preordering(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preordering(root.left);
            preordering(root.right);
        }
    }

    // Postorder traversal
    void postorder() {
        postordering(root);
        System.out.println();
    }

    void postordering(Node root) {
        if (root != null) {
            postordering(root.left);
            postordering(root.right);
            System.out.print(root.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        bst.insert(50);
        bst.insert(40);
        bst.insert(30);
        bst.insert(20);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder: ");
        bst.inorder();

        System.out.print("Preorder: ");
        bst.preorder();

        System.out.print("Postorder: ");
        bst.postorder();

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 100: " + bst.search(100));

        bst.delete(20);
        System.out.print("Inorder after deleting 20: ");
        bst.inorder();

        bst.delete(30);
        System.out.print("Inorder after deleting 30: ");
        bst.inorder();

        bst.delete(50);
        System.out.print("Inorder after deleting 50: ");
        bst.inorder();
    }
}
