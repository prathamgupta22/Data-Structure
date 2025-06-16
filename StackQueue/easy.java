// A2Z EASY

public class easy {
  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println("Top element: " + stack.top());
    System.out.println("Stack size: " + stack.size());
    System.out.println("Popped: " + stack.pop());
    System.out.println("Stack size after pop: " + stack.size());

    Queue queue = new Queue();
    queue.add(100);
    queue.add(200);
    queue.add(300);
    System.out.println("Front element: " + queue.top()); // 100
    System.out.println("Queue size: " + queue.size()); // 3
    System.out.println("Dequeued: " + queue.pop()); // 100
    System.out.println("Queue size after dequeue: " + queue.size()); // 2
  }
}

// Stack implemented using an array
class Stack {
  int MAX_SIZE = 10000;
  int[] arr = new int[MAX_SIZE];
  int top = -1;

  // time complexity O(1)
  public void push(int x) {
    if (top >= MAX_SIZE - 1) {
      System.out.println("Stack Overflow: cannot push " + x);
      return;
    }
    arr[++top] = x;
  }

  // time complexity O(1)
  public int pop() {
    if (top < 0) {
      System.out.println("Stack Underflow: cannot pop");
      return -1;
    }
    return arr[top--];
  }

  // time complexity O(1)
  public int size() {
    return top + 1;
  }

  // time complexity O(1)
  public int top() {
    if (top < 0) {
      System.out.println("Stack is empty");
      return -1; // or throw exception
    }
    return arr[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }
  // Why All O(1)?
  // Because : we are using
  // a pre-allocated array (fixed size),
  // No loops or shifting of elements,
  // Space Complexity = O(n)
  // Here, n is the maximum number of elements your stack can hold.
  // You are allocating an array of size n → this is linear space.
  // Even if the stack has only a few elements, the full array is reserved, so:
  // Space Complexity = O(n)
}

class Queue {
  int MAX_SIZE = 10000;
  int arr[] = new int[MAX_SIZE];
  int start = 0;
  int end = 0;
  int currsize = 0;

  // O(1)
  public void add(int x) {
    if (currsize >= MAX_SIZE) {
      System.out.println("queue is full");
    }
    if (end == -1) {
      start = 0;
      end = 0;
    } else {
      end = (end + 1) % MAX_SIZE;
    }
    arr[end] = x;
    currsize++;
  }

  // O(1)
  public int pop() {
    if (start == -1) {
      System.out.println("Queue Empty");
    }
    int popped = arr[start];
    if (currsize == 1) {
      start = -1;
      end = -1;
    } else
      start = (start + 1) % MAX_SIZE;
    currsize--;
    return popped;
  }

  // O(1)
  public int size() {
    return currsize;
  }

  // O(1)
  public int top() {
    if(start == -1) {
      System.out.println("Queue is Empty");
    }
    return arr[start]
  }

  // O(1)
  public boolean isEmpty() {
    return currsize == 0;
  }
  // Space Complexity = O(n)
}