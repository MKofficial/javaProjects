package my_projects.data_structures;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 18.10.2020
 */
public class LinkedList {
    Node last, first;

    /**
     * Method pushing one node to the front
     * @param node Object of class Node
     */
    public void pushOnStart(Node node) {
        node.previous = null; // node.previous will always point to null
        node.next = first; // node.next will point to the previous first node else it will point to null
        first = node; // whenever we push a node to front, static attr first will be changed to node

        /* if last is null (or first is null) then there is no object in LinkedList so the static attr last will
           point to node */
        if (last == null) {
            last = node;
        }
        /* if a LinkedList contains at least one element, the attr previous of node which was first has to point to
           the new node */
        else {
            node.next.previous = node;
        }
    }

    /**
     * Method pushing one node to the end of LinkedList
     * @param node Object of class Node
     */
    public void pushOnEnd(Node node) {
        // if last is null (or first is null) then there is no object in LinkedList so the attr first will point to node
        if (last == null) {
            first = node;
        }
        // else there is some node before if so that node has to point to the new node
        else {
            last.next = node;
        }
        node.previous = last; //node.previous will point to the previous node else it will point default to null
        node.next = null; //node.next will always point to null
        last = node; //whenever a node is push to the end of LinkedList, attr last has to point to that node
    }

    /**
     * Method inserting one node after another node
     * @param nodeBefore Node which will be after calling this method before the inserted node
     * @param nodeToInsert Node which will be inserted
     */
    public void insertAfter(Node nodeBefore, Node nodeToInsert) {
        nodeToInsert.previous = nodeBefore; //nodeToInsert.previous will point to nodeBefore
        nodeToInsert.next = nodeBefore.next; // nodeBefore.next is pointing on a node which will stay after the new one
        nodeBefore.next = nodeToInsert; //nodeBefore.next will now point to nodeToInsert


        // if a nodeBefore is the last node in LinkedList then on a nodeToInsert has be set attr last
        if (nodeBefore == last) {
            last = nodeToInsert;
        }
        /* if nodeToInsert is not the last one in LinkedList then on the node next to it has to be set attr previous
           pointing at nodeToInsert */
        else {
            nodeToInsert.next.previous = nodeToInsert;
        }
    }

    public int countNodes() {
        int result = 0;
        for (Node node = first; node != null; node = node.next) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Node one = new Node(1);
        Node two = new Node(2);
        queue.enqueue(one);
        queue.enqueue(two);
        System.out.println(queue.getLength());
    }
}

