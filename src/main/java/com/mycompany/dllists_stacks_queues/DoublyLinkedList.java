
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;

   private int size;
    
   public DoublyLinkedList() {
      head = null;
      tail = null;
      size = 0;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      
      else {      
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }

      ++size;
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
      
      ++size;
   }
   
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
      
      ++size;
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
      
      if (head != null)
         --size;
   }
   
   public int size() {
       return size;
   }
   
   public void printRevList() {
      Node node = tail;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.previous;
      }
      System.out.println();
   }
   
   /**Turns the linked list into an array
    * 
    * @return array with the data from the linked list
    */
   public int[] toArray() {
       int[] arr = new int[size];
       Node node = head;
       
       for (int i = 0; i < size;i++) {
           arr[i] = node.data;
           node = node.next;
       }
       
       return arr;
   }
   
   /**Returns the index of a node
    * 
    * @param node 
    * @return index of param node
    */
   public int indexOf(Node node) {
      Node tempNode = head;
      int indx = 0;
      
      while (tempNode.data != node.data) {
         ++indx;
         tempNode = tempNode.next;
      }
      
      return indx;
   }
   
   /**Calculates the sum of the last elements 
    * of the list
    * 
    * @param m number of elements from the end
    * @return the sum of m elements
    */
   public int sumOfLastElements(int m) {
      Node node = tail;
      int sum = 0;
      while (m != 0) {
         sum += node.data;
         node = node.previous;
         --m;
      }
      
      return sum;
   }
   

}
