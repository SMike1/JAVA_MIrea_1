package Pract8;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    BoundedWaitList(int cap) {
        capacity = cap;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) throws ArrayIndexOutOfBoundsException {
        if (content.size() == capacity) {
            throw new ArrayIndexOutOfBoundsException("Out of bounds in class BoundedWaitList");
        }
        content.add(element);
    }

    @Override
    public String toString() {
        return content.toString();
    }
}

