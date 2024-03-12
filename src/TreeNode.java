import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodeCount = scanner.nextInt();
        Map<Character, Node> nodeMap = new HashMap<>();

        for (int i = 0; i < nodeCount; i++) {
            Node node = new Node();
            node.data = (char) ('A' + i);
            nodeMap.put((char)('A'+i), node);
        }

        for (int i = 0; i < nodeCount; i++) {
            String next = scanner.next();
            String next1 = scanner.next();
            String next2 = scanner.next();
            char alpha = next.charAt(0);
            char left = next1.charAt(0);
            char right = next2.charAt(0);


            Node root = nodeMap.get(alpha);
            root.leftNode = nodeMap.get(left);
            root.rightNode = nodeMap.get(right);
        }



        preorderFun(nodeMap.get('A'));
        System.out.println();
        inorderFun(nodeMap.get('A'));
        System.out.println();
        postorderFun(nodeMap.get('A'));
    }

    private static void postorderFun(Node node) {
        //base case
        if (node == null) {
            return;
        }

        //recursive case
        postorderFun(node.leftNode);
        postorderFun(node.rightNode);
        System.out.print(node.data);
    }

    private static void inorderFun(Node node) {
        //base case
        if (node == null) {
            return;
        }


        //recursive case
        inorderFun(node.leftNode);
        System.out.print(node.data);
        inorderFun(node.rightNode);

    }

    private static void preorderFun(Node node) {
        //base case
        if (node == null) {
            return;
        }

        System.out.print(node.data);


        // recursive case
        preorderFun(node.leftNode);
        preorderFun(node.rightNode);
    }
}

class Node {
    char data = ' ';
    Node leftNode;
    Node rightNode;


}
