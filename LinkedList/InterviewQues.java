package LinkedList;

public class InterviewQues {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode mid = middleNode(head);

        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;

        while(headFirst != null && headSecond != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        if(headFirst != null){
            headFirst.next = null;
        }

    }

    public ListNode reverseList(ListNode head) {
		if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
	}

	public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        // skip the first left - 1 nodes
        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;

        // reverse between left and right
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }


        if(last != null){
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;

        return head;

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);
		int count = length / k;

        while(count > 0){    
            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;
    
            // reverse between left and right
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
    
    
            if(last != null){
                last.next = prev;
            } else {
                head = prev;
            }
    
            newEnd.next = current;
            if(current  == null){
                break;
            }
            prev = newEnd;
            count--;
        }
        return head;
    }

    public int getLength(ListNode head) {
		ListNode node = head;
		int length = 0;
		while (node != null) {
			length++;
			node = node.next;
		}
		return length;
	}

    public ListNode reverseAlternateKGroup(ListNode head, int k){
        if(k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);

        while(current != null){    
            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;
    
            // reverse between left and right
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
    
    
            if(last != null){
                last.next = prev;
            } else {
                head = prev;
            }
    
            newEnd.next = current;
            // skip k nodes
            for (int i = 0; i < k && current != null; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k== 0) return head;

        ListNode last = head;
        int len = 1;
        while(last.next != null){
            last = last.next;
            len++;
        }
        last.next = head;
        int rotations = k%len;
        int skip = len - rotations;
        ListNode newLast = head;
        for (int i = 0; i < skip-1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

}
