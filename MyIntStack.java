import java.util.EmptyStackException;
import java.util.Stack;

/**
 * MyStackInt is a stack implementation using list.
 * has various push, pop, and peek functions for use in main
 *
 * @author Liam Csiffary
 * @version 1.0
 * @since 2022-04-26
 */

public class MyIntStack {

  // fields
  private Stack<Integer> stack;

  // constructor
  public MyIntStack() {
    this.stack = new Stack<Integer>();
  }

  // methods

  public void push(int input) {
    stack.push(input);
  }

  // pushes n, i times
  public void stack_push(int n, int i) {
    for (int j = 0; j < i; j++) {
      stack.push(n);
    }
  }

  // pushes numbers from n -> i
  public void stack_push_range(int n, int i) {
    if ((i - n) > 0) {
      for (int j = 0; j < (i - n); j++) {
        stack.push(n + j);
      }
    } else {
      for (int j = 0; j < (n - i); j++) {
        stack.push(n - j);
      }
    }
  }

  // pops the top
  public int pop() {
    return stack.pop();
  }

  // pop the top i times
  public int stack_pop(int i) {
    for (int j = 0; j < i; j++) {
      try {
        stack.pop();
      } catch (EmptyStackException e) {
        return (i - j);
      }
    }
    return 0;
  }

  // empties the stack
  public void clear() {
    stack.clear();
  }

  // peeks the top of the stack
  public int peek() {
    return stack.peek();
  }

  // searches for a certain
  public int search(int element) {
    return stack.search(element) - 1;
  }

  // prints all elements of the stack
  public void view_all() {
    for (int i = 0; i < stack.size(); i++) {
      System.out.println(stack.get(i));
    }
  }

}
