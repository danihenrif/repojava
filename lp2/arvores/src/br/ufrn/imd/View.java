package br.ufrn.imd;
import br.ufrn.imd.Tree;

import java.util.Random;

public class View {
    public static void main(String[] args) {
        Random rand = new Random();
        Tree tree = new Tree();

        for(int i = 0 ; i < 10 ; i++) {
            tree.insert(rand.nextInt(100), tree.root);
        }

        System.out.println("\nSIZE:" + tree.getSize());

        System.out.println("\nPRE-ORDER:");
        tree.preOrder(tree.root);

        System.out.println("\nIN-ORDER:");
        tree.inOrder(tree.root);

        System.out.println("\nPOS-ORDER:");
        tree.posOrder(tree.root);


    }
}
