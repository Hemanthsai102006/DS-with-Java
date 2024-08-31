package singlelinkedlist;
import java.util.NoSuchElementException;
public class SingleLinkedList {
 private class Node {
 private final int value;
 private Node next;
 public Node(int value) {
 this.value = value;
 }
 }
 private Node head;
 private Node tail;
 private int size;
 public void addLast(int item) {
 var node = new Node(item);
 if (isEmpty()) {
 head = tail = node;
 } else {
 tail.next = node;
 tail = node;
 }
 size++;
 }
 public void addFirst(int item) {
 var node = new Node(item);
 if (isEmpty()) {
 head = tail = node;
 } else {
 node.next = head;
 head = node;
 }
 size++;
 }
 private boolean isEmpty() {
 return head == null;
 }
 public void removeFirst() {
 if (isEmpty()) {
 throw new NoSuchElementException();
 }
 if (head == tail) {
 head = tail = null;
 } else {
 var second = head.next;
 head.next = null;
 head = second;
 }
 size--;
 }
 public void removeLast() {
 if (isEmpty()) {
 throw new NoSuchElementException();
 }
 if (head == tail) {
 head = tail = null;
 } else {
 var previous = getPrevious(tail);
 tail = previous;
 tail.next = null;
 }
 size--;
 }
 private Node getPrevious(Node node) {
 var current = head;
 while (current != null) {
 if (current.next == node) {
 return current;
 }
 current = current.next;
 }
 return null;
 }
 public int size() {
 return size;
 }
 public void show() {
 Node temp;
 temp = head;
 while (temp != null) {
 System.out.print(temp.value + "-->");
 temp = temp.next;
 }
 System.out.print("null");
 System.out.println("\n");
 }
 public void headntail() {
 System.out.println("head ---> " + head.value);
 System.out.println("tail ---> " + tail.value);
 }
 public static void main(String[] args) {
 SingleLinkedList l1 = new SingleLinkedList();
 l1.addFirst(1);
 l1.addFirst(2);
// l1.addFirst(2);
// l1.addFirst(33);
// l1.addFirst(22);
// l1.show();
// System.out.println();
// l1.removeFirst();
// l1.show();
// System.out.println();
// l1.removeLast();
// l1.show();
// l1.removeFirst();
 l1.show();
 l1.headntail();
 }
}