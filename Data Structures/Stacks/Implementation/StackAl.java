import java.util.ArrayList;

public class StackAl {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack Empty!!!");
                return Integer.MIN_VALUE;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack Empty!!!");
                return Integer.MIN_VALUE;
            }
            return list.get(list.size() - 1);
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
