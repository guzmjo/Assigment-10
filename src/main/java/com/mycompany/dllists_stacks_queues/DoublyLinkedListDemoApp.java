
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
public class DoublyLinkedListDemoApp {
   public static void main(String[] args) {
      DoublyLinkedList numList = new DoublyLinkedList();
      Node nodeA = new Node(14);
      Node nodeB = new Node(2);
      Node nodeC = new Node(20);
      Node nodeD = new Node(31);
      Node nodeE = new Node(16);
      Node nodeF = new Node(55);

      numList.append(nodeA);   // Add 14
      numList.append(nodeB);   // Add 2, make the tail
      numList.append(nodeC);   // Add 20, make the tail

      numList.prepend(nodeD);  // Add 31, make the head

      numList.insertAfter(nodeB, nodeE);  // Insert 16 after 2
      numList.insertAfter(nodeC, nodeF);  // Insert 55 after tail, 55 becomes new tail

      // Output list
      System.out.print("List after adding nodes: ");
      numList.printList();

      // Remove the tail node, then the head node
      numList.remove(nodeF);
      numList.remove(nodeD);

      // Output final list
      System.out.print("List after removing nodes: ");
      numList.printList();
      
      System.out.println("The size of the list is " + numList.size());
      
      System.out.println("The list in reverse order is: ");
      numList.printRevList();
      
      int[] array = numList.toArray();
      
      System.out.print("Linked List as an array: [ ");
      for(int i = 0; i < numList.size(); ++i) {
          System.out.print(array[i] + ", ");
      }
      System.out.println("]");
      
      
      System.out.println("Index of Node C: " + numList.indexOf(nodeC));
      
      System.out.println("Sum of the last 2 elements: "+numList.sumOfLastElements(2));
   }
}
