public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insertNode(12);
        binaryTree.insertNode(6);
        binaryTree.insertNode(18);
        binaryTree.insertNode(3);
        binaryTree.insertNode(9);
        binaryTree.insertNode(15);
        binaryTree.insertNode(21);

        binaryTree.inOrderTraversal();
    }

}