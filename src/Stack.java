/**
 * A generic Stack implementation using an Object array.
 * @param <T> the type of elements in this stack
 */
public class Stack<T> {
    private Object[] elements;
    private int top;

    /**
     * Default constructor creating a stack with a fixed size of 10.
     */
    public Stack() {
        this.elements = new Object[10];
        this.top = -1;
    }

    /**
     * Constructor with a specific size.
     * @param size the maximum capacity of the stack
     */
    public Stack(int size) {
        this.elements = new Object[size];
        this.top = -1;
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param value the element to add
     * @throws StackFullException if the array is already full
     */
    public void push(T value) throws StackFullException {
        if (top >= elements.length - 1) {
            throw new StackFullException("Stack is full! Cannot push element.");
        }
        elements[++top] = value;
    }

    /**
     * Removes and returns the top element.
     * @return the removed element
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty! Cannot pop element.");
        }
        T value = (T) elements[top];
        elements[top--] = null; // Clean up reference
        return value;
    }

    /**
     * Returns the top element without removing it.
     * @return the top element
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty! Cannot peek.");
        }
        return (T) elements[top];
    }

    /**
     * Concatenates all elements into a string separated by a semicolon.
     * @return a semicolon separated string of all elements
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private boolean isEmpty() {
        return top == -1;
    }
}