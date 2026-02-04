public class TestGenericStack {

    public static void main(String[] args) {

        // ================================
        // Test with String stack
        // ================================
        System.out.println("=== Testing GenericStack<String> ===");
        GenericStack<String> stringStack = new GenericStack<>();

        // Push elements
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");

        // Peek
        System.out.println("Peek: " + stringStack.peek());

        // Size and empty check
        System.out.println("Size: " + stringStack.getSize());
        System.out.println("Is Empty: " + stringStack.isEmpty());

        // Pop elements
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());

        // Stack should now be empty
        System.out.println("Is Empty after pops: " + stringStack.isEmpty());

        // Edge case: pop from empty stack
        try {
            stringStack.pop();
        } catch (Exception e) {
            System.out.println("Exception caught when popping from empty String stack");
        }

        // ================================
        // Test with Integer stack
        // ================================
        System.out.println("\n=== Testing GenericStack<Integer> ===");
        GenericStack<Integer> intStack = new GenericStack<>();

        // Push elements
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        // Peek
        System.out.println("Peek: " + intStack.peek());

        // Size and empty check
        System.out.println("Size: " + intStack.getSize());
        System.out.println("Is Empty: " + intStack.isEmpty());

        // Pop elements
        while (!intStack.isEmpty()) {
            System.out.println("Pop: " + intStack.pop());
        }

        // Edge case: pop from empty stack
        try {
            intStack.pop();
        } catch (Exception e) {
            System.out.println("Exception caught when popping from empty Integer stack");
        }
    }
}
