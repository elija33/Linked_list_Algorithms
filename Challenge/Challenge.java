package Challenge;

public class Challenge {
    Node head;
    
    public void disChallenge() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    //Deleting the kth node from the end of the list

    public void deleteKthNodeFromEnd(int k) {
        if (head == null || k == 0) {
            return;
        }

        // list [a, b, c, d] k=2
        Node first = head; //first node start from te head which is a
        Node second = head; //sceond node start from te head which is a

        for (int i = 0; i< k; i++) {
            second = second.next;
            if (second.next == null) {
                if (i == k -1) {
                    head = head.next;
                }
                return;
            }
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
    }
}
