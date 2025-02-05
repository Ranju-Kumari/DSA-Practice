public static ReverseLinkedList reverseList(ReverseLinkedList head){

        // We'll need to use 3 pointers/variables to reverse the list
        // 1. prev: This will keep track of the previous node we processed (starts as null).
        // 2. next: This will keep track of the next node to process.
        // 3. curr: This is the current node we are processing (starts as the head of the list).
        ReverseLinkedList prev = null;
        ReverseLinkedList next = null;
        ReverseLinkedList curr = head;

        /*If there is no node or only one node is there
         if(head == null || head.next == null){
            return head;
         }*/
        
        // We loop through the linked list until we reach the end (when curr is null).
        while (curr != null) {
            // Store the next node in the list. We need to do this because we will change the current node's next pointer.
            next = curr.next;

            // Reverse the link. Instead of pointing to the next node, the current node now points to the previous node.
            curr.next = prev;

            // Move the previous pointer to the current node (since the current node is now processed).
            prev = curr;

            // Move the current pointer to the next node (to continue processing the rest of the list).
            curr = next;
        }

        // When we've processed all nodes, the prev pointer will be at the new head of the reversed list.
        return prev;

    }
