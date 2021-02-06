package my_projects.data_structures;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 19.10.2020
 */
public class Queue {
    Node head, tail;

    public Node dequeue() {
        if (head != null) {
            Node result = head;
            head = head.next;
            return result;
        }
        return null;
    }

    public void enqueue(Node node) {

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node peek() {
        return head;
    }

    public int getLength() {
        int result = 0;
        for (Node node = tail; node != null; node = node.previous) {
            result++;
        }
        return result;
    }
}
