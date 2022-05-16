package Challenge;

public class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
    }

    public static void main(String[] args) {
        Challenge deleteBackHalfLinkedList = new Challenge();

        Node fnode = new Node(4);
        Node snode = new Node(3);
        Node tnode = new Node(2);
        Node fonode = new Node(1);
        Node finode = new Node(5);
        Node sinode = new Node(9);
        Node svnode = new Node(6);
        Node enode = new Node(7);
        Node Nnode = new Node(8);

        deleteBackHalfLinkedList.head = fnode;
        fnode.next = snode;
        snode.next = tnode;
        tnode.next = fonode;
        fonode.next = finode;
        finode.next = sinode;
        sinode.next = svnode;
        svnode.next = enode;
        enode.next = Nnode;

        deleteBackHalfLinkedList.disChallenge();
        deleteBackHalfLinkedList.deleteKthNodeFromEnd(2);
        deleteBackHalfLinkedList.disChallenge();

    }
    
}
