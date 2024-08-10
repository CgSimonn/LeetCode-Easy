public class main {
    public class ListNode {
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

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    // public class ListNode {
    // int val;
    // ListNode next;

    // public int getValue() {
    // return this.val;
    // }

    // ListNode() {
    // }

    // ListNode(int val) {
    // this.val = val;
    // }

    // ListNode(int val, ListNode next) {
    // this.val = val;
    // this.next = next;
    // }
    // }

    class Solution {

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(); // store the head of the listnode
            ListNode list = dummy;

            if (list1 == null) {
                while (list2 != null) {
                    list.next = new ListNode(list2.val);
                    list2 = list2.next;
                    list = list.next;
                }
            }
            if (list2 == null) {
                while (list1 != null) {
                    list.next = new ListNode(list1.val);
                    list1 = list1.next;
                    list = list.next;
                }
            }

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    list.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    list.next = new ListNode(list2.val);
                    list2 = list2.next;
                }

                list = list.next;
            }
            list.next = list1 != null ? list1 : list2;
            return dummy.next;

        }
    }

    public static void main(String[] args) {

    }
}
