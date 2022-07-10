package CurrencyDenomination;

public class Currency {

    public void findDenominations(int[] denomination, int amount) {
        int[] countArr = new int[denomination.length];

// counting the denominations to pay the required amount
        for(int i=0; i<denomination.length; i++) {
            if(denomination[i] <= amount){
                countArr[i] = amount/denomination[i];
                amount = amount%denomination[i];
                if(amount==0){
                    break;
                }
            }
        }
        if(amount!=0){
            System.out.println("Transaction cannot be done");
        }
        else{
            for(int i=0; i<countArr.length ; i++){
                if(countArr[i] !=0){
                    System.out.println(denomination[i] + ":" + countArr[i]);
                }
            }
        }
    }
}
