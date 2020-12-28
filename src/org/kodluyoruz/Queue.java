package org.kodluyoruz;

import java.awt.*;

public class Queue<T> {
    private Node first;
    private Node last;

    /**
     * Adds item to end of the list
     * @param value
     */
    void add(T value){
        if(this.last == null){
            this.last = new Node(value);//Case that is list empty
        }
        else {
            this.last.setNext(new Node(value));
            this.last = this.last.getNext();
        }
        if (this.first == null) this.first = this.last; //Case that is list empty
        System.out.println(this.first);
        System.out.println(this.last);
    }

    /**
     * Returns value that is head of the list
     * @return
     */
    T peek(){
        return (T) this.first.getValue();
    }

    /**
     *  Returns and removes value that is head of the list
     * @return
     */
    T poll(){
        if(this.first == null){
            return null;
        }else {
            Node tmp = this.first;//Temporary value
            this.first = this.first.getNext();
            return (T) tmp.getValue();
        }
    }
}
