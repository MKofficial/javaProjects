package my_projects.data_structures;

import javax.management.NotificationEmitter;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 19.10.2020
 */
public class Tree {

    public static void breadthFirstSearch(Node start) {
        Queue queue = new Queue();
        queue.enqueue(start);
        while (queue.getLength() > 0) {
            Node current = queue.dequeue();
            System.out.println("Visiting element " + current.data);
            for (Node child : current.children) {
                queue.enqueue(child);
            }
            System.out.println("Visiting of element " + current.data + " has finished");
        }
    }

    public static void depthFirstSearch(Node current, Stack stack) {
        if (stack.isEmpty()) {
            stack.push(new Node(0));
        }
        System.out.println("Visiting " + current.data);
        stack.push(current);

        for (Node child : current.children) {
            depthFirstSearch(child, stack);
        }
        stack.popNode();
        System.out.println("Visiting of element " + current.data + " has finished");

    }

    public static void main(String[] args) {
        Node start = new Node(1);
        Node son1 = new Node(11);
        Node son2 = new Node(12);
        Node son3 = new Node(13);
        Node son11 = new Node(111);
        Node son12 = new Node(112);
        Node son21 = new Node(121);
        start.addChild(son1);
        start.addChild(son2);
        start.addChild(son3);
        son1.addChild(son11);
        son2.addChild(son21);
        son1.addChild(son12);
        depthFirstSearch(start, new Stack());
    }
}
