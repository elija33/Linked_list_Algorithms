# Linked_list_Algorithms
# Linked list data structure is another useful tool when working with linear data.
# Elements in a linked list are linked by poiters
# Each element is called a node, which contains a piece of data and a reference to the next element
# The first node is called the head
# The last node is called the tail.


# Challenge: Create an algotithm that deletes the kth node from the end of the list
# Given a list 5->7->11->2->18->4->null.  k = 1
# The first node from the end of the list is 18
# The Input is 5->7->11->2->18->4->null
# The Output is 5->7->11->2->18->null
# Given a list 5->7->11->2->18->4->null.  k = 4
# In the case k = 4 in the given linkedList the fourth element is 11
# The fourth node from the end of the list is 5->7->2->18->4->null.


                Question and Answers 
How is each node connected in a linked list?
 ANS: With a next pointer.

How could I make a new Node the head of a linked list, given a linked list called listy and a node called node?
    Ans: listy.addFirst(node)

What two classes might you want to create to represent your own Linked List in code?
    Ans: LinkedList and Node

If you change the value of the next pointer of a given node to null, what happens to the node?
    Ans: The node becomes the last node in the linked list.