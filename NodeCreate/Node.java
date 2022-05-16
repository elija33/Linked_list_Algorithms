package NodeCreate;

public class Node {
    Node next;
    int data;

    public Node(int d) {
        data = d;
    }

    public static void main(String[] args) {
        CustomLinkedList LinkedList = new CustomLinkedList();
        
        Node firstNode = new Node(4);
        Node secondNode = new Node(5);
        Node thirNode = new Node(7);
        Node fourthNode = new Node(6);
        Node fivethNode = new Node(3);

        LinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirNode;
        thirNode.next = fourthNode;
        fourthNode.next = fivethNode;

        LinkedList.displayContents();
    }
    
}
