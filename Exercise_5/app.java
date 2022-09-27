// Binary Tree in Java
public class App {

    public static void main(String[] args) {

        // Create root node A President
        Node A = new Node("James");
        // Create node B Vice Presindent
        Node B = new Node("Jeremiah");
        // Create node C Secretary
        Node C = new Node("Velle");
        // Create node D Senior Executive
        Node D = new Node("Mariel");
        // Create node E Junior Executive
        Node E = new Node("Mario");
        // Create node F Board of Directors
        Node F = new Node("Sheesh");
        // Create node G Employee
        Node G = new Node("Nc G");

        // Set left and right child of root node A
        A.left = B;
        A.right = C;

        // Set left and right child of node B
        B.left = D;
        B.right = E;

        // Set left and right child of node C
        C.left = F;
        C.right = G;

        
        System.out.print("\nIn order Traversal: ");
        traverseInOrder(A);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(A);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(A);
    }

       // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
    }
}

   // Traverse Postorder method
   static void traversePostOrder(Node node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.data);
    }
}

 // Traverse Inorder Method
 static void traverseInOrder(Node node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(" " + node.data);
        traverseInOrder(node.right);
    }
}
}
