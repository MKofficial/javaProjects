package my_projects.data_structures;

import java.util.ArrayList;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 18.10.2020
 */
public class Node {
    int data;
    Node next;
    Node previous;

    ArrayList<Node> children;


    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<Node>();
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public int countChildren() {
        return children.size();
    }
}
