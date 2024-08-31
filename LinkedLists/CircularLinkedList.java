package circularlinkedlist;
public class CircularLinkedList {
 class Node {
 int value;
 Node next;
 Node(int value) {
 this.value = value;
 next = null;
 }
 }
 private Node head = null;
 private Node tail = null;
 public void addAtEnd(int value) {
 Node newNode = new Node(value);
 if (head == null) {
 head = newNode;
 } else {
 tail.next = newNode;
 }
 tail = newNode;
 tail.next = head;
 }
 public void addFromBegining(int value) {
 Node newNode = new Node(value);
 if (head == null) {
 head = newNode;
 } else {
 newNode.next = head;
 head = newNode;
 }
 tail.next = head;
 }
 public void printList() {
 Node currentNode = head;
 if (head != null) {
 do {
 System.out.print(currentNode.value + " ");
 currentNode = currentNode.next;
 } while (currentNode != head);
 }
 }
 public void showheadntail() {
 System.out.println("\nhead --> " + head.value);
 System.out.println("tail --> " + tail.value);
 System.out.println(tail.next.value);
 }
 public static void main(String[] args) {
 CircularLinkedList cll = new CircularLinkedList();
 cll.addAtEnd(13);
 cll.addAtEnd(7);
 cll.addAtEnd(24);
 cll.addAtEnd(1);
 cll.addAtEnd(8);
 cll.addAtEnd(37);
 cll.addAtEnd(46);
 cll.printList();
 cll.showheadntail();
 System.out.println("");
 cll.addFromBegining(33);
 cll.addFromBegining(44);
 cll.addFromBegining(55);
 cll.printList();
 cll.showheadntail();
 }
}