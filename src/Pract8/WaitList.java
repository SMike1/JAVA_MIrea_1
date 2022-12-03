package Pract8;

import java.util.Collection;

import java.util.concurrent.ConcurrentLinkedQueue;

class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }

    WaitList(Collection<E> c){
        content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public String toString() {
        return content.toString();
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> collection) {
        return content.containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();


    }
}
