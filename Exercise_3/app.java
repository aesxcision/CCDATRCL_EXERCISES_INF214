import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack<String> SMARTPHONE_stack = new Stack<>();

        // arranging SMARTPHONE in a stack
        SMARTPHONE_stack.push("iPhone");
        SMARTPHONE_stack.push("Samsung");
        SMARTPHONE_stack.push("Xioami");
        SMARTPHONE_stack.push("Vivo");

        // Show the size of the stack
        System.out.println("The size of the stack is: " + SMARTPHONE_stack.size());

        // Show top element in the stack
        System.out.println("The top of the stack is: " + SMARTPHONE_stack.peek());

        // Remove top element in the stack
        SMARTPHONE_stack.pop();

        // Show all elements in Stack
        System.out.println("smartphone in Stack: " + SMARTPHONE_stack);

        // Show top element in the stack
        System.out.println("The top of the stack is: " + SMARTPHONE_stack.peek());

    }
}
