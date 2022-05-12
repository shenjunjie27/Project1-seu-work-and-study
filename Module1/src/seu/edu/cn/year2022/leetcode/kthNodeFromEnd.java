package seu.edu.cn.year2022.leetcode;

public class kthNodeFromEnd {
    public static class ListNode {
        int val;
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
    }

    public static ListNode kthNodeFromEnd(ListNode head, int kthNode) {
        if (kthNode <= 0 || head == null)
            return null;
        ListNode pTemp = head, pKthNode = null;
        for (int count = 1; count < kthNode; count++) {
            if (pTemp != null)
                pTemp = pTemp.next;
        }
        while (pTemp != null) {
            if (pKthNode == null)
                pKthNode = head;
            else pKthNode = pKthNode.next;
            pTemp = pTemp.next;
        }
        if (pKthNode != null)
            return pKthNode;
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(6);

    }
}
