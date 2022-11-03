/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
    
    dummy := new(ListNode);
    head := dummy;
    
    if(list1 == nil) {
        return list2   
    }
    
    if(list2 == nil) {
        return list1
    }
    
    for list1 != nil && list2 != nil {
        if(list1.Val <= list2.Val) {
            head.Next = list1
            list1 = list1.Next
        } else if(list1.Val >= list2.Val) {
            head.Next = list2
            list2 = list2.Next
        }
        head = head.Next
    }
    
    if(list1 != nil) {
        head.Next = list1
    } else {
        head.Next = list2
    }
        
    return dummy.Next
}