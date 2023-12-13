public class LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInMiddle(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index < size) {
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Index is out of Bounds");
        }
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Empty List, Can't Remove");
            return -1;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Empty List, Can't Remove");
            return -1;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        tail = secondLastNode;
        tail.next = null;
        size--;
        return val;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void reverseList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
