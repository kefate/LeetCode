/**
 * Function: .
 * Date:     2018/4/11 17:50
 *
 * @author kefate
 * @since JDK 1.8
 */
public class AddTwoNumbers {
    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     *             Example
     *
     *     Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     *     Output: 7 -> 0 -> 8
     *     Explanation: 342 + 465 = 807.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int sum = 0;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            cur.next = new ListNode(sum % 10);
            sum /= 10;
            cur = cur.next;
        }
        if (sum == 1) {
            cur.next = new ListNode(1);
        }
        return res.next;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {val = x;};
}