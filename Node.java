package com.architect;


class Node {

    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class BinaryTree {

    Node root;


    int Ceil(Node node, int input)
    {

        // Base case
        if (node == null) {
            return -1;
        }

        // We found equal key
        if (node.data == input) {
            return node.data;
        }


        if (node.data < input) {
            return Ceil(node.right, input);
        }


        int ceil = Ceil(node.left, input);

        return (ceil >= input) ? ceil : node.data;
    }


    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.right.left = new Node(55);
        for (int i = 0; i < 16; i++) {

            System.out.println(i + " "
                    + tree.Ceil(tree.root, i));
        }
    }
}


