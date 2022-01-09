import java.util.LinkedList;

public class DoublyLinkedList {
  public static void insertNode(ListNode previous, ListNode newNode) {
    // write code here
    ListNode listNode = previous.next;
    newNode.prev = previous;
    newNode.next = listNode;
    previous.next = newNode;
    listNode.prev = newNode;
    }
  }

