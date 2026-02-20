public class StackTest {
    public static void main(String[] args) {
        System.out.println("Testing Number Stack:");
        Stack<Integer> numberStack = new Stack<>(3);
        try {
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Stack content: " + numberStack.list()); // 10;20;30
            System.out.println("Peek: " + numberStack.peek()); // 30
            System.out.println("Pop: " + numberStack.pop());   // 30
            System.out.println("After pop: " + numberStack.list()); // 10;20
            numberStack.push(40);
            numberStack.push(50);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n---------------------------\n");

        System.out.println("Testing Text Stack:");
        Stack<String> textStack = new Stack<>(5);
        try {
            textStack.push("Hello");
            textStack.push("World");
            textStack.push("Java");
            System.out.println("Stack content: " + textStack.list());

            textStack.pop();
            textStack.pop();
            textStack.pop();
            textStack.pop();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}