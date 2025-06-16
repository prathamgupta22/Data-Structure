# Data Structures Notes

## Stack

A **Stack** is a linear data structure that follows the **Last In First Out (LIFO)** principle.  
This means the last element added to the stack will be the first one to be removed.

### Key Operations:

- `push(item)` – Adds an item to the top of the stack.
- `pop()` – Removes the item from the top of the stack.
- `peek()` or `top()` – Returns the item at the top without removing it.
- `isEmpty()` – Checks if the stack is empty.

### Applications:

- Undo functionality in editors
- Backtracking algorithms (e.g., maze solving, recursion)
- Expression evaluation (e.g., postfix, prefix)

---

## Queue

A **Queue** is a linear data structure that follows the **First In First Out (FIFO)** principle.  
This means the first element added to the queue will be the first one to be removed.

### Key Operations:

- `enqueue(item)` – Adds an item to the end of the queue.
- `dequeue()` – Removes the item from the front of the queue.
- `front()` – Returns the item at the front without removing it.
- `isEmpty()` – Checks if the queue is empty.

### Applications:

- CPU scheduling
- Breadth-first search (BFS) in graphs
- Handling requests in web servers or printers
