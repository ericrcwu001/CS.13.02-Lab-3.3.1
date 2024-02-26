import java.util.LinkedList;

public class CISQueue<T> {

    // Linked list property.
    private LinkedList<T> ll;

    // Size property.
    private int size;

    // Constructor.
    public CISQueue() {
        ll = new LinkedList<>();
        size = 0;
    }

    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(T val) {
        ll.addLast(val);
        size++;
    }

    // Dequeue. This method removes a node from the beginning of the linked list.
    public T dequeue() {
        if (size == 0) return null;
        T tmp = ll.removeFirst();
        size--;
        return tmp;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // size. Returns the size of the queue.
    public int size() {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}
    public String toString() {
        StringBuilder s = new StringBuilder("CISQueue{queue=[");
        for (int i = 0; i < ll.size(); ++i) {
            s.append(ll.get(i).toString());
            if (i < ll.size() - 1) s.append(", ");
        }
        s.append("], size=");
        s.append(size);
        s.append("}");
        return s.toString();
    }

}
