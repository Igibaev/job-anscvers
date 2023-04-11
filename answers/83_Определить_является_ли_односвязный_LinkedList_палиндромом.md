```java
public class test {
    public boolean isLinkedListPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.val != stack.pop()) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

}
```