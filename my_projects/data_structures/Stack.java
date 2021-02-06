package my_projects.data_structures;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 19.10.2020
 */
public class Stack {
    Node top;
    int index;

    public Node popNode() {
        if (top != null) {
            Node result = top;
            top = top.next;
            return result;
        }
        return null;
    }

    public int popInt() {
        return index;
    }

    public void push(Node node) {
        node.next = top;
        top = node;
    }

    public void push(Node node, int indexOfNextNode) {
        node.next = top;
        top = node;
        index = indexOfNextNode;
    }

    public Node peek() {
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        int result = 0;
        for (Node node = top; node != null; node = node.next) {
            result++;
        }
        return result;
    }
}
