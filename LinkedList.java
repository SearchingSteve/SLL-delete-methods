public class LinkedList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Add a node at head
    public void addNode(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // Delete the first node
    public void deleteHead() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    // Delete the last node
    public void deleteTail() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("Node deleted at the end of the list.");
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        System.out.println("Node deleted at the end of the list.");

    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (index == 0) {
            deleteHead();
            return;
        }

        Node curr = head;
        int i = 0;
        while (curr != null && i < index - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null || curr.next == null) {
            System.out.println("Index out of bounds. Nothing to delete.");
            return;
        }

        curr.next = curr.next.next;
        System.out.println("Node deleted at index " + index);
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("\nInitial list:");
        list.printList();

        list.deleteHead();
        System.out.println("\nAfter deleting node at the beginning:");
        list.printList();
        System.out.println();

        list.deleteTail();
        System.out.println("After deleting node at the end:");
        list.printList();
        System.out.println();

        list.deleteAtIndex(1);
        System.out.println("After deleting at index 1:");
        list.printList();
        System.out.println();
    }
}