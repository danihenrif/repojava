package br.ufrn.imd;

public class Tree {
    Node root;
    int size;

    public Tree() {
        root = null;
        size = 0;
    }

    public void insert(int info, Node place) {
        if(place == null) {
            root = new Node(info);
            size++;
        }
        else if(info < place.info) {
            if(place.left == null) {
                place.left = new Node(info);
                size++;
            }
            else {
                insert(info,place.left);
            }
        }
        else if(info > place.info){
            if(place.right == null) {
                place.right = new Node(info);
                size++;
            }
            else{
                insert(info, place.right);
            }
        }
    }

    public void preOrder(Node place) {
        System.out.print(" " + place.info);
        if (place.left != null) {
            preOrder(place.left);
        }
        if (place.right != null) {
            preOrder(place.right);
        }
    }

    public void inOrder(Node place) {
        if (place.left != null) {
            inOrder(place.left);
        }
        System.out.print(" " + place.info);
        if (place.right != null) {
            inOrder(place.right);
        }
    }

    public void posOrder(Node place) {
        if (place.left != null) {
            posOrder(place.left);
        }
        if (place.right != null) {
            posOrder(place.right);
        }
        System.out.print(" " + place.info);
    }

    public int getSize() {
        return size;
    }
}
