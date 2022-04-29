/**
 * Main.java is the hub and code to test MyIntStack.java
 *
 * @author Liam Csiffary
 * @version 1.0
 * @since 2022-04-26
 */

public class Main {
  // main function
  public static void main(String[] args) {
    // create the MyIntStack object
    MyIntStack stack = new MyIntStack();

    // counts from left input to right input
    stack.stack_push_range(40, -30);

    // for testing
    stack.view_all(); // still works even though it's a stack.

    // pops last index
    stack.pop();

    // searches for given element
    System.out.println(stack.search(9));
    System.out.println(stack.peek());

    // empties
    stack.clear();

  }
}
