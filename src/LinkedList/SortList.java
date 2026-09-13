package LinkedList;

public class SortList {
    public static ListNode sortList(ListNode head) {
    ListNode temp = head;
    int cnt = 0;

        if(temp == null || temp.next == null){
        return temp;
    }
        while(temp != null){
        cnt++;
        temp = temp.next;
    }

        for(int i = 0; i<cnt; i++){

        while(true){
            temp = head;
            if(temp.val > temp.next.val){
                int x = temp.val;
                temp.val = temp.next.val;
                temp.next.val = x;
            }
            temp = temp.next;
        }
    }
        return head;
}
}

