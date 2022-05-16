package DeletingLinkedList;

public class Node {
     int data;
     Node next;

     public Node(int t){
        data = t;
     }

     public static void main(String[] args) {
         Delete DeleteLinkedList = new Delete();

         Node fnode = new Node(4);
         Node snode = new Node(7);
         Node tnode = new Node(9);
         Node fonode = new Node(10);

         DeleteLinkedList.head = fnode;
         fnode.next = snode;
         snode.next = tnode;
         tnode.next = fonode;

         DeleteLinkedList.displayContents();
         DeleteLinkedList.deleteBackHalf();
         DeleteLinkedList.displayContents();
     }
}