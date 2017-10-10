import model.ListNode;

//Can be rewritten using recursion

public class AddTwoNumbersLeetCode {
    public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        ListNode tempNode = new ListNode(0);
        ListNode resultNode = tempNode;
        int carryForward = 0;
        int addition;

        while((firstList != null) || (secondList != null)){
            if(firstList==null){
                addition = secondList.val +carryForward;
                secondList =  secondList.next;
            }
            else if(secondList==null){
                addition = firstList.val +carryForward;
                firstList = firstList.next;
            }
            else{
                addition = firstList.val + secondList.val + carryForward;
                firstList = firstList.next;
                secondList = secondList.next;
            }

            int[] additionResult = extractAdditionAndCarryForward(addition);
            addition = additionResult[0];
            carryForward = additionResult[1];
            tempNode.next = new ListNode(addition);
            tempNode= tempNode.next;
        }

        if(carryForward==1){
            tempNode.next = new ListNode(1);
        }

        return resultNode.next;
    }

    private int[] extractAdditionAndCarryForward(int addition){
        int carryForward;
        if(addition >=10 ){
            carryForward = 1;
            addition -= 10;
        }
        else{
            carryForward = 0;
        }
        return new int[] {addition, carryForward};
    }
}
