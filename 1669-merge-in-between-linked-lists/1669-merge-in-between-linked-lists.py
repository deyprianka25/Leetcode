# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        '''ListNode start = None
         ListNode end = list1
         for(index = 0,index<b,index++):
            if(index == a-1):
                start = end
            
            end = end.next
        
        start.next = list2
        while(list2.next!=None):
            list2 = list2.next
        
        list2.next = end.next
        end.next = None
        return list1'''
        curr = list1
        i = 0
        while(i<a-1):
            curr = curr.next
            i+=1
        head = curr
        while(i<=b):
            curr = curr.next
            i+=1
        head.next = list2
        while list2.next:
            list2 = list2.next
        list2.next = curr
        return list1
            
        
        
        
    

        