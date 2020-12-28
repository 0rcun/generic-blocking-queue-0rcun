package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue root = new Queue();
        root.add(new String("first"));
        root.add(new String("second"));
        root.add(new String("third"));
        root.add(new String("fourth"));

        int counter = 5;
        try {
            for (int i = 0; i < counter; i++) {
                System.out.println("Peek"+" "+i+" : "+root.peek());
                System.out.println("Poll: "+root.poll());
                System.out.println("Peek: "+root.peek());
            }

        } catch (NullPointerException exception) {
            System.out.println("E: "+exception.getMessage());
        }
    }
}
