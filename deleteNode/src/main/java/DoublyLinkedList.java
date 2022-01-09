public class DoublyLinkedList {
  public static void deleteNode(ListNode node) {
    // write code here
    ListNode nextNode = node.next;
    ListNode prevNode = node.prev;
    nextNode.prev = prevNode;
    prevNode.next = nextNode;

  }
}
