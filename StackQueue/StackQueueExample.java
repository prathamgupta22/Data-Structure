import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class StackQueueExample {
  public static void main(String[] args) {
    // ----- Stack Example -----
    Stack<Integer> stack = new Stack<>();

    // Push elements
    stack.push(10);
    stack.push(20);
    stack.push(30);

    // Peek top element
    System.out.println("Top element of stack: " + stack.peek()); // 30

    // Pop elements
    System.out.println("Popped from stack: " + stack.pop()); // 30
    System.out.println("Popped from stack: " + stack.pop()); // 20

    // Check if stack is empty
    System.out.println("Is stack empty? " + stack.isEmpty()); // false

    System.out.println(); // Line break for clarity

    // ----- Queue Example -----
    Queue<Integer> queue = new LinkedList<>();

    // Enqueue elements
    queue.add(10);
    queue.add(20);
    queue.add(30);

    // Peek front element
    System.out.println("Front element of queue: " + queue.peek()); // 10

    // Dequeue elements
    System.out.println("Dequeued from queue: " + queue.poll()); // 10
    System.out.println("Dequeued from queue: " + queue.poll()); // 20

    // Check if queue is empty
    System.out.println("Is queue empty? " + queue.isEmpty()); // false
  }
}
