package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue root = new Queue();
        root.add(new String("first"));
        root.add(new String("second"));
        root.add(new String("third"));
        root.add(new String("fourth"));
        try {
            System.out.println("Poll"+root.peek());
            System.out.println("Poll"+root.peek());
            System.out.println("Poll"+root.peek());
            System.out.println("Poll"+root.peek());
            System.out.println("Poll"+root.peek());
            System.out.println("Poll"+root.peek());
        } catch (NullPointerException exception) {
            System.out.println("E: "+exception.getMessage());
        }
        try {
            System.out.println("Poll"+root.poll());
            System.out.println("Poll"+root.poll());
            System.out.println("Poll"+root.poll());
            System.out.println("Poll"+root.poll());
            System.out.println("Poll"+root.poll());
            System.out.println("Poll"+root.poll());
            System.out.println("Poll"+root.poll());
        } catch (NullPointerException exception) {
            System.out.println("E: "+exception.getMessage());
        }
    }
}
