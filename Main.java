import java.util.EmptyStackException;
import java.util.Scanner;

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
    Scanner scanner = new Scanner(System.in);
    boolean show = true;
    String userInputString;
    String tempInputN;
    String tempInputI;
    int tempInputNInt;
    int tempInputIInt;

    System.out.println("Type 'help' to show list of commands");
    while (true) {
      if (show == true) {
        System.out.println("What opperation would you like to perform: ");
      }

      userInputString = scanner.nextLine().toLowerCase();

      if (userInputString.equals("exit")) {
        break;

      } else if (userInputString.equals("help")) {
        System.out.println("exit: exits the program.");
        System.out.println("display/show: disables/enables the operation asking text.");
        System.out.println("push: pushes an integer to the top of the stack.");
        System.out.println("stack_push: gets 2 inputs, n integer pushed i times.");
        System.out.println("stack_push_range: gets 2 inputs, pushes all integers from n->i.");
        System.out.println("pop: removes and returns the top element of the stack.");
        System.out.println("stack_pop: removes the top element of the stack n times.");
        System.out.println("clear: empties the stack.");
        System.out.println("peek: looks at, and returns the top element of the stack.");
        System.out.println("search: searches for a given integer, returns the first");
        System.out.println("index where that element was found, searches from top->bottom.");
        System.out.println("Returns -1 if element was not found.");
        System.out.println("view_all: prints all elements in the stack.");

      } else if (userInputString.equals("display") || userInputString.equals("show")) {
        if (show == true) {
          show = false;
        } else {
          show = true;
        }

      } else if (userInputString.equals("push")) {
        System.out.println("Please input an integer to push");
        while (true) {
          tempInputN = scanner.nextLine();
          try {
            tempInputNInt = Integer.parseInt(tempInputN);
            stack.push(tempInputNInt);
            break;
          } catch (NumberFormatException e) {
            System.out.println("Please input an integer");
          }
        }

      } else if (userInputString.equals("stack_push")) {
        while (true) {
          System.out.println("Please input an integer to push and how many times to push it");
          tempInputN = scanner.nextLine();
          tempInputI = scanner.nextLine();
          try {
            tempInputNInt = Integer.parseInt(tempInputN);
            tempInputIInt = Integer.parseInt(tempInputI);
            if (tempInputIInt >= 0) {
              stack.stack_push(tempInputNInt, tempInputIInt);
              break;
            }

          } catch (NumberFormatException e) {
            continue;
          }
        }

      } else if (userInputString.equals("stack_push_range")) {
        System.out.println("Please input integers, n and i. Will push from n -> (i-1)");
        while (true) {
          tempInputN = scanner.nextLine();
          tempInputI = scanner.nextLine();
          try {
            tempInputNInt = Integer.parseInt(tempInputN);
            tempInputIInt = Integer.parseInt(tempInputI);
            stack.stack_push_range(tempInputNInt, tempInputIInt);
            break;
          } catch (NumberFormatException e) {
            System.out.println("Please input integers, n and i. Will push from n->i");
          }
        }

      } else if (userInputString.equals("pop")) {
        try {
          stack.pop();
        } catch (EmptyStackException e) {
          System.out.println("Stack was empty");
        }

      } else if (userInputString.equals("stack_pop")) {
        while (true) {
          System.out.println("Please input the number of elements to pop");
          tempInputN = scanner.nextLine();
          try {
            tempInputNInt = Integer.parseInt(tempInputN);
            if (tempInputNInt >= 0) {
              break;
            }
          } catch (NumberFormatException e) {
            continue;
          }
        }

        try {
          stack.stack_pop(tempInputNInt);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("There was not " + tempInputNInt + " elements to pop");
        }

      } else if (userInputString.equals("clear")) {
        stack.clear();

      } else if (userInputString.equals("peek")) {
        System.out.println(stack.peek());

      } else if (userInputString.equals("search")) {
        System.out.println("Please input an integer to search for");
        while (true) {
          tempInputN = scanner.nextLine();
          try {
            tempInputNInt = Integer.parseInt(tempInputN);
            System.out.println(stack.search(tempInputNInt));
            break;
          } catch (NumberFormatException e) {
            System.out.println("Please input an integer to search for");
          }
        }

      } else if (userInputString.equals("view_all")) {
        stack.view_all();

      } else {
        System.out.println(userInputString + " was not a valid input");
      }
    }
  }
}
