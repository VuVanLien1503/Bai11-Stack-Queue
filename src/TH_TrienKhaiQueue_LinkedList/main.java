package TH_TrienKhaiQueue_LinkedList;

public class main {
    public static void main(String[] args) {
        MyLinkedListQueue queue=new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);

    }
}
