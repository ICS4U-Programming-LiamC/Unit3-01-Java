import java.util.ArrayList;
import java.util.List;

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
  List<Integer> stack;

  // constructor?
  public MyIntStack() {
    this.stack = new ArrayList<Integer>();
  }

  // and 1 method

  public void push(int input) {
    stack.add(input);
  }

  public void stack_push(int i, int n) {
    for (int j = 0; j < i; j++) {
      stack.add(n);
    }
  }

  public void stack_push_range(int i, int n) {
    if ((n - i) > 0) {
      for (int j = 0; j < (n - i); j++) {
        stack.add(i + j);
      }
    } else {
      for (int j = 0; j < (i - n); j++) {
        stack.add(i - j);
      }
    }
  }

  public void pop() {
    try {
      stack.remove(stack.size() - 1);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Stack is empty");
    }
  }

  public void stack_pop(int i) {
    for (int j = 0; j < i; j++) {
      try {
        stack.remove(stack.size() - 1);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("stack is empty, ran " + j + " extra times");
        break;
      }
    }
  }

  public void stack_empty() {
    int length = stack.size();
    for (int i = 1; i <= length; i++) {
      stack.remove(stack.size() - 1);
    }
  }

  public void peek() {
    try {
      System.out.println(stack.get(stack.size() - 1));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Stack is empty!");
    }
  }

  public void stack_search(int element) {
    boolean found = false;
    for (int i = 0; i < stack.size(); i++) {
      if (stack.get(i) == element) {
        System.out.println(stack.get(i) + " appears at " + i);
        found = true;
      }
    }
    if (!found) {
      System.out.println(element + " did not appear");
    }
  }

  public void stack_view_all() {
    for (int i = 0; i < stack.size(); i++) {
      System.out.println(stack.get(i));
    }
  }

}
