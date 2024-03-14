# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, N: Optional[ListNode], M: Optional[ListNode]) -> Optional[ListNode]:
        '''head = ListNode
        temp1,temp2,temp3=l1,l2,head
        while(temp1!=None and temp2!=None):
            if(temp1.val<=temp2.val):
                temp3.next=temp1
                temp1=temp1.next
            else :
                temp3.next=temp2
                temp2=temp2.next
        temp3 = temp3.next
        if(temp1!=None):
            temp3.next=temp1
        if(temp2!=None):
            temp3.next=temp2
        head=head.next
        return head'''
        head = curr = ListNode(0)
        while N and M:
            if N.val < M.val:
                curr.next, N = N, N.next
            else:
                curr.next, M = M, M.next
            curr = curr.next
        curr.next = N or M
        return head.next
        
            
    