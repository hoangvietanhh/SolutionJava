public class Solution {
    Queue queue = new Queue();
    public void enQueue(int data){
        Node temp = new Node(data);
        if (queue.front == null){
            queue.front = temp;
            queue.rear =temp;
            queue.rear.next = queue.front;

        } else {
            queue.rear.next = temp;
            queue.rear = temp;
            queue.rear.next = queue.front;
        }
    }

    public void deQueue(){
        if (queue.front == null){
            throw new NullPointerException();
        } else if (queue.front == queue.rear){
            queue.rear=null;
            queue.front=null;
        } else {
            Node temp = queue.front;
            queue.front = queue.front.next;
            queue.rear.next= queue.front;
        }
    }

    public void displayQueue(){
        Node  temp = queue.front;
        System.out.printf("Elements in Circular Queue are: ");
        while (temp.next != queue.front)
        {
            System.out.printf("%d ", temp .data);
            temp = temp.next;
        }
        System.out.printf("%d", temp .data);
    }
}

