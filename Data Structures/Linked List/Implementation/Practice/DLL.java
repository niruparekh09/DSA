import java.util.ArrayList;
import java.util.Collections;

public class DLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    public static int size;
    public static Node head;
    public static Node tail;

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public static int removeFirst() {
        if (isEmpty()) {
            System.out.println("Empty LL");
            return -1;
        }

        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public static int removeLast() {
        if (isEmpty()) {
            System.out.println("Empty LL");
            return -1;
        }

        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "<-->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public static void sortList() {
        Node currentNode = head;
        while (currentNode != null) {
            Node min = currentNode;
            Node innerCurrentNode = currentNode.next;
            while (innerCurrentNode != null) {
                //Finding the smallest Node in the whole Linked List
                //so that we can swap it with the current node and
                //The that part of linked list is get sorted
                if (innerCurrentNode.data < min.data) {
                    min = innerCurrentNode;
                }
                innerCurrentNode = innerCurrentNode.next;
            }
            //Swap the min most element to the current node
            int temp = currentNode.data;
            currentNode.data = min.data;
            min.data = temp;

            currentNode = currentNode.next;
        }
    }

    public static void sortList2() {
        Node current = head;
        while (current != null) {
            Node min = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (innerCurrent.data < min.data) {
                    min = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }
            int temp = current.data;
            current.data = min.data;
            min.data = temp;

            current = current.next;
        }
    }

    public static void sort(DLL dll) {
        ArrayList<Integer> al = new ArrayList<>();
        while (size != 0) {
            al.add(dll.removeLast());
        }
        Collections.sort(al);
        int size = al.size();
        for (int i = 0; i < size; i++) {
            dll.addLast(al.remove(0));
        }
    }

    public static void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(5);
        dll.addLast(4);
        dll.addLast(2);
        dll.addLast(1);
        dll.addLast(3);
        dll.sort(dll);
        dll.printList();

    }
}
