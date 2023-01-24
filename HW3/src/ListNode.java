import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListNode implements Iterable<Integer> {
    int val;
    ListNode head;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }

    public static ListNode addFirst(int value) {
        ListNode listNode = new ListNode(value);
        listNode.head = listNode;
        if (listNode.next != null)
            listNode.next.head = null;
        return listNode;
    }

    public static ListNode removeFirst(ListNode listNode) {
        if (listNode.head != null) {
            listNode.next.head = listNode.next;
            listNode.head = null;
        }
        return listNode;
    }

    public static void revertListNode(ListNode listNode, ListNode previousListNode){
        if (listNode.head == null || listNode.next == null)
            return;
        if (listNode.next == null){
            listNode.head = listNode;
        } else {
            revertListNode(listNode.next, listNode);
        }
        listNode.next = previousListNode;
        previousListNode.next = null;
    }
}

