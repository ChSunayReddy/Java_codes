public class Linear_queue {
    int capacity = 5;
    int[] queue = new int[capacity];
    int front = 0, rear = -1;  // Initialize pointers

    // Enqueue Operation
    public void enqueue(int x) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = x;  // Increment rear and insert element
    }

    // Dequeue Operation
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;  // Return -1 if queue is empty
        }
        int element = queue[front++];
        return element;  // Return the front element and increment front
    }

    // Peek Operation (view the front element)
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;  // Return -1 if queue is empty
        }
        return queue[front];
    }

    // Check if Queue is Empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Check if Queue is Full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Main Method for Testing
    public static void main(String[] args) {
        Linear_queue q = new Linear_queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Dequeued: " + q.dequeue());  // Output: 10
        System.out.println("Front Element: " + q.peek()); // Output: 20
        q.enqueue(50);
        System.out.println("Dequeued: " + q.dequeue());  // Output: 20
    }
}

