package linkedbinarytree;

import java.util.Scanner;
public class BackPainExpert
{
    private LinkedBinaryTree<String> tree;
    //-----------------------------------------------------------------
    //  Sets up the diagnosis question tree.
    //-----------------------------------------------------------------
    public BackPainExpert()
    {
        String e1 = "Did the pain occur after a blow or jolt?";
        String e2 = "Do you have a fever?";
        String e3 = "Do you have difficulty controlling your arms or legs?";
        String e4 = "Do you have persistent morning stiffness?";
        String e5 = "Do you have a sore throat or runny nose?";
        String e6 = "Do you have pain or numbness in one arm or leg?";
        String e7 = "Emergency! You may have damaged your spinal cord.";
        String e8 = "See doctor if pain persists.";
        String e9 = "You may have an inflammation of the joints.";
        String e10 = "See doctor to address symptoms.";
        String e11 = "You may have a respiratory infection.";
        String e12 = "You may have a sprain or strain.";
        String e13 = "You may have a muscle or nerve injury.";
        LinkedBinaryTree<String> n2, n3, n4, n5, n6, n7, n8, n9,
                n10, n11, n12, n13;
        n8 = new LinkedBinaryTree<>(e8);
        n9 = new LinkedBinaryTree<>(e9);
        n4 = new LinkedBinaryTree<>(e4, n8, n9);
        n10 = new LinkedBinaryTree<>(e10);
        n11 = new LinkedBinaryTree<>(e11);
        n5 = new LinkedBinaryTree<>(e5, n10, n11);
        n12 = new LinkedBinaryTree<>(e12);
        n13 = new LinkedBinaryTree<>(e13);
        n6 = new LinkedBinaryTree<>(e6, n12, n13);
        n7 = new LinkedBinaryTree<>(e7);
        n2 = new LinkedBinaryTree<>(e2, n4, n5);
        n3 = new LinkedBinaryTree<>(e3, n6, n7);
        tree = new LinkedBinaryTree<>(e1, n2, n3);
    }
    //-----------------------------------------------------------------
    //  Follows the diagnosis tree based on user responses.
    //-----------------------------------------------------------------
    public void diagnose()
    {
        Scanner scan = new Scanner(System.in);
        BinaryTree<String> current = tree;
        System.out.println(tree.heightOfTree());
        System.out.println ("So, you're having back pain.");
        while (current.size() > 1)
        {
            System.out.println (current.getRootElement());
            if (scan.nextLine().equalsIgnoreCase("N")) {
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }
        System.out.println (current.getRootElement());
    }
}