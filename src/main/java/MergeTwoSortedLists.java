/**
 * Merge two sorted linked lists and return it as a new sorted list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode newList = null;
        while (l1 != null && l2 != null) {
            if (l2.val <= l1.val) {
                if (newList == null)
                    newList = new ListNode(l2.val);
                else
                    appendSingleNodeToNewList(newList, l2);

                l2 = l2.next;
            }
            else {
                if (newList == null)
                    newList = new ListNode(l1.val);
                else
                    appendSingleNodeToNewList(newList, l1);

                l1 = l1.next;
            }
        }

        if (l1 == null) appendListToNewList(newList, l2);
        if (l2 == null) appendListToNewList(newList, l1);

        return newList;
    }

    private void appendSingleNodeToNewList(ListNode newList, ListNode node) {
        if(newList.next == null) {
            newList.next = new ListNode(node.val);
        }
        else {
            appendSingleNodeToNewList(newList.next, node);
        }
    }

    private void appendListToNewList(ListNode newList, ListNode list) {
        if (list == null) return;

        if(newList.next == null) {
            newList.next = list;
        }
        else {
            appendListToNewList(newList.next, list);
        }

    }

    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode newList = m.mergeTwoLists(l1, l2);

        newList = m.mergeTwoLists(null, l2);
        newList = m.mergeTwoLists(l1, null);
        newList = m.mergeTwoLists(null, null);

        l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        l2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(9)))));
        newList = m.mergeTwoLists(l1, l2);

        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
