package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue root = new Queue();
        root.add(new String("first"));
        System.out.println("Peek: "+root.peek());
        root.add(new String("second"));
        System.out.println("Peek: "+root.peek());
        root.add(new String("third"));
        System.out.println("Peek: "+root.peek());
        root.add(new String("fourth"));
        System.out.println("Peek: "+root.peek());


    }
}
