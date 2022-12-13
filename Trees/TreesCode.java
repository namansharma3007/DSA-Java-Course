package Trees;

import java.util.*;

public class TreesCode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public Node buildTree(int []nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int count(Node root){
        if(root == null) return 0;
        
        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount+rightCount+1;
        
    }

    public static int sum(Node root){
        if(root == null) return 0;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum+rightSum+root.data;
    }

    public static int height(Node root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight)+1;
        return maxHeight;
    }

    // O(N^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);

        int dia3 = height(root.left) + height(root.right) + 1;

        return Math.max(dia3, Math.max(dia1,dia2));
    }
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);

        return myInfo;
    }
    
    

    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // levelOrder(root);
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println(height(root));

        // System.out.println(diameter(root));
        // System.out.println(diameter2(root).diam);

        

    }
}
