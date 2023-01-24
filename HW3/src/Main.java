public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode.addFirst(2);
        ListNode.revertListNode(new ListNode(3), new ListNode(4));
        listNode = ListNode.removeFirst(listNode);
    }
}

