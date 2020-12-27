package org.kodluyoruz;

import java.awt.*;

//FIRST IN FIRST OUT
public class Queue<T> {
    Queue next;
    T value;
    static Queue first;
    static Queue last;

    void add(T value){
        last.next = new Queue(value);
        last = last.next;
        if (first == null) first = last;
    }
    T peek(){
        return (T) last.first;
    }

    T poll(){
        if(first == null){
            throw new NullPointerException("Queue empty");
        }else {
            Queue tmp = first;
            first = first.next;
            return (T) tmp.value;
        }
    }


    public Queue(T value){
        this.next =null;
        this.value =value;
    }
    public Queue(){
        first = null;
        last = this;
    }


}
