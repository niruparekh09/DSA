public class StackLl {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack Empty!!!");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack Empty!!!");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack list = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
        System.out.println(Stack.pop());
    }
}
