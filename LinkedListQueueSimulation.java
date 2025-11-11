import java.util.LinkedList;

public class LinkedListQueueSimulation {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Vitor");
        queue.add("Pedro");
        queue.add("Carol");
        queue.add("Julia");

        System.out.println("Initial queue: " + queue);

        queue.removeFirst();
        System.out.println("The queue has changed: " + queue);

        queue.removeFirst();
        System.out.println("The queue has changed: " + queue);

        queue.add("Renan");
        System.out.println("A new person has enter the queue: " + queue);
    }
}