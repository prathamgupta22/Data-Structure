// LINKLIST IS A DATA STRUCTURE IN WHICH DATA IS NOT STORED IN CONTINGOUSE LOCATION AND NO FIXED SIZE WE CAN CHANGE DYNAMICALLY
// A linked list is a data structure containing two crucial pieces of
// information, the first being the data and the other being the pointer to the 
// next element. The ‘head’ is the first node, and the ‘tail’ is the last node in a linked list.

// in stack and queue ll is used and real lin browser
// in browser search -> site1 -> site we can use backsapce to back and move forward as much as want 

class Node {
  int data;
  Node next; // the reference to the next Node in the LL

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}

class basics {

  private static Node convertArrToLL(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;

    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  // Traverse LinkedList
  private static void traverseLL(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  // Get length of LinkedList
  private static int getLength(Node head) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  // Search for a value in LinkedList
  private static boolean searchLL(Node head, int val) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == val)
        return true;
      temp = temp.next;
    }
    return false;
  }

  // remove head
  private static Node removeHead(Node head) {
    head = head.next;
    return head;
    // in cpp we need to free up space as well by assign it to temp = head then
    // delete temp but java has garabage collector which automatically delete it
  }

  // remove tail
  private static Node removeTail(Node head) {
    if (head == null || head.next == null)
      return null;

    Node temp = head;

    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;

    return head;
  }

  // remove kth element
  private static Node removekth(Node head, int k) {
    if (head == null) {
      return head;
    }
    if (k == 1) {
      return head.next;
    }
    Node temp = head;
    int count = 1;
    while (temp != null && count < k - 1) {
      temp = temp.next;
      count++;
    }
    if (temp == null || temp.next == null) {
      return head;
    }
    temp.next = temp.next.next;
    return head;
  }

  // remove value
  private static Node removeByValue(Node head, int value) {
    if (head == null)
      return null;

    // If the head node contains the value
    if (head.data == value) {
      return head.next;
    }

    Node prev = null;
    Node curr = head;

    while (curr != null && curr.data != value) {
      prev = curr;
      curr = curr.next;
    }

    // If value not found
    if (curr == null)
      return head;

    // Remove the node
    prev.next = curr.next;

    return head;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    // Node x = new Node(arr[0]);
    // System.out.println(x.data);
    // Node y = new Node(arr[1]);
    // x.next = y;
    // System.out.println(x);

    Node head = convertArrToLL(arr);

    System.out.print("LinkedList: ");
    traverseLL(head);

    int length = getLength(head);
    System.out.println("Length: " + length);

    int valueToSearch = 2;
    boolean found = searchLL(head, valueToSearch);
    System.out.println("Search for " + valueToSearch + ": " + (found ? "Found" : "Not Found"));

    // head = removeHead(head);
    // System.out.println(head.data);

    // head = removeTail(head);
    // traverseLL(head);

    // head = removekth(head, 3);
    // traverseLL(head);

    // head = removeByValue(head, 3);
    // traverseLL(head);
  }
}
