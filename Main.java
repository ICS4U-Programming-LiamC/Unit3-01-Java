/**
 * Main.java is the hub and code to test MyIntStack.java
 *
 * @author Liam Csiffary
 * @version 1.0
 * @since 2022-04-26
 */

public class Main {
  public static void main(String[] args) {
    MyIntStack stack = new MyIntStack();

    stack.stack_push_range(10, -30);

    // for testing
    stack.stack_view_all();

    stack.pop();

    stack.stack_search(9);

    stack.stack_empty();
    stack.peek();

  }
}
