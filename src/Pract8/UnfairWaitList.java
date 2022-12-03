package Pract8;

public class UnfairWaitList<E> extends WaitList<E> {
    UnfairWaitList() {}

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.add(element);
    }

    public void kick() {
        content.add(content.remove());
    }
}
