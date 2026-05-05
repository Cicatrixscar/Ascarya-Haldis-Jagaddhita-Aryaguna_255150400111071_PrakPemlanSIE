import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;
    
    public void add(int data) { 
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }
    
    public void preTraverse(Node node) {
        if (node == null) return;
        System.out.printf("[%d]", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }
    
    public void inTraverse(Node node) {
        if (node == null) return;
        inTraverse(node.left);
        System.out.printf("[%d]", node.data);
        inTraverse(node.right);
    }
    
    public void postTraverse(Node node) {
        if (node == null) return;
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%d]", node.data);
    }
    
    public int countNodes(Node node) {
        if (node == null)
            return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
    
    public int countLeaves(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    public int height(Node node) {
        if (node == null)
            return 0;
        int leftH = height(node.left);
        int rightH = height(node.right);
        return 1 + Math.max(leftH, rightH);
    }

    public void levelTraverse(Node node) {
        if (node == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.printf("[%d]", current.data);
            if (current.left != null)
                q.offer(current.left);
            if (current.right != null)
                q.offer(current.right);
        }
    }
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for (int i = 0; i < 10; i++) {
            int nilai = (int) (Math.random() * 100);
            System.out.printf("Nilai %d dimasukkan.\n", nilai);
            tree.add(nilai);
        }
        
        /*String[] nama = {"Ada", "S", "Rusdi", "Fuad", "Ryan", "Imut", "Jacob i", "Leon", "Marin", "Wakana"}; //Ubah menjadi String
        for (String nilai : nama) { //Ubah pula menjadi String dan nama array
            System.out.printf("Nilai %s dimasukkan.\n", nilai);
            tree.add(nilai);
        }*/

        System.out.println("Tinggi tree : " + tree.height(tree.root));
        //System.out.println("Jumlah daun : " + tree.countLeaves(tree.root));
        //System.out.println("Jumlah node : " + tree.countNodes(tree.root));

        System.out.print("Preorder      : ");
        tree.preTraverse(tree.root);
        System.out.println();

        System.out.print("Inorder       : ");
        tree.inTraverse(tree.root);
        System.out.println();

        System.out.print("Postorder     : ");
        tree.postTraverse(tree.root);
        System.out.println();

        System.out.print("Level Order   : ");
        tree.levelTraverse(tree.root);
        System.out.println();
    }
    
}